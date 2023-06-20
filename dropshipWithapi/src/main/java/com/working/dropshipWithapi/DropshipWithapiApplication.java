package com.working.dropshipWithapi;

import com.working.dropshipWithapi.modelSelly.Brand;
import com.working.dropshipWithapi.modelSelly.Product;
import com.working.dropshipWithapi.modelSelly.SellyInfoResponse;
import com.working.dropshipWithapi.service.selly.GetInfoFromSelly;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.lang.reflect.GenericArrayType;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@SpringBootApplication
public class DropshipWithapiApplication {

  public static void main(String[] args) {

    ApplicationContext context = SpringApplication.run(DropshipWithapiApplication.class, args);
    GetInfoFromSelly sellyInfo = context.getBean(GetInfoFromSelly.class);
    //SellyInfoResponse response = sellyInfo.getInfoFromSelly();
        sellyInfo.getImageAsFile("https://media.sellycdn.net/files/md_2023_03_29_07_02_38_0700_PcSfjroPdF.jpg");
    //List<Brand> branch = response.getData().getProducts().stream().map(Product::getBrand).collect(Collectors.toList());
    //branch.stream().filter(Objects::nonNull).forEach(br -> System.out.println(br.getDesc()));
  }

}
