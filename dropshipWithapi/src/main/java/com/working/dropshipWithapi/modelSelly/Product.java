
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
    "name",
    "businessType",
    "isOutOfStock",
    "photos",
    "notices",
    "price",
    "info",
    "shareDesc",
    "shareImages",
    "promotions",
    "pendingInactive",
    "inactiveReason",
    "shareStatistic",
    "statistic",
    "doesSupportSellyExpress",
    "reviewStatistic",
    "inventories",
    "displaySKUId",
    "freeShips",
    "canAdd",
    "reason",
    "marks",
    "accolades",
    "memberships",
    "brand"
})
@Generated("jsonschema2pojo")
public class Product {

    @JsonProperty("_id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("businessType")
    private String businessType;
    @JsonProperty("isOutOfStock")
    private Boolean isOutOfStock;
    @JsonProperty("photos")
    private List<Photo> photos;
    @JsonProperty("notices")
    private List<Object> notices;
    @JsonProperty("price")
    private Price price;
    @JsonProperty("info")
    private Info info;
    @JsonProperty("shareDesc")
    private String shareDesc;
    @JsonProperty("shareImages")
    private List<String> shareImages;
    @JsonProperty("promotions")
    private List<Promotion> promotions;
    @JsonProperty("pendingInactive")
    private Boolean pendingInactive;
    @JsonProperty("inactiveReason")
    private String inactiveReason;
    @JsonProperty("shareStatistic")
    private ShareStatistic shareStatistic;
    @JsonProperty("statistic")
    private Statistic statistic;
    @JsonProperty("doesSupportSellyExpress")
    private Boolean doesSupportSellyExpress;
    @JsonProperty("reviewStatistic")
    private ReviewStatistic reviewStatistic;
    @JsonProperty("inventories")
    private List<Inventory__1> inventories;
    @JsonProperty("displaySKUId")
    private String displaySKUId;
    @JsonProperty("freeShips")
    private List<Object> freeShips;
    @JsonProperty("canAdd")
    private Boolean canAdd;
    @JsonProperty("reason")
    private String reason;
    @JsonProperty("marks")
    private List<Object> marks;
    @JsonProperty("accolades")
    private List<Object> accolades;
    @JsonProperty("memberships")
    private List<Object> memberships;
    @JsonProperty("brand")
    private Brand brand;
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

    @JsonProperty("businessType")
    public String getBusinessType() {
        return businessType;
    }

    @JsonProperty("businessType")
    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    @JsonProperty("isOutOfStock")
    public Boolean getIsOutOfStock() {
        return isOutOfStock;
    }

    @JsonProperty("isOutOfStock")
    public void setIsOutOfStock(Boolean isOutOfStock) {
        this.isOutOfStock = isOutOfStock;
    }

    @JsonProperty("photos")
    public List<Photo> getPhotos() {
        return photos;
    }

    @JsonProperty("photos")
    public void setPhotos(List<Photo> photos) {
        this.photos = photos;
    }

    @JsonProperty("notices")
    public List<Object> getNotices() {
        return notices;
    }

    @JsonProperty("notices")
    public void setNotices(List<Object> notices) {
        this.notices = notices;
    }

    @JsonProperty("price")
    public Price getPrice() {
        return price;
    }

    @JsonProperty("price")
    public void setPrice(Price price) {
        this.price = price;
    }

    @JsonProperty("info")
    public Info getInfo() {
        return info;
    }

    @JsonProperty("info")
    public void setInfo(Info info) {
        this.info = info;
    }

    @JsonProperty("shareDesc")
    public String getShareDesc() {
        return shareDesc;
    }

    @JsonProperty("shareDesc")
    public void setShareDesc(String shareDesc) {
        this.shareDesc = shareDesc;
    }

    @JsonProperty("shareImages")
    public List<String> getShareImages() {
        return shareImages;
    }

    @JsonProperty("shareImages")
    public void setShareImages(List<String> shareImages) {
        this.shareImages = shareImages;
    }

    @JsonProperty("promotions")
    public List<Promotion> getPromotions() {
        return promotions;
    }

    @JsonProperty("promotions")
    public void setPromotions(List<Promotion> promotions) {
        this.promotions = promotions;
    }

    @JsonProperty("pendingInactive")
    public Boolean getPendingInactive() {
        return pendingInactive;
    }

    @JsonProperty("pendingInactive")
    public void setPendingInactive(Boolean pendingInactive) {
        this.pendingInactive = pendingInactive;
    }

    @JsonProperty("inactiveReason")
    public String getInactiveReason() {
        return inactiveReason;
    }

    @JsonProperty("inactiveReason")
    public void setInactiveReason(String inactiveReason) {
        this.inactiveReason = inactiveReason;
    }

    @JsonProperty("shareStatistic")
    public ShareStatistic getShareStatistic() {
        return shareStatistic;
    }

    @JsonProperty("shareStatistic")
    public void setShareStatistic(ShareStatistic shareStatistic) {
        this.shareStatistic = shareStatistic;
    }

    @JsonProperty("statistic")
    public Statistic getStatistic() {
        return statistic;
    }

    @JsonProperty("statistic")
    public void setStatistic(Statistic statistic) {
        this.statistic = statistic;
    }

    @JsonProperty("doesSupportSellyExpress")
    public Boolean getDoesSupportSellyExpress() {
        return doesSupportSellyExpress;
    }

    @JsonProperty("doesSupportSellyExpress")
    public void setDoesSupportSellyExpress(Boolean doesSupportSellyExpress) {
        this.doesSupportSellyExpress = doesSupportSellyExpress;
    }

    @JsonProperty("reviewStatistic")
    public ReviewStatistic getReviewStatistic() {
        return reviewStatistic;
    }

    @JsonProperty("reviewStatistic")
    public void setReviewStatistic(ReviewStatistic reviewStatistic) {
        this.reviewStatistic = reviewStatistic;
    }

    @JsonProperty("inventories")
    public List<Inventory__1> getInventories() {
        return inventories;
    }

    @JsonProperty("inventories")
    public void setInventories(List<Inventory__1> inventories) {
        this.inventories = inventories;
    }

    @JsonProperty("displaySKUId")
    public String getDisplaySKUId() {
        return displaySKUId;
    }

    @JsonProperty("displaySKUId")
    public void setDisplaySKUId(String displaySKUId) {
        this.displaySKUId = displaySKUId;
    }

    @JsonProperty("freeShips")
    public List<Object> getFreeShips() {
        return freeShips;
    }

    @JsonProperty("freeShips")
    public void setFreeShips(List<Object> freeShips) {
        this.freeShips = freeShips;
    }

    @JsonProperty("canAdd")
    public Boolean getCanAdd() {
        return canAdd;
    }

    @JsonProperty("canAdd")
    public void setCanAdd(Boolean canAdd) {
        this.canAdd = canAdd;
    }

    @JsonProperty("reason")
    public String getReason() {
        return reason;
    }

    @JsonProperty("reason")
    public void setReason(String reason) {
        this.reason = reason;
    }

    @JsonProperty("marks")
    public List<Object> getMarks() {
        return marks;
    }

    @JsonProperty("marks")
    public void setMarks(List<Object> marks) {
        this.marks = marks;
    }

    @JsonProperty("accolades")
    public List<Object> getAccolades() {
        return accolades;
    }

    @JsonProperty("accolades")
    public void setAccolades(List<Object> accolades) {
        this.accolades = accolades;
    }

    @JsonProperty("memberships")
    public List<Object> getMemberships() {
        return memberships;
    }

    @JsonProperty("memberships")
    public void setMemberships(List<Object> memberships) {
        this.memberships = memberships;
    }

    @JsonProperty("brand")
    public Brand getBrand() {
        return brand;
    }

    @JsonProperty("brand")
    public void setBrand(Brand brand) {
        this.brand = brand;
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
