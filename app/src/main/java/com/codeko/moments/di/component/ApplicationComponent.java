package com.codeko.moments.di.component;

import android.app.Application;
import android.content.Context;

import com.codeko.moments.MyApplication;
import com.codeko.moments.data.DataManager;
import com.codeko.moments.di.ApplicationContext;
import com.codeko.moments.di.module.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by nvcuong on 10/5/17.
 */

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(MyApplication application);

    @ApplicationContext
    Context context();

    Application application();

    DataManager getDataManager();

}
