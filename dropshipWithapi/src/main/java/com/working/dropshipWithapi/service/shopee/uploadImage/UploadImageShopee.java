package com.working.dropshipWithapi.service.shopee.uploadImage;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.File;

@Getter
@Setter
@Data
@Builder
public class UploadImageShopee {
  private File file;
  private String token;

  private String key;
  private String mimeType = "image/jpeg";
}
