package com.josebigio.digitalturbine.network;

import com.josebigio.digitalturbine.models.ListModel;

import java.util.HashMap;

import retrofit2.http.GET;
import retrofit2.http.QueryMap;
import rx.Observable;

/**
 * <h1>ApiService</h1>
 */
public interface ApiService {

    @GET("/getAds/")
    Observable<ListModel> getProductList(@QueryMap HashMap<String,String> params);
}
