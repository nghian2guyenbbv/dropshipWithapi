
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
    "_id",
    "name",
    "location",
    "hasActiveSKU"
})
@Generated("jsonschema2pojo")
public class Inventory__1 {

    @JsonProperty("_id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("location")
    private Location__2 location;
    @JsonProperty("hasActiveSKU")
    private Boolean hasActiveSKU;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("_id")
    public String getId() {
        return id;
    }

    @JsonProperty("_id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("location")
    public Location__2 getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(Location__2 location) {
        this.location = location;
    }

    @JsonProperty("hasActiveSKU")
    public Boolean getHasActiveSKU() {
        return hasActiveSKU;
    }

    @JsonProperty("hasActiveSKU")
    public void setHasActiveSKU(Boolean hasActiveSKU) {
        this.hasActiveSKU = hasActiveSKU;
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
