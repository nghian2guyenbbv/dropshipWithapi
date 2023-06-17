package com.working.dropshipWithapi.service.shopee;

import com.working.dropshipWithapi.service.shopee.response.CreateProductShopeeResponse;
import com.working.dropshipWithapi.service.shopee.uploadImage.UploadImageShopee;
import com.working.dropshipWithapi.service.util.Utils;
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
import java.net.URI;
import java.util.Optional;
import java.util.function.Function;

@Service
public class ShopeeService {
  @Value("${shopee.service.cookie}")
  private String shopeeCookie;

  @Autowired
  private Utils utils;

  //private void createProductShopee() {
  public static void main(String[] args) {
    String tokenUpload = "d6e4b41e5f512916477077ff856e09f01df7bef5:ZGY4NGYxYTRjYzIwNTE4NzA0OTM1ZTA0MDRjOTIyZjcyMmQwNzk2Zg==:eyJjYWxsYmFja1VybCI6Imh0dHBzOi8vYXBpLm1tcy5zaG9wZWUudm4vdXBsb2FkYXBpL2FwaS92MS9jYWxsYmFjay93c2V2ZW50IiwiY2FsbGJhY2tCb2R5Ijoia2V5PSQoa2V5KVx1MDAyNmZpbGVfc2l6ZT0kKGZzaXplKVx1MDAyNmlwPSQoaXApXHUwMDI2bWltZV90eXBlPSQobWltZVR5cGUpXHUwMDI2Y29zdD0kKGNvc3RUaW1lKVx1MDAyNmVudj1saXZlXHUwMDI2Y2lkPXZuXHUwMDI2Yml6PTQyMDciLCJzY29wZSI6ImdhcmVuYS1pbWFnZSIsImRlYWRsaW5lIjoiMTY4NzAxOTg3MDAwMCIsIm92ZXJ3cml0ZSI6MCwiZnNpemVMaW1pdCI6MH0=";
    String rp = uploadImageIntoShopee(tokenUpload).apply("C:/Users/nghia2nguyen/Pictures/456.jpg");
    System.out.println("rp: " + rp);
    /*

    String createProductUrl = "https://banhang.shopee.vn/api/v3/product/create_product/?version=3.1.0&SPC_CDS=c31185a4-b81a-4a9b-a174-f94e433b0aa7&SPC_CDS_VER=2";

    RestTemplate restTemplate = new RestTemplate();
    // Create HttpHeaders and add the cookie
    HttpHeaders headers = new HttpHeaders();
    headers.add("Cookie",
        "SPC_F=RIl4pQ7UBsEtWaey2oOtSKyIiI6FrSdg; REC_T_ID=6b00daf9-9732-11ed-8ad5-3473791746da; _fbp=fb.1.1674047835635.1752225705; _hjSessionUser_868286=eyJpZCI6ImJhZTdiMzhkLTI5YjUtNThkNy05MTBkLTdhYzI0ODJkNWZkYyIsImNyZWF0ZWQiOjE2NzQwNDc4MzcwMzAsImV4aXN0aW5nIjp0cnVlfQ==; SPC_CLIENTID=UklsNHBRN1VCc0V0prmgntzfdxakaggj; SC_DFP=LavZGLmkKaNSajRDXUVUDROAuSKcPlnV; _ga_3XVGTY3603=GS1.1.1674094914.1.1.1674098158.60.0.0; _gcl_aw=GCL.1679457811.CjwKCAjwq-WgBhBMEiwAzKSH6L5fLFH9Eels9HV6HBO_bETvobPCdv2EPpLhDubcslDj1DcF-LB4VBoCwxcQAvD_BwE; _gac_UA-61914164-6=1.1679457812.CjwKCAjwq-WgBhBMEiwAzKSH6L5fLFH9Eels9HV6HBO_bETvobPCdv2EPpLhDubcslDj1DcF-LB4VBoCwxcQAvD_BwE; _gcl_au=1.1.1676276854.1682180439; _med=refer; SPC_SI=ziyMZAAAAABVbUF4WUZkMMacAwAAAAAASDdYVjVoQ0E=; _gid=GA1.2.1337977798.1686922477; SPC_CDS=c31185a4-b81a-4a9b-a174-f94e433b0aa7; _QPWSDCXHZQA=e0fca7ee-a72e-4be3-efd2-a2c2b818d57b; _ga=GA1.1.1738283167.1674047837; _ga_M32T05RVZT=GS1.1.1686922476.17.1.1686923965.47.0.0; SPC_SC_TK=1ebc261fab1d3bae53e76568742d839a; SPC_SC_UD=113891819; SPC_U=113891819; SPC_STK=4fD2hMe0G8+2pJ5o3z8RuGDas+OT4gk3YKYRB0nyllexGiziJaV28oMffkJ1cdSza1gKqkrMK9xqBYGedzUXZjnO2/mQVYbo+sCR/YJZyWkBU9mWdCIPqLA8vkuYBv0aAfhCpJ0/E+RkuSXX2NoZV18ESbyyRjJXMmi3vN1r47n7Lu2D1mtmn4I0KEjGcTmT; SPC_ST=.UzRpbWtaZkxMRFptcFdnNKzmjef2DbLXXEk2Ri70fMpUOp/uF7dg/4nOIMi3SayY2g3kjEYZz+G8HkhioI2+BHVgPi1gje+ZoK+f4z51gL7zHj/e8rtUyYURStEzc5R3nq6Xs0679WeGZRJ2xQFVVszxftEF/5LeL/4SlxvQ+clw2vBFxMYpjWvK+J7zrtyoPGgJUmoSZZmIFX0KWQsiyA==; SPC_R_T_ID=SzbiyN37ZfCxgbAM3O3byulrKhhtQfMQlyF/Z89l3krJjMGA2zBtM3OjSaMTiVyIaE40lp0j3K7IRuYHSVznHJqzRRUWQk6X1+0I8fDvdB2dkz6Yu1SC7VPxsmk3u2ljg0inmy9vHe5TtR7N+0faxep3icJJswlPHiUlZW25Gxs=; SPC_R_T_IV=ZlZ0emZ0YkdDVVBMUndmQw==; SPC_T_ID=SzbiyN37ZfCxgbAM3O3byulrKhhtQfMQlyF/Z89l3krJjMGA2zBtM3OjSaMTiVyIaE40lp0j3K7IRuYHSVznHJqzRRUWQk6X1+0I8fDvdB2dkz6Yu1SC7VPxsmk3u2ljg0inmy9vHe5TtR7N+0faxep3icJJswlPHiUlZW25Gxs=; SPC_T_IV=ZlZ0emZ0YkdDVVBMUndmQw==; SPC_EC=TXdYa2puRGN6WXIydW5acLUN0lXVdMiDaHcXrb+xmBe0ku+SVpy4iI0UHhdqApBhfLCSkFXn4D7H/JUx8bDP4AbXk13Rcx4YPwwtr+u68Wm8WkCxFNWsx+fm6TpR880bEeGHOd2mDVorkECPothPAXumBjNvdRiSDz30GpAPj34=; shopee_webUnique_ccd=4JKBIhCZRHF%2BGHm7ftw3VA%3D%3D%7CXS4b9E9L%2BDRM5YrzPb0rofTHG6BmE%2B4XkHfG3d9XF%2FIZa6VZyjyGBT0yyaEIUScqQlW8fu8uea6A3ZXwcy%2BdHAOU0Mbx3uHGeAek%7Cn9A%2Bj6dA3Uxk3dci%7C06%7C3");
    String body = "[\n" + "    {\n" + "        \"id\": 0,\n" + "        \"name\": \"dasdsdygyasasgygygssdads\",\n"
        + "        \"brand_id\": 0,\n" + "        \"images\": [\n"
        + "            \"vn-11134207-7qukw-li45mxute0wc4a\"\n" + "        ],\n" + "        \"long_images\": [],\n"
        + "        \"description\": \"dasdsdsdsdasdadssadasdsdsdsdasdadssadasdsdsdsdasdadssadasdsdsdsdasdadssadasdsdsdsdasdadssadasdsdsdsdasdadssadasdsdsdsdasdadssadasdsdsdsdasdadssadasdsdsdsdasdadssadasdsdsdsdasdadssadasdsdsdsdasdadssadasdsdsdsdasdadssadasdsdsdsdasdadssadasdsdsdsdasdadssadasdsdsdsdasdadssa\",\n"
        + "        \"description_type\": \"normal\",\n" + "        \"model_list\": [\n" + "            {\n"
        + "                \"id\": 0,\n" + "                \"tier_index\": [\n" + "                    0\n"
        + "                ],\n" + "                \"is_default\": true,\n"
        + "                \"name\": \"dasdsdssdads\",\n" + "                \"price\": \"700000\",\n"
        + "                \"item_price\": \"70000\",\n" + "                \"stock_setting_list\": [\n"
        + "                    {\n" + "                        \"sellable_stock\": 1\n" + "                    }\n"
        + "                ]\n" + "            }\n" + "        ],\n" + "        \"category_path\": [\n"
        + "            100011,\n" + "            100047\n" + "        ],\n" + "        \"attributes\": [],\n"
        + "        \"parent_sku\": \"\",\n" + "        \"wholesale_list\": [],\n"
        + "        \"installment_tenures\": {},\n" + "        \"weight\": \"500\",\n" + "        \"dimension\": {\n"
        + "            \"width\": 0,\n" + "            \"height\": 0,\n" + "            \"length\": 0\n"
        + "        },\n" + "        \"pre_order\": false,\n" + "        \"days_to_ship\": 2,\n"
        + "        \"condition\": 1,\n" + "        \"size_chart\": \"\",\n" + "        \"size_chart_id\": 0,\n"
        + "        \"video_list\": [],\n" + "        \"tier_variation\": [\n" + "            {\n"
        + "                \"name\": \"\",\n" + "                \"options\": [\n" + "                    \"\"\n"
        + "                ],\n" + "                \"images\": []\n" + "            }\n" + "        ],\n"
        + "        \"enable_model_level_dts\": false,\n" + "        \"price\": \"700000\",\n"
        + "        \"stock\": 1,\n" + "        \"logistics_channels\": [\n" + "            {\n"
        + "                \"size\": 0,\n" + "                \"price\": \"16500\",\n"
        + "                \"cover_shipping_fee\": false,\n" + "                \"enabled\": true,\n"
        + "                \"item_flag\": \"0\",\n" + "                \"channelid\": 5001,\n"
        + "                \"sizeid\": 0\n" + "            },\n" + "            {\n" + "                \"size\": 0,\n"
        + "                \"price\": \"14175\",\n" + "                \"cover_shipping_fee\": false,\n"
        + "                \"enabled\": true,\n" + "                \"item_flag\": \"0\",\n"
        + "                \"channelid\": 5002,\n" + "                \"sizeid\": 0\n" + "            }\n"
        + "        ],\n" + "        \"ds_cat_rcmd_id\": \"\",\n" + "        \"category_recommend\": [],\n"
        + "        \"ds_attr_rcmd_id\": \"85947068-8330-4a67-b754-2901effab038\",\n" + "        \"unlisted\": false\n"
        + "    }\n" + "]";

    String updatedBody = updateProductName("dsaddssdsadsadwcdcdcdc", body);

    // Create a RequestEntity with the headers
    RequestEntity<String> requestEntity = new RequestEntity<String>(
        Optional.ofNullable(updatedBody).isPresent() ? updatedBody : StringUtils.EMPTY, headers, HttpMethod.POST,
        URI.create(createProductUrl));

    ResponseEntity<CreateProductShopeeResponse> response = restTemplate.exchange(requestEntity,
        CreateProductShopeeResponse.class);
    //  ResponseEntity<CreateProductShopeeResponse> responseCreatePro = utils.exchange(createProductUrl, HttpMethod.POST, Utils.toHttpEntity(), CreateProductShopeeResponse.class);

    Optional.ofNullable(response).ifPresent(rs -> System.out.println(rs.getBody()));*/
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

  private static Function<String, String> uploadImageIntoShopee(String token) {
    String key = "vn-11134207-7qukw-li45mxuti8lo42";
    String mimeType = "image/jpeg";
    String urlUpload = "https://upload.ws.img.shopee.com/file/upload";
    RestTemplate restTemplate = new RestTemplate();
    return fileToUPload -> {
      File imageF = new File(fileToUPload);
      System.out.println("imageF: " + imageF.getAbsolutePath());
      HttpHeaders headers = new HttpHeaders();
      headers.add("Origin", "https://banhang.shopee.vn");
      /*RequestEntity<UploadImageShopee> requestEntity = new RequestEntity<UploadImageShopee>(
          UploadImageShopee.builder().file(imageF).token(token).key(key).build(), headers, HttpMethod.POST,
          URI.create(urlUpload));*/
      // Create the MultiValueMap to hold the form data
      MultiValueMap<String, Object> body = new LinkedMultiValueMap<>();

      // Add the binary file to the form data
      body.add("file", new FileSystemResource(imageF));
      body.add("token", token);
      body.add("key", key);
      body.add("mimeType", "image/jpeg");
      // Create the RequestEntity with the form data and headers
      RequestEntity<MultiValueMap<String, Object>> requestEntity = new RequestEntity<>(body, headers, HttpMethod.POST,
          URI.create(urlUpload));

      ResponseEntity<String> response = restTemplate.exchange(requestEntity, String.class);
      return response.getBody().toString();
    };
  }
}
