package com.github.cirorizzo.jshows.view;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.github.cirorizzo.jshows.R;
import com.github.cirorizzo.jshows.model.cats.Cats;

import rx.Observable;
import rx.Subscriber;

public class ImagesAdapterImpl extends RecyclerView.Adapter<ImagesURLsDataHolder> implements ImagesAdapter {
    private final String TAG = ImagesAdapterImpl.class.getSimpleName();
    private Cats cats;

    @Override
    public ImagesURLsDataHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ImagesURLsDataHolder(
                LayoutInflater.from(parent.getContext()).inflate(R.layout.row_card_view, parent, false));
    }

    @Override
    public void onBindViewHolder(ImagesURLsDataHolder holder, int position) {
        String strURL = "";
        if (cats.getResponse().getData().getImages().getImage()[position].getUrl() != null) {
            strURL = cats.getResponse().getData().getImages().getImage()[position].getUrl();
        }

        holder.bindImages(strURL);
    }

    @Override
    public int getItemCount() {
//        if ((cats != null) &&
//                (cats.getResponse() != null) &&
//                (cats.getResponse().getData() != null) &&
//                (cats.getResponse().getData().getImages()!= null) &&
//                (cats.getResponse().getData().getImages().getImage() != null)) {
//            return cats.getResponse().getData().getImages().getImage().length;
//        }

        return 0;
    }

    private void setData(Cats cats) {
        this.cats = cats;
    }

    @Override
    public void setObservable(Observable<Cats> observableCats) {
        observableCats.subscribe(new Subscriber<Cats>() {
            @Override
            public void onCompleted() {
                Log.d(TAG, "onCompleted");
                notifyDataSetChanged();
            }

            @Override
            public void onNext(Cats cats) {
                Log.d(TAG, "onNextNew");
                setData(cats);
            }
            @Override
            public void onError(Throwable e) {
                //TODO : Handle error here
                Log.d(TAG, "" + e.getMessage());
            }
        });
    }
}
