package com.josebigio.digitalturbine.ui.views;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.josebigio.digitalturbine.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * <h1>Detail</h1>
 */
public class Detail extends RecyclerView.ViewHolder {

    @BindView(R.id.detail_item_left_tv) TextView leftTV;
    @BindView(R.id.detail_item_right_tv) TextView rightTV;

    public Detail(View itemView) {
        super(itemView);
        ButterKnife.bind(this,itemView);
    }
}
