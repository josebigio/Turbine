package com.josebigio.digitalturbine.ui.views;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.josebigio.digitalturbine.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * <h1>Product</h1>
 */
public class Product extends RecyclerView.ViewHolder {

    @BindView(R.id.product_name) TextView productName;
    @BindView(R.id.product_thumbnail) ImageView thumbnail;
    @BindView(R.id.product_rating) TextView rating;

    public Product(View itemView) {
        super(itemView);
        ButterKnife.bind(this,itemView);
    }

}
