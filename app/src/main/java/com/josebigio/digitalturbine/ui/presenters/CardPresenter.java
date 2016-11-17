package com.josebigio.digitalturbine.ui.presenters;

import com.josebigio.digitalturbine.models.DetailModel;
import com.josebigio.digitalturbine.ui.views.DetailView;

/**
 * <h1>CardPresenter</h1>
 */
public class CardPresenter implements ICardPresenter {

    private DetailModel detailModel;
    private DetailView detailView;
    private static CardPresenter instance;

    private CardPresenter(){}

    public static CardPresenter get() {
        if(instance == null) {
            instance = new CardPresenter();
        }
        return instance;
    }

    @Override
    public void setDetailedProduct(DetailModel detailedProduct) {
        this.detailModel = detailedProduct;
    }

    @Override
    public void setView(DetailView detailView) {
        this.detailView = detailView;
        detailView.draw(detailModel);
    }
}
