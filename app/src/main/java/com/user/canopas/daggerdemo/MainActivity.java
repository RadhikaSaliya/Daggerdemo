package com.user.canopas.daggerdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.user.canopas.daggerdemo.Component.ImageDownloaderComponent;
import com.user.canopas.daggerdemo.Module.ImageDownloaderModule;
import com.user.canopas.daggerdemo.model.ImageDownloader;

import javax.inject.Inject;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    @Bind(R.id.main_image)
    ImageView img;
    private ImageDownloaderComponent downloaderComponent;
    @Inject
    ImageDownloader downloader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

//        downloaderComponent = DaggerAppComponent.builder().appModule(new ImageDownloaderModule(this)).build();
//        downloaderComponent.inject(this);
        MyApp.app().getImageDownloaderComponent().inject(this);
        downloader.toImageView(img, "http://i.imgur.com/EjH6r8C.png");


    }

}
