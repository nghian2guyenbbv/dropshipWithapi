package com.working.dropshipWithapi.service.selly;

import com.working.dropshipWithapi.modelSelly.SellyInfoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GetInfoFromSelly {
  /*@Autowired
  private RestTemplate restTemplate;*/
  public SellyInfoResponse getInfoFromSelly() {
    RestTemplate restTemplate = new RestTemplate();
    String fooResourceUrl = "https://app-api.selly.vn/products?limit=1&page=0&total=0&nextPageToken=&isAvailable=true&keyword=quan%20lung%20nam";
    ResponseEntity<SellyInfoResponse> response = restTemplate.getForEntity(fooResourceUrl + "/1",
        SellyInfoResponse.class);
    return response.getBody();
  }



  public static void main(String[] args) {
    RestTemplate restTemplate = new RestTemplate();
    String fooResourceUrl
        = "https://app-api.selly.vn/products?limit=1&page=0&total=0&nextPageToken=&isAvailable=true&keyword=quan%20lung%20nam";
    ResponseEntity<SellyInfoResponse> response
        = restTemplate.getForEntity(fooResourceUrl + "/1", SellyInfoResponse.class);
    System.out.println("respones: "+response.toString());
  }
}
