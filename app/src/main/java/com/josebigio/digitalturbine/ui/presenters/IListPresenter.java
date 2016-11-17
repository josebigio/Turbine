package com.josebigio.digitalturbine.ui.presenters;

import com.josebigio.digitalturbine.models.DetailModel;
import com.josebigio.digitalturbine.ui.views.ListView;

/**
 * <h1>IListPresenter</h1>
 */
public interface IListPresenter {

    void setView(ListView listView);
    void onItemClicked(DetailModel detailModel);
}
