
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
    "category",
    "supplier",
    "inventory",
    "profit",
    "weight",
    "dimension"
})
@Generated("jsonschema2pojo")
public class Info {

    @JsonProperty("category")
    private Object category;
    @JsonProperty("supplier")
    private Supplier supplier;
    @JsonProperty("inventory")
    private Inventory inventory;
    @JsonProperty("profit")
    private Integer profit;
    @JsonProperty("weight")
    private Integer weight;
    @JsonProperty("dimension")
    private String dimension;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("category")
    public Object getCategory() {
        return category;
    }

    @JsonProperty("category")
    public void setCategory(Object category) {
        this.category = category;
    }

    @JsonProperty("supplier")
    public Supplier getSupplier() {
        return supplier;
    }

    @JsonProperty("supplier")
    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    @JsonProperty("inventory")
    public Inventory getInventory() {
        return inventory;
    }

    @JsonProperty("inventory")
    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    @JsonProperty("profit")
    public Integer getProfit() {
        return profit;
    }

    @JsonProperty("profit")
    public void setProfit(Integer profit) {
        this.profit = profit;
    }

    @JsonProperty("weight")
    public Integer getWeight() {
        return weight;
    }

    @JsonProperty("weight")
    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    @JsonProperty("dimension")
    public String getDimension() {
        return dimension;
    }

    @JsonProperty("dimension")
    public void setDimension(String dimension) {
        this.dimension = dimension;
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
