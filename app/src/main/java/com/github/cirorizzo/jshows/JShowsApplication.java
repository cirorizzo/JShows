package com.github.cirorizzo.jshows;

import android.app.Application;

import com.github.cirorizzo.jshows.presenter.MasterPresenterInject;

public class JShowsApplication extends Application {
    private MasterPresenterInject masterPresenterInject;

    public MasterPresenterInject createMasterPresenterInject() {
        return new MasterPresenterInject();
    }
}
