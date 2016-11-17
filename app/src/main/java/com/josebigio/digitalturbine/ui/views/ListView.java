package com.josebigio.digitalturbine.ui.views;

import com.josebigio.digitalturbine.models.DetailModel;

import java.util.List;

/**
 * <h1>ListView</h1>
 */
public interface ListView {

    void draw(List<DetailModel> data);
    void showLoading(boolean show);
    void startDetailedView(DetailModel detailModel);
}
