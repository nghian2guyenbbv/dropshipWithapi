package com.working.dropshipWithapi.service.shopee.request;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Data
@Builder
public class CreateProductCriteria {
  private String productName;
  private String description;
  private int price = 500000;
  private List<String> shareImages;

}
