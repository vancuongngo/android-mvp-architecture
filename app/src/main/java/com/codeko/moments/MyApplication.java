package com.codeko.moments;

import android.app.Application;

import com.codeko.moments.data.DataManager;
import com.codeko.moments.di.component.ApplicationComponent;
import com.codeko.moments.di.component.DaggerApplicationComponent;
import com.codeko.moments.di.module.ApplicationModule;
import com.codeko.moments.utils.AppLogger;

import javax.inject.Inject;

/**
 * Created by nvcuong on 10/5/17.
 */

public class MyApplication extends Application {

    @Inject
    DataManager mDataManager;

    private ApplicationComponent mApplicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        mApplicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();

        mApplicationComponent.inject(this);

        AppLogger.init();
    }

    public ApplicationComponent getComponent() {
        return mApplicationComponent;
    }
}
