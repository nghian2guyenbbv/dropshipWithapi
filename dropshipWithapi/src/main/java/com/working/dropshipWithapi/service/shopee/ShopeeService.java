package com.working.dropshipWithapi.service.shopee;

import com.working.dropshipWithapi.service.shopee.createProduct.CreateProductService;
import com.working.dropshipWithapi.service.shopee.response.CreateProductShopeeResponse;
import com.working.dropshipWithapi.service.shopee.uploadImage.UploadImageShopee;
import com.working.dropshipWithapi.service.util.Utils;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
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
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class ShopeeService {

  @Autowired
  private Utils utils;

  @Autowired
  private CreateProductService createProductService;

  public void createShopeeProduct(){
    createProductService.createProduct();
  };

  public List<String> uploadImagesToShopee() {
    String folderImagePath = "C:/Users/nghia2nguyen/Pictures/upload_image_folder";
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
      String rp = createProductService.uploadImageIntoShopee(path.toFile().getName()).apply(path.toString());
      if (!StringUtils.EMPTY.equalsIgnoreCase(rp)) {
        listKeysImage.add(rp);
      }
    });
    return listKeysImage;
  }

}
