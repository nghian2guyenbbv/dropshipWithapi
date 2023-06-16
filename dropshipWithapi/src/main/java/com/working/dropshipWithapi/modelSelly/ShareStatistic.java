
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
    "totalShareFromProductDetail",
    "totalUniqueShareFromProductDetail",
    "totalShareFromSocialPost",
    "totalUniqueShareFromSocialPost",
    "totalShare"
})
@Generated("jsonschema2pojo")
public class ShareStatistic {

    @JsonProperty("totalShareFromProductDetail")
    private Integer totalShareFromProductDetail;
    @JsonProperty("totalUniqueShareFromProductDetail")
    private Integer totalUniqueShareFromProductDetail;
    @JsonProperty("totalShareFromSocialPost")
    private Integer totalShareFromSocialPost;
    @JsonProperty("totalUniqueShareFromSocialPost")
    private Integer totalUniqueShareFromSocialPost;
    @JsonProperty("totalShare")
    private Integer totalShare;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("totalShareFromProductDetail")
    public Integer getTotalShareFromProductDetail() {
        return totalShareFromProductDetail;
    }

    @JsonProperty("totalShareFromProductDetail")
    public void setTotalShareFromProductDetail(Integer totalShareFromProductDetail) {
        this.totalShareFromProductDetail = totalShareFromProductDetail;
    }

    @JsonProperty("totalUniqueShareFromProductDetail")
    public Integer getTotalUniqueShareFromProductDetail() {
        return totalUniqueShareFromProductDetail;
    }

    @JsonProperty("totalUniqueShareFromProductDetail")
    public void setTotalUniqueShareFromProductDetail(Integer totalUniqueShareFromProductDetail) {
        this.totalUniqueShareFromProductDetail = totalUniqueShareFromProductDetail;
    }

    @JsonProperty("totalShareFromSocialPost")
    public Integer getTotalShareFromSocialPost() {
        return totalShareFromSocialPost;
    }

    @JsonProperty("totalShareFromSocialPost")
    public void setTotalShareFromSocialPost(Integer totalShareFromSocialPost) {
        this.totalShareFromSocialPost = totalShareFromSocialPost;
    }

    @JsonProperty("totalUniqueShareFromSocialPost")
    public Integer getTotalUniqueShareFromSocialPost() {
        return totalUniqueShareFromSocialPost;
    }

    @JsonProperty("totalUniqueShareFromSocialPost")
    public void setTotalUniqueShareFromSocialPost(Integer totalUniqueShareFromSocialPost) {
        this.totalUniqueShareFromSocialPost = totalUniqueShareFromSocialPost;
    }

    @JsonProperty("totalShare")
    public Integer getTotalShare() {
        return totalShare;
    }

    @JsonProperty("totalShare")
    public void setTotalShare(Integer totalShare) {
        this.totalShare = totalShare;
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
