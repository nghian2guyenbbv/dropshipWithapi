package com.working.dropshipWithapi.service.shopee.createProduct;

import com.working.dropshipWithapi.service.selly.GetInfoFromSelly;
import com.working.dropshipWithapi.service.shopee.ShopeeService;
import com.working.dropshipWithapi.service.shopee.request.CreateProductCriteria;
import com.working.dropshipWithapi.service.shopee.response.CreateProductShopeeResponse;
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
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;

import java.io.File;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class CreateProductService {

  private static final String COOKIE = "Cookie";
  private static final String CONTENT_TYPE = "content-type";

  @Autowired
  private GetInfoFromSelly getInfoFromSelly;

  @Value("${shopee.createProduct.url}")
  private String createProductUrl;
  @Value("${shopee.createProduct.cookie}")
  private String createProductCookie;

  @Autowired
  private ShopeeService shopeeService;
  public static String createProductBody = "[\n" + "    {\n" + "        \"id\": 0,\n"
      + "        \"name\": \"adsassdasdsdasdsasdsda\",\n" + "        \"brand_id\": 0,\n" + "        \"images\": [\n"
      + "            \"vn-11134207-7qukw-lj89mb12dxjg3b\"\n" + "        ],\n" + "        \"long_images\": [],\n"
      + "        \"description\": \"adsassdasdsdasdsasdsdaadsassdasdsdasdsasdsdaadsassdasdsdasdsasdsdaadsassdasdsdasdsasdsdaadsassdasdsdasdsasdsdaadsassdasdsdasdsasdsdaadsassdasdsdasdsasdsdaadsassdasdsdasdsasdsdaadsassdasdsdasdsasdsda\",\n"
      + "        \"description_type\": \"normal\",\n" + "        \"model_list\": [\n" + "            {\n"
      + "                \"id\": 0,\n" + "                \"tier_index\": [\n" + "                    0\n"
      + "                ],\n" + "                \"is_default\": true,\n"
      + "                \"name\": \"adsassdasdsdasdsasdsda\",\n" + "                \"price\": \"500000\",\n"
      + "                \"item_price\": \"\",\n" + "                \"stock_setting_list\": [\n"
      + "                    {\n" + "                        \"sellable_stock\": 1\n" + "                    }\n"
      + "                ]\n" + "            }\n" + "        ],\n" + "        \"category_path\": [\n"
      + "            100011,\n" + "            100053\n" + "        ],\n" + "        \"attributes\": [\n"
      + "            {\n" + "                \"attribute_id\": 100169,\n"
      + "                \"attribute_value_id\": 1497\n" + "            },\n" + "            {\n"
      + "                \"attribute_id\": 100177,\n" + "                \"attribute_value_id\": 1587\n"
      + "            }\n" + "        ],\n" + "        \"parent_sku\": \"\",\n" + "        \"wholesale_list\": [],\n"
      + "        \"installment_tenures\": {},\n" + "        \"weight\": \"500\",\n" + "        \"dimension\": {\n"
      + "            \"width\": 0,\n" + "            \"height\": 0,\n" + "            \"length\": 0\n" + "        },\n"
      + "        \"pre_order\": false,\n" + "        \"days_to_ship\": 2,\n" + "        \"condition\": 1,\n"
      + "        \"size_chart\": \"\",\n" + "        \"size_chart_id\": 0,\n" + "        \"video_list\": [],\n"
      + "        \"tier_variation\": [\n" + "            {\n" + "                \"name\": \"\",\n"
      + "                \"options\": [\n" + "                    \"\"\n" + "                ],\n"
      + "                \"images\": []\n" + "            }\n" + "        ],\n"
      + "        \"enable_model_level_dts\": false,\n" + "        \"price\": \"500000\",\n" + "        \"stock\": 1,\n"
      + "        \"logistics_channels\": [\n" + "            {\n" + "                \"size\": 0,\n"
      + "                \"price\": \"16500\",\n" + "                \"cover_shipping_fee\": false,\n"
      + "                \"enabled\": true,\n" + "                \"item_flag\": \"0\",\n"
      + "                \"channelid\": 5001,\n" + "                \"sizeid\": 0\n" + "            },\n"
      + "            {\n" + "                \"size\": 0,\n" + "                \"price\": \"14175\",\n"
      + "                \"cover_shipping_fee\": false,\n" + "                \"enabled\": true,\n"
      + "                \"item_flag\": \"0\",\n" + "                \"channelid\": 5002,\n"
      + "                \"sizeid\": 0\n" + "            }\n" + "        ],\n" + "        \"ds_cat_rcmd_id\": \"\",\n"
      + "        \"category_recommend\": [],\n"
      + "        \"ds_attr_rcmd_id\": \"06f5fd32-9416-49a1-bb8d-abdf45a487ce\",\n" + "        \"unlisted\": false\n"
      + "    }\n" + "]";

  private List<Path> getListImgPath() {
    String folderImagePath = "D:/NghiaNguyen/dropShipWithApi/dropshipWithapi/dropshipWithapi/imageFromSelly";
    List<Path> filePaths = Collections.emptyList();
    try {
      filePaths = Files.list(Path.of(folderImagePath)).filter(Files::isRegularFile).map(file -> file.toAbsolutePath())
          .collect(Collectors.toList());
      filePaths.stream().map(path -> path.toString()).forEach(System.out::println);
    } catch (Exception ex) {
      ex.printStackTrace();
    }
    return filePaths;
  }

  public void createProduct(CreateProductCriteria createProductCriteria) {
    RestTemplate restTemplate = new RestTemplate();
    // Create HttpHeaders and add the cookie
    HttpHeaders headers = new HttpHeaders();
    headers.add(COOKIE, createProductCookie);
    headers.add(CONTENT_TYPE, "application/json;charset=UTF-8");
    List<String> listImageName = new ArrayList<>();
    List<String> listImageKey = null;
    for (String imgUrl : createProductCriteria.getShareImages()) {
      System.out.println("-----get image ----" + imgUrl);
      // get Image from selly
      getInfoFromSelly.getImageAsFile(imgUrl);
      List<Path> listImagePath = getListImgPath();
      //listImagePath.forEach(imgPath-> System.out.println("imagePath: "+imgPath));
      //List<String> listImageKey = Arrays.asList("vn-07162023-ACTIVE_MEN_PLUS_HỖ_TRỢ_TĂNG_CƯỜNG_SINH_LỰC_NAM_GIỚI,_KÉO_DÀI_THỜI_GIAN_QUAN_HỆ_HỘP_30_VIÊN_-_DOPPELHERZ_3", "vn-07162023-ACTIVE_MEN_PLUS_HỖ_TRỢ_TĂNG_CƯỜNG_SINH_LỰC_NAM_GIỚI,_KÉO_DÀI_THỜI_GIAN_QUAN_HỆ_HỘP_30_VIÊN_-_DOPPELHERZ_4");
      listImageKey = shopeeService.uploadImagesToShopee(imgUrl, listImagePath);
      listImageKey.stream().forEach(System.out::println);
      /* remove all file in selly image folder*/
    }
    // Upload images get keys
    // Create a RequestEntity with the headers
    String updatedBody = CommonCreateProduct.updateProductInfo(createProductCriteria.getProductName(),
        createProductCriteria.getDescription(), listImageKey, createProductBody);
    RequestEntity<String> requestEntity = new RequestEntity<String>(
        Optional.ofNullable(updatedBody).isPresent() ? updatedBody : StringUtils.EMPTY, headers, HttpMethod.POST,
        URI.create(createProductUrl));
    ResponseEntity<CreateProductShopeeResponse> response = restTemplate.exchange(requestEntity,
        CreateProductShopeeResponse.class);
    Optional.ofNullable(response).ifPresent(rs -> System.out.println(rs.getBody().getMessage()));
  }

  private static String updateProductName(String itemName, String rawBody) {
    try {
      JSONArray jsonArray = new JSONArray(rawBody);
      JSONObject jsonObject = jsonArray.getJSONObject(0);
      String itemNameJson = jsonObject.getString("name");

      // Update the value using StringUtils
      String updatedName = StringUtils.capitalize(itemNameJson); // Example transformation
      jsonObject.put("name", itemName);

      // Convert back to string
      //return jsonArray.toString();
      String jsonString = jsonArray.toString();
      byte[] utf8Bytes = jsonString.getBytes(java.nio.charset.StandardCharsets.UTF_8);
      return new String(utf8Bytes, java.nio.charset.StandardCharsets.UTF_8);
    } catch (JSONException e) {
      e.printStackTrace();
    }
    return StringUtils.EMPTY;
  }


}
