package com.working.dropshipWithapi.service.shopee;

import com.working.dropshipWithapi.service.shopee.createProduct.CreateProductService;
import com.working.dropshipWithapi.service.shopee.request.CreateProductCriteria;
import com.working.dropshipWithapi.service.shopee.response.CreateProductShopeeResponse;
import com.working.dropshipWithapi.service.shopee.uploadImage.UploadImageShopee;
import com.working.dropshipWithapi.service.util.Utils;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.tomcat.util.http.fileupload.FileUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class ShopeeService {

  @Autowired
  private Utils utils;

  @Value("${shopee.createProduct.uploadImage.token}")
  String tokenUpload;



  public List<String> uploadImagesToShopee() {
    String folderImagePath = "D:/NghiaNguyen/dropShipWithApi/dropshipWithapi/dropshipWithapi/imageFromSelly";
    List<Path> filePaths = Collections.emptyList();
    try {
      filePaths = Files.list(Path.of(folderImagePath)).filter(Files::isRegularFile)
          .map(file -> file.toAbsolutePath()).collect(Collectors.toList());
      filePaths.stream().map(path -> path.toString()).forEach(System.out::println);
    } catch (Exception ex) {
      ex.printStackTrace();
    }
    List<String> listKeysImage = new ArrayList<String>();
    CollectionUtils.emptyIfNull(filePaths).stream().forEach(path->{
      String rp = uploadImageIntoShopee(path.toFile().getName()).apply(path.toString());
      if (!StringUtils.EMPTY.equalsIgnoreCase(rp)) {
        listKeysImage.add(rp);
      }
    });
    removeImageInfolder().accept(folderImagePath);
    return listKeysImage;
  }

  private Consumer<String> removeImageInfolder() {
    return folderPath -> {
      File folder = new File(folderPath);
      if (folder.exists() && folder.isDirectory()) {
        try {
          FileUtils.cleanDirectory(folder);
        } catch (IOException ex) {
          System.out.println("can't delete file " + ex);
        }
      }

    };
  }

  public Function<String, String> uploadImageIntoShopee(String fileName) {
    String[] fileN = fileName.split("\\.");
    String key = "vn-07162023-"+ fileN[0];
    String urlUpload = "https://upload.ws.img.shopee.com/file/upload";
    RestTemplate restTemplate = new RestTemplate();
    return fileToUPload -> {
      File imageF = new File(fileToUPload);
      System.out.println("imageF: " + imageF.getAbsolutePath());
      HttpHeaders headers = new HttpHeaders();
      headers.add("Origin", "https://banhang.shopee.vn");
      // Create the MultiValueMap to hold the form data
      MultiValueMap<String, Object> body = new LinkedMultiValueMap<>();

      // Add the binary file to the form data
      body.add("file", new FileSystemResource(imageF));
      body.add("token", tokenUpload);
      body.add("key", key);
      body.add("mimeType", "image/jpeg");
      // Create the RequestEntity with the form data and headers
      RequestEntity<MultiValueMap<String, Object>> requestEntity = new RequestEntity<>(body, headers, HttpMethod.POST,
          URI.create(urlUpload));
      boolean isUploadSucess = false;
      try {
        ResponseEntity<String> response = restTemplate.exchange(requestEntity, String.class);
      } catch (HttpServerErrorException ex) {
        isUploadSucess = ex.getStatusCode()!=null && ex.getMessage().contains("hash");
      }
      return isUploadSucess ? key : StringUtils.EMPTY;
    };
  }

}
