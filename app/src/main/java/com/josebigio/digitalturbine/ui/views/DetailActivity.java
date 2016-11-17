package com.josebigio.digitalturbine.ui.views;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

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


    @BindView(R.id.detail_rating_image)
    SimpleDraweeView detailedRatingImage;
    @BindView(R.id.productThumbnail)
    SimpleDraweeView productThumbnail;
    @BindView(R.id.detail_recycler)
    RecyclerView recyclerView;

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
        detailedRatingImage.setImageURI(detailModel.getAverageRatingImageURL());
        productThumbnail.setImageURI(detailModel.getProductThumbnail());
        DetailAdapter detailAdapter = new DetailAdapter(detailModel.getAllStringValues());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(recyclerView.getContext(),
                linearLayoutManager.getOrientation());
        recyclerView.addItemDecoration(dividerItemDecoration);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(detailAdapter);
        detailAdapter.notifyDataSetChanged();
        setTitle(detailModel.getProductName());

    }

}
