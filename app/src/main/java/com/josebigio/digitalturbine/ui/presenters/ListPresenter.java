package com.josebigio.digitalturbine.ui.presenters;

import android.util.Log;

import com.josebigio.digitalturbine.models.DetailModel;
import com.josebigio.digitalturbine.providers.ProductProvider;
import com.josebigio.digitalturbine.ui.views.ListView;

import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * <h1>ListPresenter</h1>
 */
public class ListPresenter implements IListPresenter {

    private ListView listView;
    private static final String TAG = ListPresenter.class.getCanonicalName();
    private static ListPresenter instance;

    private ListPresenter() {}

    public static ListPresenter get() {
        if(instance == null) {
            instance = new ListPresenter();
        }
        return instance;
    }

    @Override
    public void setView(ListView listView) {
        this.listView = listView;
        fetchList();
    }

    @Override
    public void onItemClicked(DetailModel detailModel) {
        Log.d(TAG,"on item clicked: " + detailModel);
        listView.startDetailedView(detailModel);

    }


    private void fetchList() {
        listView.showLoading(true);
        ProductProvider.get().getProductList()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                        listModel -> {
                            listView.draw(listModel.getDetails());
                            listView.showLoading(false);
                        }
                        ,error->{
                            Log.d(TAG,error.toString());
                            listView.showLoading(false);
                        });
    }

}
