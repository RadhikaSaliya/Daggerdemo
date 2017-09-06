package com.user.canopas.daggerdemo;


import android.app.Application;

import com.user.canopas.daggerdemo.Component.DaggerImageDownloaderComponent;
import com.user.canopas.daggerdemo.Component.ImageDownloaderComponent;
import com.user.canopas.daggerdemo.Module.ImageDownloaderModule;

public class MyApp extends Application {

    private static MyApp app;
    private ImageDownloaderComponent downloaderComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        app = this;
        this.downloaderComponent = DaggerImageDownloaderComponent.builder().imageDownloaderModule(new ImageDownloaderModule(this)).build();
    }

    public ImageDownloaderComponent getImageDownloaderComponent(){
        return this.downloaderComponent;
    }

    public static MyApp app() {
        return app;
    }
}
