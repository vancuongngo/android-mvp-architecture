package com.codeko.moments;

import android.app.Application;

import com.codeko.moments.di.component.ApplicationComponent;
import com.codeko.moments.di.component.DaggerApplicationComponent;
import com.codeko.moments.di.module.ApplicationModule;

public class MyApplication extends Application {

    private ApplicationComponent mApplicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        mApplicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();

        mApplicationComponent.inject(this);
    }
}
