package com.github.cirorizzo.jshows.network;

import com.github.cirorizzo.jshows.BuildConfig;
import com.github.cirorizzo.jshows.model.cats.Cats;

import retrofit2.http.GET;
import rx.Observable;

public interface CatAPI {
    @GET("/api/images/get?format=xml&results_per_page=" + BuildConfig.MAX_IMAGES_PER_REQUEST)
    Observable<Cats> getCatImageURLs();
}
