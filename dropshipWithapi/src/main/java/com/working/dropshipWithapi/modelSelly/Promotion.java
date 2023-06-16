
package com.working.dropshipWithapi.modelSelly;

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
    "_id",
    "expireAt",
    "title",
    "target",
    "action",
    "photo",
    "startAt",
    "endAt",
    "order",
    "type",
    "shortTitle",
    "forAllCities",
    "cities",
    "photoStretchSize",
    "color",
    "displayStyle",
    "displayTime"
})
@Generated("jsonschema2pojo")
public class Promotion {

    @JsonProperty("_id")
    private String id;
    @JsonProperty("expireAt")
    private String expireAt;
    @JsonProperty("title")
    private String title;
    @JsonProperty("target")
    private Target target;
    @JsonProperty("action")
    private Action action;
    @JsonProperty("photo")
    private Photo__1 photo;
    @JsonProperty("startAt")
    private String startAt;
    @JsonProperty("endAt")
    private String endAt;
    @JsonProperty("order")
    private Integer order;
    @JsonProperty("type")
    private String type;
    @JsonProperty("shortTitle")
    private String shortTitle;
    @JsonProperty("forAllCities")
    private Boolean forAllCities;
    @JsonProperty("cities")
    private List<Object> cities;
    @JsonProperty("photoStretchSize")
    private PhotoStretchSize photoStretchSize;
    @JsonProperty("color")
    private String color;
    @JsonProperty("displayStyle")
    private String displayStyle;
    @JsonProperty("displayTime")
    private DisplayTime displayTime;
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

    @JsonProperty("expireAt")
    public String getExpireAt() {
        return expireAt;
    }

    @JsonProperty("expireAt")
    public void setExpireAt(String expireAt) {
        this.expireAt = expireAt;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("target")
    public Target getTarget() {
        return target;
    }

    @JsonProperty("target")
    public void setTarget(Target target) {
        this.target = target;
    }

    @JsonProperty("action")
    public Action getAction() {
        return action;
    }

    @JsonProperty("action")
    public void setAction(Action action) {
        this.action = action;
    }

    @JsonProperty("photo")
    public Photo__1 getPhoto() {
        return photo;
    }

    @JsonProperty("photo")
    public void setPhoto(Photo__1 photo) {
        this.photo = photo;
    }

    @JsonProperty("startAt")
    public String getStartAt() {
        return startAt;
    }

    @JsonProperty("startAt")
    public void setStartAt(String startAt) {
        this.startAt = startAt;
    }

    @JsonProperty("endAt")
    public String getEndAt() {
        return endAt;
    }

    @JsonProperty("endAt")
    public void setEndAt(String endAt) {
        this.endAt = endAt;
    }

    @JsonProperty("order")
    public Integer getOrder() {
        return order;
    }

    @JsonProperty("order")
    public void setOrder(Integer order) {
        this.order = order;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("shortTitle")
    public String getShortTitle() {
        return shortTitle;
    }

    @JsonProperty("shortTitle")
    public void setShortTitle(String shortTitle) {
        this.shortTitle = shortTitle;
    }

    @JsonProperty("forAllCities")
    public Boolean getForAllCities() {
        return forAllCities;
    }

    @JsonProperty("forAllCities")
    public void setForAllCities(Boolean forAllCities) {
        this.forAllCities = forAllCities;
    }

    @JsonProperty("cities")
    public List<Object> getCities() {
        return cities;
    }

    @JsonProperty("cities")
    public void setCities(List<Object> cities) {
        this.cities = cities;
    }

    @JsonProperty("photoStretchSize")
    public PhotoStretchSize getPhotoStretchSize() {
        return photoStretchSize;
    }

    @JsonProperty("photoStretchSize")
    public void setPhotoStretchSize(PhotoStretchSize photoStretchSize) {
        this.photoStretchSize = photoStretchSize;
    }

    @JsonProperty("color")
    public String getColor() {
        return color;
    }

    @JsonProperty("color")
    public void setColor(String color) {
        this.color = color;
    }

    @JsonProperty("displayStyle")
    public String getDisplayStyle() {
        return displayStyle;
    }

    @JsonProperty("displayStyle")
    public void setDisplayStyle(String displayStyle) {
        this.displayStyle = displayStyle;
    }

    @JsonProperty("displayTime")
    public DisplayTime getDisplayTime() {
        return displayTime;
    }

    @JsonProperty("displayTime")
    public void setDisplayTime(DisplayTime displayTime) {
        this.displayTime = displayTime;
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
