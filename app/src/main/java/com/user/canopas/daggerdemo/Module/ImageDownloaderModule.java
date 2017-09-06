package com.user.canopas.daggerdemo.Module;


import android.content.Context;

import com.user.canopas.daggerdemo.model.ImageDownloader;

import dagger.Module;
import dagger.Provides;

@Module
public class ImageDownloaderModule {
    private Context context;

    public ImageDownloaderModule(Context context){
        this.context = context;
    }

    @Provides
    Context provideContext()
    {return this.context;}
    @Provides
    ImageDownloader provideImageDownloader(Context context){
        return new ImageDownloader(context);
    }


}
