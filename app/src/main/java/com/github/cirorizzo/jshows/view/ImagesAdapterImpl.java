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
    private Subscriber<Cats> subscriber;

    @Override
    public ImagesURLsDataHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ImagesURLsDataHolder(
                LayoutInflater.from(parent.getContext()).inflate(R.layout.row_card_view, parent, false));
    }

    @Override
    public void onBindViewHolder(ImagesURLsDataHolder holder, int position) {
        String strURL = "";
        if (cats.getData().getImages().get(position).getUrl() != null) {
            strURL = cats.getData().getImages().get(position).getUrl();
        }

        holder.bindImages(strURL);
    }

    @Override
    public int getItemCount() {
        if ((cats != null) &&
                (cats.getData() != null) &&
                (cats.getData().getImages()!= null)) {
            return cats.getData().getImages().size();
        }

        return 0;
    }

    private void setData(Cats cats) {
        this.cats = cats;
    }

    @Override
    public void setObservable(Observable<Cats> observableCats) {
        if (subscriber == null) {
            subscriber = getSubscriber();
        }

        if (subscriber.isUnsubscribed()) {
            observableCats.subscribe(subscriber);
        }
    }

    @Override
    public void unsubscribe() {
        if (!subscriber.isUnsubscribed()) {
            subscriber.unsubscribe();
        }
    }

    private Subscriber<Cats> getSubscriber() {
        Subscriber<Cats> subscriber = new Subscriber<Cats>() {
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
        };

        return subscriber;
    }
}
