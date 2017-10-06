package com.codeko.moments.di.component;

import com.codeko.moments.di.PerActivity;
import com.codeko.moments.di.module.ActivityModule;
import com.codeko.moments.ui.login.LoginActivity;
import com.codeko.moments.ui.splash.SplashActivity;

import dagger.Component;

/**
 * Created by nvcuong on 10/5/17.
 */

@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = {ActivityModule.class})
public interface ActivityComponent {

    void inject(SplashActivity activity);

    void inject(LoginActivity activity);
}
