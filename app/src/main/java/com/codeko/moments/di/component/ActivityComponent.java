package com.codeko.moments.di.component;

import com.codeko.moments.di.PerActivity;
import com.codeko.moments.di.module.ActivityModule;
import com.codeko.moments.ui.splash.SplashActivity;

import dagger.Component;

@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = {ActivityModule.class})
public interface ActivityComponent {

    void inject(SplashActivity activity);
}
