package com.josebigio.digitalturbine.providers;

import com.josebigio.digitalturbine.models.ListModel;
import com.josebigio.digitalturbine.network.ApiService;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.simplexml.SimpleXmlConverterFactory;
import rx.Observable;

/**
 * <h1>ProductProvider</h1>
 */
public class ProductProvider {

    private static ProductProvider instance;

    private ProductProvider(){}

    public static ProductProvider get() {
        if(instance == null) {
            instance = new ProductProvider();
        }
        return instance;
    }

   public Observable<ListModel> getProductList() {
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient client = new OkHttpClient
                .Builder()
                .connectTimeout(60, TimeUnit.SECONDS)
                .readTimeout(60, TimeUnit.SECONDS)
                .addInterceptor(logging)
                .build();


        Retrofit adapter = new Retrofit.Builder()
                .baseUrl("http://ads.appia.com/")
                .addConverterFactory(SimpleXmlConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .client(client)
                .build();
        HashMap<String,String> parameters = new HashMap<>();
        parameters.put("id","236");
        parameters.put("password","OVUJ1DJN");
        parameters.put("siteId","4288");
        parameters.put("deviceId","4230");
        parameters.put("sessionId","techtestsession");
        parameters.put("totalCampaignsRequested","10");

        return adapter.create(ApiService.class).getProductList(parameters);
    }



}
