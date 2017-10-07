package com.codeko.moments.di.module;

import android.app.Application;

import dagger.Module;

@Module
public class ApplicationModule {

    private final Application mApplication;

    public ApplicationModule(Application application) {
        this.mApplication = application;
    }
}
