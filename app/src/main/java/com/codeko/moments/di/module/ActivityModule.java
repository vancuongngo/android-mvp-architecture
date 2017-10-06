package com.codeko.moments.di.module;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;

import com.codeko.moments.di.ActivityContext;
import com.codeko.moments.di.PerActivity;
import com.codeko.moments.ui.splash.SplashContract;
import com.codeko.moments.utils.rx.AppSchedulerProvider;
import com.codeko.moments.utils.rx.SchedulerProvider;

import dagger.Module;
import dagger.Provides;
import io.reactivex.disposables.CompositeDisposable;

/**
 * Created by nvcuong on 10/5/17.
 */

@Module
public class ActivityModule {

    private AppCompatActivity mActivity;

    public ActivityModule(AppCompatActivity activity) {
        this.mActivity = activity;
    }

    @Provides
    @ActivityContext
    Context provideContext() {
        return mActivity;
    }

    @Provides
    AppCompatActivity provideActivity() {
        return mActivity;
    }

    @Provides
    CompositeDisposable provideCompositeDisposable() {
        return new CompositeDisposable();
    }

    @Provides
    SchedulerProvider provideSchedulerProvider() {
        return new AppSchedulerProvider();
    }

    @Provides
    @PerActivity
    SplashContract.Presenter<SplashContract.View> provideSplashPresenter(
            SplashContract.Presenter<SplashContract.View> presenter) {
        return presenter;
    }
}
