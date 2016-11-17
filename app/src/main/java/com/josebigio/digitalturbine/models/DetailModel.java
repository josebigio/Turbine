package com.josebigio.digitalturbine.models;


import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * <h1>DetailModel</h1>
 */
@Root(name = "ad",strict = false)
public class DetailModel {
    @Element(name = "appId")
    String appId;
    @Element(name = "campaignId")
    String campaignId;
    @Element(name = "campaignTypeId")
    String campaignTypeId;
    @Element(name = "productDescription")
    String productDescription;
    @Element(name = "productId")
    String productId;
    @Element(name = "isRandomPick")
    String isRandomPick;
    @Element(name = "callToAction")
    String callToAction;
    @Element(name = "categoryName")
    String categoryName;
    @Element(name = "bidRate")
    String bidRate;
    @Element(name = "creativeId")
    String creativeId;
    @Element(name = "campaignDisplayOrder")
    String campaignDisplayOrder;
    @Element(name = "averageRatingImageURL")
    String averageRatingImageURL;
    @Element(name = "clickProxyURL")
    String clickProxyURL;
//    @Element(name = "minOSVersion")
//    String minOSVersion;
    @Element(name = "rating")
    String rating;
    @Element(name = "productName")
    String productName;
    @Element(name = "impressionTrackingURL")
    String impressionTrackingURL;
    @Element(name = "homeScreen")
    String homeScreen;
    @Element(name = "numberOfRatings")
    String numberOfRatings;
    @Element(name = "productThumbnail")
    String productThumbnail;


    public String getAppId() {
        return appId;
    }

    public String getCampaignId() {
        return campaignId;
    }

    public String getCampaignTypeId() {
        return campaignTypeId;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public String getProductId() {
        return productId;
    }

    public String getIsRandomPick() {
        return isRandomPick;
    }

    public String getCallToAction() {
        return callToAction;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public String getBidRate() {
        return bidRate;
    }

    public String getCreativeId() {
        return creativeId;
    }

    public String getCampaignDisplayOrder() {
        return campaignDisplayOrder;
    }

    public String getAverageRatingImageURL() {
        return averageRatingImageURL;
    }

    public String getClickProxyURL() {
        return clickProxyURL;
    }

//    public String getMinOSVersion() {
//        return minOSVersion;
//    }

    public String getRating() {
        return rating;
    }

    public String getProductName() {
        return productName;
    }

    public String getImpressionTrackingURL() {
        return impressionTrackingURL;
    }

    public String getHomeScreen() {
        return homeScreen;
    }

    public String getNumberOfRatings() {
        return numberOfRatings;
    }

    public String getProductThumbnail() {
        return productThumbnail;
    }
}
