package com.working.dropshipWithapi.service.selly;

import com.working.dropshipWithapi.modelSelly.SellyInfoResponse;
import com.working.dropshipWithapi.service.common.CommonConstant;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URI;
import java.util.function.Function;
import java.util.stream.Stream;

@Service
public class GetInfoFromSelly extends CommonConstant {

  @Value("${selly.bearerToken}")
  private String sellyToken;

  @Value("${selly.service.downloadImage.imageFolder}")
  private String sellyImageFolder;

  @Autowired
  private RestTemplate restTemplate;

  private Function<String, String> buildKeyword(){
    return key-> key.replace(StringUtils.SPACE, "%20");
  }

  public SellyInfoResponse getInfoFromSelly(String searchTerm) {
    // Create the request headers
    HttpHeaders headers = new HttpHeaders();
    headers.setBearerAuth(sellyToken);
    headers.setContentType(MediaType.APPLICATION_JSON);

    String keyword = StringUtils.defaultIfBlank(buildKeyword().apply(searchTerm), StringUtils.EMPTY);
    String fooResourceUrl = "https://app-api.selly.vn/products?limit=20&page=0&total=0&nextPageToken=&keyword="+keyword+"&isAvailable=true&pageToken=eyJwYWdlIjowfQ%3D%3D";
    // Create the request entity with headers
    RequestEntity<Void> requestEntity = new RequestEntity<>(headers, HttpMethod.GET, URI.create(fooResourceUrl));

    // Send the request and retrieve the response
    ResponseEntity<SellyInfoResponse> response = restTemplate.exchange(requestEntity, SellyInfoResponse.class);

    // Process the response
    if (response.getStatusCode().is2xxSuccessful()) {
      SellyInfoResponse responseBody = response.getBody();
      System.out.println("responseBody: "+responseBody.getData().getProducts().size());

      return responseBody;
    } else {
      System.err.println("Request failed with status code: " + response.getStatusCodeValue());
    }
    return response.getBody();
  }

  private Function<String, String> getImageNameFromUrl() {
    return imgUrl -> {
      String[] partUrl = imgUrl.split(CommonConstant.SLASH);
      return Stream.of(partUrl).filter(
          s -> StringUtils.isNotBlank(s) && s.contains(CommonConstant.JPEG) || s.contains(CommonConstant.JPG)
              || s.contains(CommonConstant.PNG)).findFirst().get();
    };
  }

  public String getImageAsFile(String imagesUrl) {
    String imageName = getImageNameFromUrl().apply(imagesUrl);
    String endFile = Stream.of(imageName.split("[.]")).filter(s->!s.contains("_")).findFirst().get();
    RestTemplate restTemplate = new RestTemplate();
    String destinationPath = sellyImageFolder + imageName;
    ResponseEntity<byte[]> response = restTemplate.getForEntity(imagesUrl, byte[].class);
    byte[] imageBytes = response.getBody();
    try (FileOutputStream fos = new FileOutputStream(destinationPath)) {
      fos.write(imageBytes);
      System.out.println("Image downloaded successfully." + imageName);
    } catch (IOException e) {
      System.out.println("Error saving image: " + e.getMessage());
    }
    return imageName;
  }
}
