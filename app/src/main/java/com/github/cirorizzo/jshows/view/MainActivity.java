package com.github.cirorizzo.jshows.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.github.cirorizzo.jshows.JShowsApplication;
import com.github.cirorizzo.jshows.R;
import com.github.cirorizzo.jshows.presenter.MasterPresenterImpl;

public class MainActivity extends AppCompatActivity implements MainActivityInterface{
    private ImagesAdapterImpl imagesAdapterImpl;
    private MasterPresenterImpl masterPresenterImpl;

    private RecyclerView containerRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        injectObjects();

        initRecyclerView();
        connectingToMasterPresenter();
        //getURLs();
    }

    private void injectObjects() {
        // Dependency Injection
        masterPresenterImpl = ((JShowsApplication) getApplication()).createMasterPresenterInject().provideMasterPresenterImpl();

        // Not Dependency Injection
        imagesAdapterImpl = new ImagesAdapterImpl();
    }

    private void initRecyclerView() {
        containerRecyclerView = (RecyclerView) findViewById(R.id.containerRecyclerView);
        containerRecyclerView.setLayoutManager(new GridLayoutManager(this, 1));
        containerRecyclerView.setAdapter(imagesAdapterImpl);
    }

    private void connectingToMasterPresenter() {
        masterPresenterImpl.connect(this, imagesAdapterImpl);
    }

    private void getURLs() {
        masterPresenterImpl.getMasterRequest();
    }
}
