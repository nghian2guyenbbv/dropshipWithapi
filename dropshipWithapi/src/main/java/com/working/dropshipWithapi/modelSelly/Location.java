
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
    "address",
    "province",
    "provinceName",
    "district",
    "ward",
    "fullAddress",
    "location"
})
@Generated("jsonschema2pojo")
public class Location {

    @JsonProperty("address")
    private String address;
    @JsonProperty("province")
    private String province;
    @JsonProperty("provinceName")
    private String provinceName;
    @JsonProperty("district")
    private String district;
    @JsonProperty("ward")
    private String ward;
    @JsonProperty("fullAddress")
    private String fullAddress;
    @JsonProperty("location")
    private Location__1 location;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("address")
    public String getAddress() {
        return address;
    }

    @JsonProperty("address")
    public void setAddress(String address) {
        this.address = address;
    }

    @JsonProperty("province")
    public String getProvince() {
        return province;
    }

    @JsonProperty("province")
    public void setProvince(String province) {
        this.province = province;
    }

    @JsonProperty("provinceName")
    public String getProvinceName() {
        return provinceName;
    }

    @JsonProperty("provinceName")
    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    @JsonProperty("district")
    public String getDistrict() {
        return district;
    }

    @JsonProperty("district")
    public void setDistrict(String district) {
        this.district = district;
    }

    @JsonProperty("ward")
    public String getWard() {
        return ward;
    }

    @JsonProperty("ward")
    public void setWard(String ward) {
        this.ward = ward;
    }

    @JsonProperty("fullAddress")
    public String getFullAddress() {
        return fullAddress;
    }

    @JsonProperty("fullAddress")
    public void setFullAddress(String fullAddress) {
        this.fullAddress = fullAddress;
    }

    @JsonProperty("location")
    public Location__1 getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(Location__1 location) {
        this.location = location;
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
