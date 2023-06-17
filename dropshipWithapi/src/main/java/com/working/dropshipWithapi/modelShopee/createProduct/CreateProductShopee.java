
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
    "name",
    "brand_id",
    "images",
    "long_images",
    "description",
    "description_type",
    "model_list",
    "category_path",
    "attributes",
    "parent_sku",
    "wholesale_list",
    "installment_tenures",
    "weight",
    "dimension",
    "pre_order",
    "days_to_ship",
    "condition",
    "size_chart",
    "size_chart_id",
    "video_list",
    "tier_variation",
    "enable_model_level_dts",
    "price",
    "stock",
    "logistics_channels",
    "ds_cat_rcmd_id",
    "category_recommend",
    "ds_attr_rcmd_id",
    "unlisted"
})
@Generated("jsonschema2pojo")
public class CreateProductShopee {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("brand_id")
    private Integer brandId;
    @JsonProperty("images")
    private List<String> images;
    @JsonProperty("long_images")
    private List<Object> longImages;
    @JsonProperty("description")
    private String description;
    @JsonProperty("description_type")
    private String descriptionType;
    @JsonProperty("model_list")
    private List<Model> modelList;
    @JsonProperty("category_path")
    private List<Integer> categoryPath;
    @JsonProperty("attributes")
    private List<Object> attributes;
    @JsonProperty("parent_sku")
    private String parentSku;
    @JsonProperty("wholesale_list")
    private List<Object> wholesaleList;
    @JsonProperty("installment_tenures")
    private InstallmentTenures installmentTenures;
    @JsonProperty("weight")
    private String weight;
    @JsonProperty("dimension")
    private Dimension dimension;
    @JsonProperty("pre_order")
    private Boolean preOrder;
    @JsonProperty("days_to_ship")
    private Integer daysToShip;
    @JsonProperty("condition")
    private Integer condition;
    @JsonProperty("size_chart")
    private String sizeChart;
    @JsonProperty("size_chart_id")
    private Integer sizeChartId;
    @JsonProperty("video_list")
    private List<Object> videoList;
    @JsonProperty("tier_variation")
    private List<TierVariation> tierVariation;
    @JsonProperty("enable_model_level_dts")
    private Boolean enableModelLevelDts;
    @JsonProperty("price")
    private String price;
    @JsonProperty("stock")
    private Integer stock;
    @JsonProperty("logistics_channels")
    private List<LogisticsChannel> logisticsChannels;
    @JsonProperty("ds_cat_rcmd_id")
    private String dsCatRcmdId;
    @JsonProperty("category_recommend")
    private List<Object> categoryRecommend;
    @JsonProperty("ds_attr_rcmd_id")
    private String dsAttrRcmdId;
    @JsonProperty("unlisted")
    private Boolean unlisted;
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

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("brand_id")
    public Integer getBrandId() {
        return brandId;
    }

    @JsonProperty("brand_id")
    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    @JsonProperty("images")
    public List<String> getImages() {
        return images;
    }

    @JsonProperty("images")
    public void setImages(List<String> images) {
        this.images = images;
    }

    @JsonProperty("long_images")
    public List<Object> getLongImages() {
        return longImages;
    }

    @JsonProperty("long_images")
    public void setLongImages(List<Object> longImages) {
        this.longImages = longImages;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("description_type")
    public String getDescriptionType() {
        return descriptionType;
    }

    @JsonProperty("description_type")
    public void setDescriptionType(String descriptionType) {
        this.descriptionType = descriptionType;
    }

    @JsonProperty("model_list")
    public List<Model> getModelList() {
        return modelList;
    }

    @JsonProperty("model_list")
    public void setModelList(List<Model> modelList) {
        this.modelList = modelList;
    }

    @JsonProperty("category_path")
    public List<Integer> getCategoryPath() {
        return categoryPath;
    }

    @JsonProperty("category_path")
    public void setCategoryPath(List<Integer> categoryPath) {
        this.categoryPath = categoryPath;
    }

    @JsonProperty("attributes")
    public List<Object> getAttributes() {
        return attributes;
    }

    @JsonProperty("attributes")
    public void setAttributes(List<Object> attributes) {
        this.attributes = attributes;
    }

    @JsonProperty("parent_sku")
    public String getParentSku() {
        return parentSku;
    }

    @JsonProperty("parent_sku")
    public void setParentSku(String parentSku) {
        this.parentSku = parentSku;
    }

    @JsonProperty("wholesale_list")
    public List<Object> getWholesaleList() {
        return wholesaleList;
    }

    @JsonProperty("wholesale_list")
    public void setWholesaleList(List<Object> wholesaleList) {
        this.wholesaleList = wholesaleList;
    }

    @JsonProperty("installment_tenures")
    public InstallmentTenures getInstallmentTenures() {
        return installmentTenures;
    }

    @JsonProperty("installment_tenures")
    public void setInstallmentTenures(InstallmentTenures installmentTenures) {
        this.installmentTenures = installmentTenures;
    }

    @JsonProperty("weight")
    public String getWeight() {
        return weight;
    }

    @JsonProperty("weight")
    public void setWeight(String weight) {
        this.weight = weight;
    }

    @JsonProperty("dimension")
    public Dimension getDimension() {
        return dimension;
    }

    @JsonProperty("dimension")
    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }

