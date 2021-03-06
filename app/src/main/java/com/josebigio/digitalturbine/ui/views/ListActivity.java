package com.josebigio.digitalturbine.ui.views;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.josebigio.digitalturbine.R;
import com.josebigio.digitalturbine.models.DetailModel;
import com.josebigio.digitalturbine.ui.presenters.IListPresenter;
import com.josebigio.digitalturbine.ui.presenters.ListPresenter;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ListActivity extends AppCompatActivity implements ListView {

    @BindView(R.id.recycler) RecyclerView recyclerView;
    ProgressDialog progressDialog;
    IListPresenter listPresenter = ListPresenter.get();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        progressDialog = new ProgressDialog(this);
        progressDialog.setCancelable(false);
        progressDialog.setCanceledOnTouchOutside(false);
    }

    @Override
    protected void onResume() {
        super.onResume();
        listPresenter.setView(this);
    }

    @Override
    public void draw(List<DetailModel> data) {
        ListAdapter listAdapter = new ListAdapter(data);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(recyclerView.getContext(),
                linearLayoutManager.getOrientation());
        recyclerView.addItemDecoration(dividerItemDecoration);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(listAdapter);
        listAdapter.notifyDataSetChanged();
    }


    @Override
    public void showLoading(boolean show) {
        if(show) {
            progressDialog.show();
        }
        else {
            progressDialog.dismiss();
        }
    }

    @Override
    public void startDetailedView(DetailModel detailModel) {
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra(DetailActivity.EXTRA_DETAILED_PRODUCT,detailModel);
        startActivity(intent);
    }

    @Override
    public Context getContext() {
        return this;
    }
}
