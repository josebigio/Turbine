package com.josebigio.digitalturbine.ui.views;

import android.support.v7.widget.RecyclerView;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.josebigio.digitalturbine.R;

import java.util.List;

/**
 * <h1>DetailAdapter</h1>
 */
public class DetailAdapter extends RecyclerView.Adapter<Detail> {

    private List<Pair<String,String>> dataSource;

    public DetailAdapter(List<Pair<String,String>>dataSource) {
        this.dataSource = dataSource;
    }


    @Override
    public Detail onCreateViewHolder(ViewGroup parent, int viewType) {
        return new Detail(LayoutInflater.from(parent.getContext()).inflate(R.layout.detail_item_layout,parent,false));
    }

    @Override
    public void onBindViewHolder(Detail holder, int position) {
        holder.leftTV.setText(dataSource.get(position).first);
        holder.rightTV.setText(dataSource.get(position).second);
    }

    @Override
    public int getItemCount() {
        return dataSource.size();
    }
}
