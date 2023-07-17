package com.working.dropshipWithapi.service.shopee.createProduct;

import org.apache.commons.lang3.StringUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

public class CommonCreateProduct {
  public static String updateProductInfo(String itemName,String desc, List<String> listProductKeys, String rawBody) {
    try {
      JSONArray jsonArray = new JSONArray(rawBody);
      JSONObject jsonObject0 = jsonArray.getJSONObject(0);
      String itemNameJson = jsonObject0.getString("name");
      JSONArray modelist = jsonObject0.getJSONArray("model_list");
      modelist.getJSONObject(0).put("name", itemName);
      jsonObject0.put("name", itemName);
      jsonObject0.put("description", desc);
      jsonObject0.put("images", new JSONArray(listProductKeys));

      String jsonString = jsonArray.toString();
      byte[] utf8Bytes = jsonString.getBytes(java.nio.charset.StandardCharsets.UTF_8);
      return new String(utf8Bytes, java.nio.charset.StandardCharsets.UTF_8);
    } catch (JSONException e) {
      e.printStackTrace();
    }
    return StringUtils.EMPTY;
  }
}
