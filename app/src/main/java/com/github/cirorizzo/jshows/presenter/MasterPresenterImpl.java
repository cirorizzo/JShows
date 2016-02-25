package com.github.cirorizzo.jshows.presenter;

import com.github.cirorizzo.jshows.model.cats.Cats;
import com.github.cirorizzo.jshows.network.CatAPINetwork;
import com.github.cirorizzo.jshows.view.ImagesAdapter;
import com.github.cirorizzo.jshows.view.MainActivityInterface;

import rx.Observable;

public class MasterPresenterImpl implements MasterPresenter {
    private MainActivityInterface mainActivityInterface;
    private ImagesAdapter imagesAdapter;

    @Override
    public void connect(MainActivityInterface mainActivityInterface, ImagesAdapter imagesAdapter) {
        this.mainActivityInterface = mainActivityInterface;
        this.imagesAdapter = imagesAdapter;
    }

    @Override
    public void getMasterRequest() {

        imagesAdapter.setObservable(getObservableMasterRequest(new CatAPINetwork()));
    }

    private Observable<Cats> getObservableMasterRequest(CatAPINetwork catAPINetwork) {
        return catAPINetwork.getExec();
    }
}
