
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
    "totalSell",
    "sellTotal",
    "sellWeekTotal",
    "sellMonthTotal",
    "sellTwoMonthTotal",
    "sellYearTotal",
    "sellWaiting",
    "sellPaymentProcessing",
    "sellPending",
    "sellDelivering",
    "sellDelivered",
    "sellCancelled",
    "sellCashback",
    "skuTotal",
    "skuActive",
    "view",
    "salesTotal",
    "salesWeekTotal",
    "salesMonthTotal",
    "salesTwoMonthTotal",
    "salesYearTotal",
    "totalPost",
    "totalInventory"
})
@Generated("jsonschema2pojo")
public class Statistic {

    @JsonProperty("totalSell")
    private Integer totalSell;
    @JsonProperty("sellTotal")
    private Integer sellTotal;
    @JsonProperty("sellWeekTotal")
    private Integer sellWeekTotal;
    @JsonProperty("sellMonthTotal")
    private Integer sellMonthTotal;
    @JsonProperty("sellTwoMonthTotal")
    private Integer sellTwoMonthTotal;
    @JsonProperty("sellYearTotal")
    private Integer sellYearTotal;
    @JsonProperty("sellWaiting")
    private Integer sellWaiting;
    @JsonProperty("sellPaymentProcessing")
    private Integer sellPaymentProcessing;
    @JsonProperty("sellPending")
    private Integer sellPending;
    @JsonProperty("sellDelivering")
    private Integer sellDelivering;
    @JsonProperty("sellDelivered")
    private Integer sellDelivered;
    @JsonProperty("sellCancelled")
    private Integer sellCancelled;
    @JsonProperty("sellCashback")
    private Integer sellCashback;
    @JsonProperty("skuTotal")
    private Integer skuTotal;
    @JsonProperty("skuActive")
    private Integer skuActive;
    @JsonProperty("view")
    private Integer view;
    @JsonProperty("salesTotal")
    private Integer salesTotal;
    @JsonProperty("salesWeekTotal")
    private Integer salesWeekTotal;
    @JsonProperty("salesMonthTotal")
    private Integer salesMonthTotal;
    @JsonProperty("salesTwoMonthTotal")
    private Integer salesTwoMonthTotal;
    @JsonProperty("salesYearTotal")
    private Integer salesYearTotal;
    @JsonProperty("totalPost")
    private Integer totalPost;
    @JsonProperty("totalInventory")
    private Integer totalInventory;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("totalSell")
    public Integer getTotalSell() {
        return totalSell;
    }

    @JsonProperty("totalSell")
    public void setTotalSell(Integer totalSell) {
        this.totalSell = totalSell;
    }

    @JsonProperty("sellTotal")
    public Integer getSellTotal() {
        return sellTotal;
    }

    @JsonProperty("sellTotal")
    public void setSellTotal(Integer sellTotal) {
        this.sellTotal = sellTotal;
    }

    @JsonProperty("sellWeekTotal")
    public Integer getSellWeekTotal() {
        return sellWeekTotal;
    }

    @JsonProperty("sellWeekTotal")
    public void setSellWeekTotal(Integer sellWeekTotal) {
        this.sellWeekTotal = sellWeekTotal;
    }

    @JsonProperty("sellMonthTotal")
    public Integer getSellMonthTotal() {
        return sellMonthTotal;
    }

    @JsonProperty("sellMonthTotal")
    public void setSellMonthTotal(Integer sellMonthTotal) {
        this.sellMonthTotal = sellMonthTotal;
    }

    @JsonProperty("sellTwoMonthTotal")
    public Integer getSellTwoMonthTotal() {
        return sellTwoMonthTotal;
    }

    @JsonProperty("sellTwoMonthTotal")
    public void setSellTwoMonthTotal(Integer sellTwoMonthTotal) {
        this.sellTwoMonthTotal = sellTwoMonthTotal;
    }

    @JsonProperty("sellYearTotal")
    public Integer getSellYearTotal() {
        return sellYearTotal;
    }

    @JsonProperty("sellYearTotal")
    public void setSellYearTotal(Integer sellYearTotal) {
        this.sellYearTotal = sellYearTotal;
    }

    @JsonProperty("sellWaiting")
    public Integer getSellWaiting() {
        return sellWaiting;
    }

    @JsonProperty("sellWaiting")
    public void setSellWaiting(Integer sellWaiting) {
        this.sellWaiting = sellWaiting;
    }

