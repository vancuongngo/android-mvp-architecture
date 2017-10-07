package com.codeko.moments.di.component;

import com.codeko.moments.MyApplication;
import com.codeko.moments.di.module.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {
    void inject(MyApplication application);
}
