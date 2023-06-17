
package com.working.dropshipWithapi.modelShopee.createProduct;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "tier_index",
    "is_default",
    "name",
    "price",
    "item_price",
    "stock_setting_list"
})
@Generated("jsonschema2pojo")
public class Model {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("tier_index")
    private List<Integer> tierIndex;
    @JsonProperty("is_default")
    private Boolean isDefault;
    @JsonProperty("name")
    private String name;
    @JsonProperty("price")
    private String price;
    @JsonProperty("item_price")
    private String itemPrice;
    @JsonProperty("stock_setting_list")
    private List<StockSetting> stockSettingList;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("tier_index")
    public List<Integer> getTierIndex() {
        return tierIndex;
    }

    @JsonProperty("tier_index")
    public void setTierIndex(List<Integer> tierIndex) {
        this.tierIndex = tierIndex;
    }

    @JsonProperty("is_default")
    public Boolean getIsDefault() {
        return isDefault;
    }

    @JsonProperty("is_default")
    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("price")
    public String getPrice() {
        return price;
    }

    @JsonProperty("price")
    public void setPrice(String price) {
        this.price = price;
    }

    @JsonProperty("item_price")
    public String getItemPrice() {
        return itemPrice;
    }

    @JsonProperty("item_price")
    public void setItemPrice(String itemPrice) {
        this.itemPrice = itemPrice;
    }

    @JsonProperty("stock_setting_list")
    public List<StockSetting> getStockSettingList() {
        return stockSettingList;
    }

    @JsonProperty("stock_setting_list")
    public void setStockSettingList(List<StockSetting> stockSettingList) {
        this.stockSettingList = stockSettingList;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
