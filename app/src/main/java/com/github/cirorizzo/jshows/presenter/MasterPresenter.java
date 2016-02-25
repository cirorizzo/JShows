package com.github.cirorizzo.jshows.presenter;

import com.github.cirorizzo.jshows.view.ImagesAdapter;
import com.github.cirorizzo.jshows.view.MainActivityInterface;

public interface MasterPresenter {
    void connect(MainActivityInterface mainActivityInterface, ImagesAdapter imagesAdapter);
    void getMasterRequest();
}
