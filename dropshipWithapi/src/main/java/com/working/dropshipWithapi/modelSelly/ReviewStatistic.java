
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
    "total",
    "scoreAverage",
    "scoreAverageProduct",
    "scoreAverageSupplier",
    "scoreAverageWeekTotal",
    "scoreAverageMonthTotal",
    "scoreAverageTwoMonthTotal",
    "scoreAverageYearTotal",
    "totalReview",
    "totalHasContent",
    "totalHasMedia",
    "totalScore1",
    "totalScore2",
    "totalScore3",
    "totalScore4",
    "totalScore5",
    "totalScoreProduct",
    "TotalScoreSupplier",
    "totalReviewProduct",
    "totalReviewSupplier"
})
@Generated("jsonschema2pojo")
public class ReviewStatistic {

    @JsonProperty("total")
    private Integer total;
    @JsonProperty("scoreAverage")
    private Integer scoreAverage;
    @JsonProperty("scoreAverageProduct")
    private Integer scoreAverageProduct;
    @JsonProperty("scoreAverageSupplier")
    private Integer scoreAverageSupplier;
    @JsonProperty("scoreAverageWeekTotal")
    private Integer scoreAverageWeekTotal;
    @JsonProperty("scoreAverageMonthTotal")
    private Integer scoreAverageMonthTotal;
    @JsonProperty("scoreAverageTwoMonthTotal")
    private Integer scoreAverageTwoMonthTotal;
    @JsonProperty("scoreAverageYearTotal")
    private Integer scoreAverageYearTotal;
    @JsonProperty("totalReview")
    private Integer totalReview;
    @JsonProperty("totalHasContent")
    private Integer totalHasContent;
    @JsonProperty("totalHasMedia")
    private Integer totalHasMedia;
    @JsonProperty("totalScore1")
    private Integer totalScore1;
    @JsonProperty("totalScore2")
    private Integer totalScore2;
    @JsonProperty("totalScore3")
    private Integer totalScore3;
    @JsonProperty("totalScore4")
    private Integer totalScore4;
    @JsonProperty("totalScore5")
    private Integer totalScore5;
    @JsonProperty("totalScoreProduct")
    private Integer totalScoreProduct;
    @JsonProperty("TotalScoreSupplier")
    private Integer totalScoreSupplier;
    @JsonProperty("totalReviewProduct")
    private Integer totalReviewProduct;
    @JsonProperty("totalReviewSupplier")
    private Integer totalReviewSupplier;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("total")
    public Integer getTotal() {
        return total;
    }

    @JsonProperty("total")
    public void setTotal(Integer total) {
        this.total = total;
    }

    @JsonProperty("scoreAverage")
    public Integer getScoreAverage() {
        return scoreAverage;
    }

    @JsonProperty("scoreAverage")
    public void setScoreAverage(Integer scoreAverage) {
        this.scoreAverage = scoreAverage;
    }

    @JsonProperty("scoreAverageProduct")
    public Integer getScoreAverageProduct() {
        return scoreAverageProduct;
    }

    @JsonProperty("scoreAverageProduct")
    public void setScoreAverageProduct(Integer scoreAverageProduct) {
        this.scoreAverageProduct = scoreAverageProduct;
    }

    @JsonProperty("scoreAverageSupplier")
    public Integer getScoreAverageSupplier() {
        return scoreAverageSupplier;
    }

    @JsonProperty("scoreAverageSupplier")
    public void setScoreAverageSupplier(Integer scoreAverageSupplier) {
        this.scoreAverageSupplier = scoreAverageSupplier;
    }

    @JsonProperty("scoreAverageWeekTotal")
    public Integer getScoreAverageWeekTotal() {
        return scoreAverageWeekTotal;
    }

    @JsonProperty("scoreAverageWeekTotal")
    public void setScoreAverageWeekTotal(Integer scoreAverageWeekTotal) {
        this.scoreAverageWeekTotal = scoreAverageWeekTotal;
    }

    @JsonProperty("scoreAverageMonthTotal")
    public Integer getScoreAverageMonthTotal() {
        return scoreAverageMonthTotal;
    }

    @JsonProperty("scoreAverageMonthTotal")
    public void setScoreAverageMonthTotal(Integer scoreAverageMonthTotal) {
        this.scoreAverageMonthTotal = scoreAverageMonthTotal;
    }

