package com.github.cirorizzo.jshows.view;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.github.cirorizzo.jshows.R;

public class ImagesURLsDataHolder extends RecyclerView.ViewHolder {
    private final String TAG = ImagesURLsDataHolder.class.getSimpleName();
    private ImageView imgVw_cat;

    public ImagesURLsDataHolder(View itemView) {
        super(itemView);

        imgVw_cat = (ImageView) itemView.findViewById(R.id.imgVw_cat);
    }

    public void bindImages(String imgURL) {
        Log.d(TAG, String.format("URL: %s", imgURL));

        Glide.with(itemView.getContext()).
                load(imgURL).
                placeholder(R.mipmap.document_image_cancel).
                diskCacheStrategy(DiskCacheStrategy.ALL).
                fitCenter().
                into(imgVw_cat);

    }

}
