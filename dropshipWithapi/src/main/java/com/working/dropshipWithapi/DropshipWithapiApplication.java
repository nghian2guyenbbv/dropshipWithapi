package com.working.dropshipWithapi;

import com.working.dropshipWithapi.modelSelly.Brand;
import com.working.dropshipWithapi.modelSelly.Product;
import com.working.dropshipWithapi.modelSelly.SellyInfoResponse;
import com.working.dropshipWithapi.service.selly.GetInfoFromSelly;
import com.working.dropshipWithapi.service.shopee.ShopeeService;
import com.working.dropshipWithapi.service.shopee.createProduct.CreateProductService;
import com.working.dropshipWithapi.service.shopee.request.CreateProductCriteria;
import org.apache.commons.lang3.StringUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.lang.reflect.GenericArrayType;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@SpringBootApplication
public class DropshipWithapiApplication {

  public static void main(String[] args) {
    String searchKeys = "bong ro";
    ApplicationContext context = SpringApplication.run(DropshipWithapiApplication.class, args);
    GetInfoFromSelly sellyInfo = context.getBean(GetInfoFromSelly.class);
    ShopeeService shopeeService = context.getBean(ShopeeService.class);
    CreateProductService createProductService = context.getBean(CreateProductService.class);
    /*B1 get product info*/
    SellyInfoResponse response = sellyInfo.getInfoFromSelly(searchKeys);
    /*List<String> listImage = shopeeService.uploadImagesToShopee();
    listImage.stream().forEach(System.out::println);*/
    /*B2 Create list criteria product */
    List<CreateProductCriteria> listCriteria = new ArrayList<CreateProductCriteria>();
    response.getData().getProducts().forEach(pr->{
      CreateProductCriteria productCriteria = CreateProductCriteria.builder().productName(pr.getName()).description(
          StringUtils.defaultIfEmpty(pr.getShareDesc(), StringUtils.EMPTY)).shareImages(pr.getShareImages()).searchKey(searchKeys).build();
      listCriteria.add(productCriteria);
    });
    /*B3 Create product*/
     listCriteria.forEach(pr-> {
      createProductService.createProduct(pr);
    });
  }

}