    @JsonProperty("sellPaymentProcessing")
    public Integer getSellPaymentProcessing() {
        return sellPaymentProcessing;
    }

    @JsonProperty("sellPaymentProcessing")
    public void setSellPaymentProcessing(Integer sellPaymentProcessing) {
        this.sellPaymentProcessing = sellPaymentProcessing;
    }

    @JsonProperty("sellPending")
    public Integer getSellPending() {
        return sellPending;
    }

    @JsonProperty("sellPending")
    public void setSellPending(Integer sellPending) {
        this.sellPending = sellPending;
    }

    @JsonProperty("sellDelivering")
    public Integer getSellDelivering() {
        return sellDelivering;
    }

    @JsonProperty("sellDelivering")
    public void setSellDelivering(Integer sellDelivering) {
        this.sellDelivering = sellDelivering;
    }

    @JsonProperty("sellDelivered")
    public Integer getSellDelivered() {
        return sellDelivered;
    }

    @JsonProperty("sellDelivered")
    public void setSellDelivered(Integer sellDelivered) {
        this.sellDelivered = sellDelivered;
    }

    @JsonProperty("sellCancelled")
    public Integer getSellCancelled() {
        return sellCancelled;
    }

    @JsonProperty("sellCancelled")
    public void setSellCancelled(Integer sellCancelled) {
        this.sellCancelled = sellCancelled;
    }

    @JsonProperty("sellCashback")
    public Integer getSellCashback() {
        return sellCashback;
    }

    @JsonProperty("sellCashback")
    public void setSellCashback(Integer sellCashback) {
        this.sellCashback = sellCashback;
    }

    @JsonProperty("skuTotal")
    public Integer getSkuTotal() {
        return skuTotal;
    }

    @JsonProperty("skuTotal")
    public void setSkuTotal(Integer skuTotal) {
        this.skuTotal = skuTotal;
    }

    @JsonProperty("skuActive")
    public Integer getSkuActive() {
        return skuActive;
    }

    @JsonProperty("skuActive")
    public void setSkuActive(Integer skuActive) {
        this.skuActive = skuActive;
    }

    @JsonProperty("view")
    public Integer getView() {
        return view;
    }

    @JsonProperty("view")
    public void setView(Integer view) {
        this.view = view;
    }

    @JsonProperty("salesTotal")
    public Integer getSalesTotal() {
        return salesTotal;
    }

    @JsonProperty("salesTotal")
    public void setSalesTotal(Integer salesTotal) {
        this.salesTotal = salesTotal;
    }

    @JsonProperty("salesWeekTotal")
    public Integer getSalesWeekTotal() {
        return salesWeekTotal;
    }

    @JsonProperty("salesWeekTotal")
    public void setSalesWeekTotal(Integer salesWeekTotal) {
        this.salesWeekTotal = salesWeekTotal;
    }

    @JsonProperty("salesMonthTotal")
    public Integer getSalesMonthTotal() {
        return salesMonthTotal;
    }

    @JsonProperty("salesMonthTotal")
    public void setSalesMonthTotal(Integer salesMonthTotal) {
        this.salesMonthTotal = salesMonthTotal;
    }

    @JsonProperty("salesTwoMonthTotal")
    public Integer getSalesTwoMonthTotal() {
        return salesTwoMonthTotal;
    }

    @JsonProperty("salesTwoMonthTotal")
    public void setSalesTwoMonthTotal(Integer salesTwoMonthTotal) {
        this.salesTwoMonthTotal = salesTwoMonthTotal;
    }

    @JsonProperty("salesYearTotal")
    public Integer getSalesYearTotal() {
        return salesYearTotal;
    }

    @JsonProperty("salesYearTotal")
    public void setSalesYearTotal(Integer salesYearTotal) {
        this.salesYearTotal = salesYearTotal;
    }

    @JsonProperty("totalPost")
    public Integer getTotalPost() {
        return totalPost;
    }

    @JsonProperty("totalPost")
    public void setTotalPost(Integer totalPost) {
        this.totalPost = totalPost;
    }

    @JsonProperty("totalInventory")
    public Integer getTotalInventory() {
        return totalInventory;
    }

    @JsonProperty("totalInventory")
    public void setTotalInventory(Integer totalInventory) {
        this.totalInventory = totalInventory;
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
