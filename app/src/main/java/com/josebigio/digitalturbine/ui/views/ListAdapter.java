package com.josebigio.digitalturbine.ui.views;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.josebigio.digitalturbine.R;
import com.josebigio.digitalturbine.models.DetailModel;
import com.josebigio.digitalturbine.ui.presenters.ListPresenter;

import java.util.List;

/**
 * <h1>ListAdapter</h1>
 */
public class ListAdapter extends RecyclerView.Adapter<Product> {

    List<DetailModel> dataSource;

    public ListAdapter(List<DetailModel> dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public Product onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        return new Product(layoutInflater.inflate(R.layout.product_item,parent,false));
    }

    @Override
    public void onBindViewHolder(Product holder, int position) {
        DetailModel detailModel = dataSource.get(position);
        holder.productName.setText(detailModel.getProductName());
        holder.thumbnail.setImageURI(detailModel.getProductThumbnail());
        holder.rating.setImageURI(detailModel.getAverageRatingImageURL());
        holder.thumbnail.setOnClickListener(view -> {
            ListPresenter.get().onItemClicked(detailModel);
        });
    }

    @Override
    public int getItemCount() {
        return dataSource.size();
    }
}
