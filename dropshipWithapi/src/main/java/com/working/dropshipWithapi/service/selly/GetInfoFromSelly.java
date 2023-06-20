package com.working.dropshipWithapi.service.selly;

import com.working.dropshipWithapi.modelSelly.SellyInfoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

@Service
public class GetInfoFromSelly {
  @Autowired
  private RestTemplate restTemplate;
  public SellyInfoResponse getInfoFromSelly() {
    //RestTemplate restTemplate = new RestTemplate();
    String fooResourceUrl = "https://app-api.selly.vn/products?limit=1&page=0&total=0&nextPageToken=&isAvailable=true&keyword=quan%20lung%20nam";
    ResponseEntity<SellyInfoResponse> response = restTemplate.getForEntity(fooResourceUrl + "/1",
        SellyInfoResponse.class);
    return response.getBody();
  }

  public void getImageAsFile(String imagesUrl) {
    RestTemplate restTemplate = new RestTemplate();
    String destinationPath = "D:/NghiaNguyen/dropShipWithApi/dropshipWithapi/dropshipWithapi/image.jpg";
    ResponseEntity<byte[]> response = restTemplate.getForEntity(imagesUrl, byte[].class);
    byte[] imageBytes = response.getBody();
    try (FileOutputStream fos = new FileOutputStream(destinationPath)) {
      fos.write(imageBytes);
      System.out.println("Image downloaded successfully.");
    } catch (IOException e) {
      System.out.println("Error saving image: " + e.getMessage());
    }
  }

  public static void main(String[] args) {
    RestTemplate restTemplate = new RestTemplate();
    /*String fooResourceUrl
        = "https://app-api.selly.vn/products?limit=1&page=0&total=0&nextPageToken=&isAvailable=true&keyword=quan%20lung%20nam";
    ResponseEntity<SellyInfoResponse> response
        = restTemplate.getForEntity(fooResourceUrl + "/1", SellyInfoResponse.class);
    System.out.println("respones: "+response.getBody().toString());*/
    //getImageAsFile("https://media.sellycdn.net/files/md_2023_03_29_07_02_38_0700_PcSfjroPdF.jpg");
  }
}
