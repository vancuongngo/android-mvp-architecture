package com.codeko.moments.di.module;

import android.support.v7.app.AppCompatActivity;

import com.codeko.moments.di.PerActivity;
import com.codeko.moments.ui.splash.SplashMvpPresenter;
import com.codeko.moments.ui.splash.SplashMvpView;

import dagger.Module;
import dagger.Provides;

@Module
public class ActivityModule {

    private AppCompatActivity mActivity;

    public ActivityModule(AppCompatActivity activity) {
        this.mActivity = activity;
    }

    @Provides
    @PerActivity
    public SplashMvpPresenter<SplashMvpView> provideSplashMvpPresenter(SplashMvpPresenter<SplashMvpView> presenter) {
        return presenter;
    }
}
