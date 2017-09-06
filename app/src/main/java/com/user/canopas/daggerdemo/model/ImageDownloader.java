package com.user.canopas.daggerdemo.model;


import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import javax.inject.Singleton;

import dagger.Provides;

public class ImageDownloader {

    private Context context;

    public ImageDownloader(Context context) {
        this.context = context;
    }

    public void toImageView(ImageView imageView, String url){
        Glide.with(context).load(url).into(imageView);

    }
}
