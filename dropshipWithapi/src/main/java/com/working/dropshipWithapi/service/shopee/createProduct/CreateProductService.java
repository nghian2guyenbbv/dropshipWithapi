package com.working.dropshipWithapi.service.shopee.createProduct;

import com.working.dropshipWithapi.service.shopee.response.CreateProductShopeeResponse;
import org.apache.commons.lang3.StringUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
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
import java.util.Optional;
import java.util.function.Function;

@Service
public class CreateProductService {

  @Value("${shopee.createProduct.url}")
  private String createProductUrl;
  @Value("${shopee.createProduct.cookie}")
  private String createProductCookie;
  @Value("${shopee.createProduct.uploadImage.token}")
  String tokenUpload;
  public static String createProductBody = "[\n" + "    {\n" + "        \"id\": 0,\n" + "        \"name\": \"dswefsfefsefsefesddssasa\",\n"
      + "        \"brand_id\": 0,\n" + "        \"images\": [\n"
      + "            \"vn-11134207-7qukw-lih1t2hufaaa01\"\n" + "        ],\n" + "        \"long_images\": [],\n"
      + "        \"description\": \"dswefsfefsefsefesddsdswefsfefsefsefesddsdswefsfefsefsefesddsdswefsfefsefsefesddsdswefsfefsefsefesddsdswefsfefsefsefesdds\",\n"
      + "        \"description_type\": \"normal\",\n" + "        \"model_list\": [\n" + "            {\n"
      + "                \"id\": 0,\n" + "                \"tier_index\": [\n" + "                    0\n"
      + "                ],\n" + "                \"is_default\": true,\n"
      + "                \"name\": \"dswefsfefsefsefesdds\",\n" + "                \"price\": \"1000000\",\n"
      + "                \"item_price\": \"\",\n" + "                \"stock_setting_list\": [\n"
      + "                    {\n" + "                        \"sellable_stock\": 1\n" + "                    }\n"
      + "                ]\n" + "            }\n" + "        ],\n" + "        \"category_path\": [\n"
      + "            100011,\n" + "            100047\n" + "        ],\n" + "        \"attributes\": [],\n"
      + "        \"parent_sku\": \"\",\n" + "        \"wholesale_list\": [],\n"
      + "        \"installment_tenures\": {},\n" + "        \"weight\": \"800\",\n" + "        \"dimension\": {\n"
      + "            \"width\": 0,\n" + "            \"height\": 0,\n" + "            \"length\": 0\n"
      + "        },\n" + "        \"pre_order\": false,\n" + "        \"days_to_ship\": 2,\n"
      + "        \"condition\": 1,\n" + "        \"size_chart\": \"\",\n" + "        \"size_chart_id\": 0,\n"
      + "        \"video_list\": [],\n" + "        \"tier_variation\": [\n" + "            {\n"
      + "                \"name\": \"\",\n" + "                \"options\": [\n" + "                    \"\"\n"
      + "                ],\n" + "                \"images\": []\n" + "            }\n" + "        ],\n"
      + "        \"enable_model_level_dts\": false,\n" + "        \"price\": \"1000000\",\n"
      + "        \"stock\": 1,\n" + "        \"logistics_channels\": [\n" + "            {\n"
      + "                \"size\": 0,\n" + "                \"price\": \"14850\",\n"
      + "                \"cover_shipping_fee\": false,\n" + "                \"enabled\": true,\n"
      + "                \"item_flag\": \"0\",\n" + "                \"channelid\": 5002,\n"
      + "                \"sizeid\": 0\n" + "            },\n" + "            {\n" + "                \"size\": 0,\n"
      + "                \"price\": \"18300\",\n" + "                \"cover_shipping_fee\": false,\n"
      + "                \"enabled\": true,\n" + "                \"item_flag\": \"0\",\n"
      + "                \"channelid\": 5001,\n" + "                \"sizeid\": 0\n" + "            }\n"
      + "        ],\n" + "        \"ds_cat_rcmd_id\": \"\",\n" + "        \"category_recommend\": [],\n"
      + "        \"ds_attr_rcmd_id\": \"48a799f5-db08-4eda-b5d1-19cba4936423\",\n" + "        \"unlisted\": false\n"
      + "    }\n" + "]";
  public void createProduct() {

    //String createProductUrl = "https://banhang.shopee.vn/api/v3/product/create_product/?version=3.1.0&SPC_CDS=8d914e36-3942-41bf-982a-74708957794e&SPC_CDS_VER=2";
    RestTemplate restTemplate = new RestTemplate();
    // Create HttpHeaders and add the cookie
    HttpHeaders headers = new HttpHeaders();
    /*headers.add("Cookie",
        "SPC_F=RIl4pQ7UBsEtWaey2oOtSKyIiI6FrSdg; REC_T_ID=6b00daf9-9732-11ed-8ad5-3473791746da; _fbp=fb.1.1674047835635.1752225705; _hjSessionUser_868286=eyJpZCI6ImJhZTdiMzhkLTI5YjUtNThkNy05MTBkLTdhYzI0ODJkNWZkYyIsImNyZWF0ZWQiOjE2NzQwNDc4MzcwMzAsImV4aXN0aW5nIjp0cnVlfQ==; SPC_CLIENTID=UklsNHBRN1VCc0V0prmgntzfdxakaggj; SC_DFP=LavZGLmkKaNSajRDXUVUDROAuSKcPlnV; _ga_3XVGTY3603=GS1.1.1674094914.1.1.1674098158.60.0.0; _gcl_au=1.1.1676276854.1682180439; _med=refer; fulfillment-language=vi; SPC_CDS=8d914e36-3942-41bf-982a-74708957794e; SPC_SC_SA_TK=; SPC_SC_SA_UD=; SPC_SI=N2CRZAAAAABpaFEwYnpEYbcLvAAAAAAASlgzeldGUHE=; _gid=GA1.2.1327155736.1687763768; _ga=GA1.1.1738283167.1674047837; _ga_M32T05RVZT=GS1.1.1687763768.18.0.1687763773.55.0.0; SPC_SC_TK=0a17824f39cadcb4b85067af858156a3; SPC_SC_UD=113891819; SPC_U=113891819; SPC_STK=RYI0EvBUOyT/fWbIpRqPmY4Pv8obHvmOgvmjeh4CD4dqu24n6ghU2j4uyRnzTJcDoaaLIK9Y9waV5s1nZT6W+QqKiwWa6u4sFkPyKhkvJfC0oeSUegtf89+qC+8IRoConP5j7L+1pMTjEsd5QcK5qILXGSN7Z2S0SN7R70NyzoFeYaGGtZsRO3sIyoymh6TE; _QPWSDCXHZQA=e0fca7ee-a72e-4be3-efd2-a2c2b818d57b; SPC_ST=.a1R2QWdGUG56M003Mzdwa8GRvh38tLT0Rl1gpTv7oaD9DUGjUnatPgD91yBL1NM2tTFEP7ORuzajmP9aCTxnz7ANWTVfoCc0eLdZjww/1oMD90j/lC0n8UKSj+ySegocxHG0GTSJqIwaNKmieddi2g5puW8mznyTc6IHa1NWe497ykawfhcjNLE+hphb+ip/j87Q8VfSaGtUxq97ugi8ug==; SPC_EC=eWpJVGtBS2U3TGhYT2Y1TnE0d9PcPFXFLNCn9tY/d76kzBRIyU1+9HjyIujKGxG4Qq5b6CLyMPbJQ4D9y4uohkYqyp6y6vXp8zY0E63M0huwc7lM9ItIkvYiWFvJ+04Jk0liSlBNQ86YBlV1ZAxKHuHCsPwSBMaEBywxNoxRxVM=; SPC_R_T_ID=KckHTQkAnN196LgLIYUtlA9gUk/PN5ZVFnkMQXrrRE86k9YWFwIibYCLpv/pG+zbx60Hm76qgCk1dxOEiAKg4Is4l+RM5aISN5LiJTIEUkUQzLWrQVx/DiiVzYBEu867o1nvPclhCB5dfzmJ2LglGQp2LlThkZ773SlOw8tZ0hE=; SPC_R_T_IV=ZkQwY1BPZ2VtcFAzZ2dHag==; SPC_T_ID=KckHTQkAnN196LgLIYUtlA9gUk/PN5ZVFnkMQXrrRE86k9YWFwIibYCLpv/pG+zbx60Hm76qgCk1dxOEiAKg4Is4l+RM5aISN5LiJTIEUkUQzLWrQVx/DiiVzYBEu867o1nvPclhCB5dfzmJ2LglGQp2LlThkZ773SlOw8tZ0hE=; SPC_T_IV=ZkQwY1BPZ2VtcFAzZ2dHag==; shopee_webUnique_ccd=YxHFB51DZL1dD9A%2BxUeNYw%3D%3D%7CVeJ09KjdfONxbtg4WBqqcFzGk8RE9A%2F24lpCs3e3bpgep8De74u0U65KGJ7H4rulApejoftdhCCy8P9fTo8It4278Wah0PpN8UGi%7C31XVFZSfja8YRgLW%7C06%7C3");
    */
    headers.add("Cookie", createProductCookie);


    String updatedBody = updateProductName("nghiangannghiangannghiangannghiangan", createProductBody);

    // Create a RequestEntity with the headers
    RequestEntity<String> requestEntity = new RequestEntity<String>(
        Optional.ofNullable(updatedBody).isPresent() ? updatedBody : StringUtils.EMPTY, headers, HttpMethod.POST,
        URI.create(createProductUrl));

    ResponseEntity<CreateProductShopeeResponse> response = restTemplate.exchange(requestEntity,
        CreateProductShopeeResponse.class);
    Optional.ofNullable(response).ifPresent(rs -> System.out.println(rs.getBody()));
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
      return jsonArray.toString();
      //System.out.println(updatedText);
    } catch (JSONException e) {
      e.printStackTrace();
    }
    return StringUtils.EMPTY;
  }

  public Function<String, String> uploadImageIntoShopee(String fileName) {
      String[] fileN = fileName.split("\\.");
      String key = "vn-11134207-nghia_upload3_"+ fileN[0];
      String mimeType = "image/jpeg";
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
