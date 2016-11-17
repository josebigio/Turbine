package com.josebigio.digitalturbine.ui.presenters;

import com.josebigio.digitalturbine.models.DetailModel;
import com.josebigio.digitalturbine.ui.views.DetailView;

/**
 * <h1>ICardPresenter</h1>
 */
public interface ICardPresenter {

    void setDetailedProduct(DetailModel detailedProduct);
    void setView(DetailView detailView);
}
