
package com.working.dropshipWithapi.modelShopee.createProduct;

import java.util.LinkedHashMap;
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
    "size",
    "price",
    "cover_shipping_fee",
    "enabled",
    "item_flag",
    "channelid",
    "sizeid"
})
@Generated("jsonschema2pojo")
public class LogisticsChannel {

    @JsonProperty("size")
    private Integer size;
    @JsonProperty("price")
    private String price;
    @JsonProperty("cover_shipping_fee")
    private Boolean coverShippingFee;
    @JsonProperty("enabled")
    private Boolean enabled;
    @JsonProperty("item_flag")
    private String itemFlag;
    @JsonProperty("channelid")
    private Integer channelid;
    @JsonProperty("sizeid")
    private Integer sizeid;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("size")
    public Integer getSize() {
        return size;
    }

    @JsonProperty("size")
    public void setSize(Integer size) {
        this.size = size;
    }

    @JsonProperty("price")
    public String getPrice() {
        return price;
    }

    @JsonProperty("price")
    public void setPrice(String price) {
        this.price = price;
    }

    @JsonProperty("cover_shipping_fee")
    public Boolean getCoverShippingFee() {
        return coverShippingFee;
    }

    @JsonProperty("cover_shipping_fee")
    public void setCoverShippingFee(Boolean coverShippingFee) {
        this.coverShippingFee = coverShippingFee;
    }

    @JsonProperty("enabled")
    public Boolean getEnabled() {
        return enabled;
    }

    @JsonProperty("enabled")
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    @JsonProperty("item_flag")
    public String getItemFlag() {
        return itemFlag;
    }

    @JsonProperty("item_flag")
    public void setItemFlag(String itemFlag) {
        this.itemFlag = itemFlag;
    }

    @JsonProperty("channelid")
    public Integer getChannelid() {
        return channelid;
    }

    @JsonProperty("channelid")
    public void setChannelid(Integer channelid) {
        this.channelid = channelid;
    }

    @JsonProperty("sizeid")
    public Integer getSizeid() {
        return sizeid;
    }

    @JsonProperty("sizeid")
    public void setSizeid(Integer sizeid) {
        this.sizeid = sizeid;
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
