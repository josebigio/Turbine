package com.josebigio.digitalturbine.ui.views;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;
import com.josebigio.digitalturbine.R;
import com.josebigio.digitalturbine.models.DetailModel;
import com.josebigio.digitalturbine.ui.presenters.CardPresenter;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * <h1>DetailActivity</h1>
 */
public class DetailActivity extends AppCompatActivity implements DetailView {

    public final static String EXTRA_DETAILED_PRODUCT = "detailedProduct";


    @BindView(R.id.app_id_tv)
    TextView appId;
    @BindView(R.id.detail_rating_image)
    SimpleDraweeView detailedRatingImage;
    @BindView(R.id.bid_rate)
    TextView bidRate;
    @BindView(R.id.call_to_action)
    TextView callToAction;
    @BindView(R.id.campaign_display_order)
    TextView cdo;
    @BindView(R.id.campaign_id)
    TextView campaignId;
    @BindView(R.id.campaign_type_id)
    TextView campaignTypeId;
    @BindView(R.id.category_name)
    TextView categoryName;
    @BindView(R.id.click_proxy_url)
    TextView clickProxy;
    @BindView(R.id.creative_id)
    TextView creativeId;
    @BindView(R.id.homeScreen)
    TextView homeScreen;
    @BindView(R.id.impressionTrackingURL)
    TextView impressionTrackingURL;
    @BindView(R.id.isRandomPick)
    TextView isRandomPick;
    @BindView(R.id.minOSVersion)
    TextView minOSVersion;
    @BindView(R.id.numberOfRatings)
    TextView numberOfRatings;
    @BindView(R.id.productDescription)
    TextView productDescription;
    @BindView(R.id.productThumbnail)
    SimpleDraweeView productThumbnail;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detailed_layout);
        ButterKnife.bind(this);
        Intent intent = getIntent();
        DetailModel model = (DetailModel)intent.getSerializableExtra(EXTRA_DETAILED_PRODUCT);
        CardPresenter.get().setDetailedProduct(model);
    }

    @Override
    protected void onResume() {
        super.onResume();
        CardPresenter.get().setView(this);
    }


    @Override
    public void draw(DetailModel detailModel) {
        appId.setText(detailModel.getAppId());
        detailedRatingImage.setImageURI(detailModel.getAverageRatingImageURL());
        bidRate.setText(detailModel.getBidRate());
        callToAction.setText(detailModel.getCallToAction());
        cdo.setText(detailModel.getCampaignDisplayOrder());
        campaignId.setText(detailModel.getCampaignId());
        campaignTypeId.setText(detailModel.getCampaignTypeId());
        categoryName.setText(detailModel.getCategoryName());
        clickProxy.setText(detailModel.getClickProxyURL());
        homeScreen.setText(detailModel.getHomeScreen());
        creativeId.setText(detailModel.getCreativeId());
        impressionTrackingURL.setText(detailModel.getImpressionTrackingURL());
        isRandomPick.setText(detailModel.getIsRandomPick());
        numberOfRatings.setText(detailModel.getNumberOfRatings());
        productDescription.setText(detailModel.getProductDescription());
        productThumbnail.setImageURI(detailModel.getProductThumbnail());
        setTitle(detailModel.getProductName());

    }
}
