package com.user.canopas.daggerdemo.Component;

import com.user.canopas.daggerdemo.MainActivity;
import com.user.canopas.daggerdemo.Module.ImageDownloaderModule;

import dagger.Component;

@Component(modules = ImageDownloaderModule.class)
public interface ImageDownloaderComponent {
    void inject(MainActivity mainActivity);
}
