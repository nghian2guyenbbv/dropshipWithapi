
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
    "sm",
    "md"
})
@Generated("jsonschema2pojo")
public class Dimensions__2 {

    @JsonProperty("sm")
    private Sm__2 sm;
    @JsonProperty("md")
    private Md__2 md;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("sm")
    public Sm__2 getSm() {
        return sm;
    }

    @JsonProperty("sm")
    public void setSm(Sm__2 sm) {
        this.sm = sm;
    }

    @JsonProperty("md")
    public Md__2 getMd() {
        return md;
    }

    @JsonProperty("md")
    public void setMd(Md__2 md) {
        this.md = md;
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