    @JsonProperty("scoreAverageTwoMonthTotal")
    public Integer getScoreAverageTwoMonthTotal() {
        return scoreAverageTwoMonthTotal;
    }

    @JsonProperty("scoreAverageTwoMonthTotal")
    public void setScoreAverageTwoMonthTotal(Integer scoreAverageTwoMonthTotal) {
        this.scoreAverageTwoMonthTotal = scoreAverageTwoMonthTotal;
    }

    @JsonProperty("scoreAverageYearTotal")
    public Integer getScoreAverageYearTotal() {
        return scoreAverageYearTotal;
    }

    @JsonProperty("scoreAverageYearTotal")
    public void setScoreAverageYearTotal(Integer scoreAverageYearTotal) {
        this.scoreAverageYearTotal = scoreAverageYearTotal;
    }

    @JsonProperty("totalReview")
    public Integer getTotalReview() {
        return totalReview;
    }

    @JsonProperty("totalReview")
    public void setTotalReview(Integer totalReview) {
        this.totalReview = totalReview;
    }

    @JsonProperty("totalHasContent")
    public Integer getTotalHasContent() {
        return totalHasContent;
    }

    @JsonProperty("totalHasContent")
    public void setTotalHasContent(Integer totalHasContent) {
        this.totalHasContent = totalHasContent;
    }

    @JsonProperty("totalHasMedia")
    public Integer getTotalHasMedia() {
        return totalHasMedia;
    }

    @JsonProperty("totalHasMedia")
    public void setTotalHasMedia(Integer totalHasMedia) {
        this.totalHasMedia = totalHasMedia;
    }

    @JsonProperty("totalScore1")
    public Integer getTotalScore1() {
        return totalScore1;
    }

    @JsonProperty("totalScore1")
    public void setTotalScore1(Integer totalScore1) {
        this.totalScore1 = totalScore1;
    }

    @JsonProperty("totalScore2")
    public Integer getTotalScore2() {
        return totalScore2;
    }

    @JsonProperty("totalScore2")
    public void setTotalScore2(Integer totalScore2) {
        this.totalScore2 = totalScore2;
    }

    @JsonProperty("totalScore3")
    public Integer getTotalScore3() {
        return totalScore3;
    }

    @JsonProperty("totalScore3")
    public void setTotalScore3(Integer totalScore3) {
        this.totalScore3 = totalScore3;
    }

    @JsonProperty("totalScore4")
    public Integer getTotalScore4() {
        return totalScore4;
    }

    @JsonProperty("totalScore4")
    public void setTotalScore4(Integer totalScore4) {
        this.totalScore4 = totalScore4;
    }

    @JsonProperty("totalScore5")
    public Integer getTotalScore5() {
        return totalScore5;
    }

    @JsonProperty("totalScore5")
    public void setTotalScore5(Integer totalScore5) {
        this.totalScore5 = totalScore5;
    }

    @JsonProperty("totalScoreProduct")
    public Integer getTotalScoreProduct() {
        return totalScoreProduct;
    }

    @JsonProperty("totalScoreProduct")
    public void setTotalScoreProduct(Integer totalScoreProduct) {
        this.totalScoreProduct = totalScoreProduct;
    }

    @JsonProperty("TotalScoreSupplier")
    public Integer getTotalScoreSupplier() {
        return totalScoreSupplier;
    }

    @JsonProperty("TotalScoreSupplier")
    public void setTotalScoreSupplier(Integer totalScoreSupplier) {
        this.totalScoreSupplier = totalScoreSupplier;
    }

    @JsonProperty("totalReviewProduct")
    public Integer getTotalReviewProduct() {
        return totalReviewProduct;
    }

    @JsonProperty("totalReviewProduct")
    public void setTotalReviewProduct(Integer totalReviewProduct) {
        this.totalReviewProduct = totalReviewProduct;
    }

    @JsonProperty("totalReviewSupplier")
    public Integer getTotalReviewSupplier() {
        return totalReviewSupplier;
    }

    @JsonProperty("totalReviewSupplier")
    public void setTotalReviewSupplier(Integer totalReviewSupplier) {
        this.totalReviewSupplier = totalReviewSupplier;
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
