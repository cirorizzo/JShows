package com.github.cirorizzo.jshows.view;

import com.github.cirorizzo.jshows.model.cats.Cats;
import rx.Observable;

public interface ImagesAdapter {
    void setObservable(Observable<Cats> observableCats);
    void unsubscribe();
}