    @JsonProperty("pre_order")
    public Boolean getPreOrder() {
        return preOrder;
    }

    @JsonProperty("pre_order")
    public void setPreOrder(Boolean preOrder) {
        this.preOrder = preOrder;
    }

    @JsonProperty("days_to_ship")
    public Integer getDaysToShip() {
        return daysToShip;
    }

    @JsonProperty("days_to_ship")
    public void setDaysToShip(Integer daysToShip) {
        this.daysToShip = daysToShip;
    }

    @JsonProperty("condition")
    public Integer getCondition() {
        return condition;
    }

    @JsonProperty("condition")
    public void setCondition(Integer condition) {
        this.condition = condition;
    }

    @JsonProperty("size_chart")
    public String getSizeChart() {
        return sizeChart;
    }

    @JsonProperty("size_chart")
    public void setSizeChart(String sizeChart) {
        this.sizeChart = sizeChart;
    }

    @JsonProperty("size_chart_id")
    public Integer getSizeChartId() {
        return sizeChartId;
    }

    @JsonProperty("size_chart_id")
    public void setSizeChartId(Integer sizeChartId) {
        this.sizeChartId = sizeChartId;
    }

    @JsonProperty("video_list")
    public List<Object> getVideoList() {
        return videoList;
    }

    @JsonProperty("video_list")
    public void setVideoList(List<Object> videoList) {
        this.videoList = videoList;
    }

    @JsonProperty("tier_variation")
    public List<TierVariation> getTierVariation() {
        return tierVariation;
    }

    @JsonProperty("tier_variation")
    public void setTierVariation(List<TierVariation> tierVariation) {
        this.tierVariation = tierVariation;
    }

    @JsonProperty("enable_model_level_dts")
    public Boolean getEnableModelLevelDts() {
        return enableModelLevelDts;
    }

    @JsonProperty("enable_model_level_dts")
    public void setEnableModelLevelDts(Boolean enableModelLevelDts) {
        this.enableModelLevelDts = enableModelLevelDts;
    }

    @JsonProperty("price")
    public String getPrice() {
        return price;
    }

    @JsonProperty("price")
    public void setPrice(String price) {
        this.price = price;
    }

    @JsonProperty("stock")
    public Integer getStock() {
        return stock;
    }

    @JsonProperty("stock")
    public void setStock(Integer stock) {
        this.stock = stock;
    }

    @JsonProperty("logistics_channels")
    public List<LogisticsChannel> getLogisticsChannels() {
        return logisticsChannels;
    }

    @JsonProperty("logistics_channels")
    public void setLogisticsChannels(List<LogisticsChannel> logisticsChannels) {
        this.logisticsChannels = logisticsChannels;
    }

    @JsonProperty("ds_cat_rcmd_id")
    public String getDsCatRcmdId() {
        return dsCatRcmdId;
    }

    @JsonProperty("ds_cat_rcmd_id")
    public void setDsCatRcmdId(String dsCatRcmdId) {
        this.dsCatRcmdId = dsCatRcmdId;
    }

    @JsonProperty("category_recommend")
    public List<Object> getCategoryRecommend() {
        return categoryRecommend;
    }

    @JsonProperty("category_recommend")
    public void setCategoryRecommend(List<Object> categoryRecommend) {
        this.categoryRecommend = categoryRecommend;
    }

    @JsonProperty("ds_attr_rcmd_id")
    public String getDsAttrRcmdId() {
        return dsAttrRcmdId;
    }

    @JsonProperty("ds_attr_rcmd_id")
    public void setDsAttrRcmdId(String dsAttrRcmdId) {
        this.dsAttrRcmdId = dsAttrRcmdId;
    }

    @JsonProperty("unlisted")
    public Boolean getUnlisted() {
        return unlisted;
    }

    @JsonProperty("unlisted")
    public void setUnlisted(Boolean unlisted) {
        this.unlisted = unlisted;
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
