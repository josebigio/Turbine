package com.josebigio.digitalturbine.models;


import android.util.Pair;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * <h1>DetailModel</h1>
 */
@Root(name = "ad",strict = false)
public class DetailModel implements Serializable {
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

    public List<Pair<String,String>> getAllStringValues() {
        List<Pair<String,String>> result = new ArrayList<>();
        result.add(new Pair<>("appId",appId));
        result.add(new Pair<>("campaignId",campaignId));
        result.add(new Pair<>("campaignTypeId",campaignTypeId));
        result.add(new Pair<>("productDescription",productDescription));
        result.add(new Pair<>("productId",productId));
        result.add(new Pair<>("isRandomPick",isRandomPick));
        result.add(new Pair<>("callToAction",callToAction));
        result.add(new Pair<>("categoryName",categoryName));
        result.add(new Pair<>("bidRate",bidRate));
        result.add(new Pair<>("creativeId",creativeId));
        result.add(new Pair<>("campaignDisplayOrder",campaignDisplayOrder));
        result.add(new Pair<>("averageRatingImageURL",averageRatingImageURL));
        result.add(new Pair<>("bidRate",bidRate));
        result.add(new Pair<>("creativeId",creativeId));
        result.add(new Pair<>("campaignDisplayOrder",campaignDisplayOrder));
        result.add(new Pair<>("clickProxyURL",clickProxyURL));
        result.add(new Pair<>("impressionTrackingURL",impressionTrackingURL));
        result.add(new Pair<>("homeScreen",homeScreen));
        result.add(new Pair<>("numberOfRatings",numberOfRatings));
        return result;
    }
}
