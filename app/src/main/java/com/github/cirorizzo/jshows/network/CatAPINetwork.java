package com.github.cirorizzo.jshows.network;

import com.github.cirorizzo.jshows.model.cats.Cats;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.simplexml.SimpleXmlConverterFactory;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class CatAPINetwork {
    public Observable<Cats> getExec() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://thecatapi.com")
                .addConverterFactory(SimpleXmlConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();

        CatAPI catAPI = retrofit.create(CatAPI.class);

        return catAPI.getCatImageURLs().
                subscribeOn(Schedulers.io()).
                observeOn(AndroidSchedulers.mainThread());
    }
}
