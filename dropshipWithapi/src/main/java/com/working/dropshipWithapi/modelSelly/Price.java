
package com.working.dropshipWithapi.modelSelly;

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
    "from",
    "base",
    "market",
    "minimum",
    "maximum",
    "profit",
    "sellyProfit",
    "supplier",
    "wholesaleBonus"
})
@Generated("jsonschema2pojo")
public class Price {

    @JsonProperty("from")
    private Integer from;
    @JsonProperty("base")
    private Integer base;
    @JsonProperty("market")
    private Integer market;
    @JsonProperty("minimum")
    private Integer minimum;
    @JsonProperty("maximum")
    private Integer maximum;
    @JsonProperty("profit")
    private Integer profit;
    @JsonProperty("sellyProfit")
    private Integer sellyProfit;
    @JsonProperty("supplier")
    private Integer supplier;
    @JsonProperty("wholesaleBonus")
    private Integer wholesaleBonus;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("from")
    public Integer getFrom() {
        return from;
    }

    @JsonProperty("from")
    public void setFrom(Integer from) {
        this.from = from;
    }

    @JsonProperty("base")
    public Integer getBase() {
        return base;
    }

    @JsonProperty("base")
    public void setBase(Integer base) {
        this.base = base;
    }

    @JsonProperty("market")
    public Integer getMarket() {
        return market;
    }

    @JsonProperty("market")
    public void setMarket(Integer market) {
        this.market = market;
    }

    @JsonProperty("minimum")
    public Integer getMinimum() {
        return minimum;
    }

    @JsonProperty("minimum")
    public void setMinimum(Integer minimum) {
        this.minimum = minimum;
    }

    @JsonProperty("maximum")
    public Integer getMaximum() {
        return maximum;
    }

    @JsonProperty("maximum")
    public void setMaximum(Integer maximum) {
        this.maximum = maximum;
    }

    @JsonProperty("profit")
    public Integer getProfit() {
        return profit;
    }

    @JsonProperty("profit")
    public void setProfit(Integer profit) {
        this.profit = profit;
    }

    @JsonProperty("sellyProfit")
    public Integer getSellyProfit() {
        return sellyProfit;
    }

    @JsonProperty("sellyProfit")
    public void setSellyProfit(Integer sellyProfit) {
        this.sellyProfit = sellyProfit;
    }

    @JsonProperty("supplier")
    public Integer getSupplier() {
        return supplier;
    }

    @JsonProperty("supplier")
    public void setSupplier(Integer supplier) {
        this.supplier = supplier;
    }

    @JsonProperty("wholesaleBonus")
    public Integer getWholesaleBonus() {
        return wholesaleBonus;
    }

    @JsonProperty("wholesaleBonus")
    public void setWholesaleBonus(Integer wholesaleBonus) {
        this.wholesaleBonus = wholesaleBonus;
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
