package com.codeko.moments.ui.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.codeko.moments.di.component.ActivityComponent;
import com.codeko.moments.di.component.DaggerActivityComponent;
import com.codeko.moments.di.module.ActivityModule;

public abstract class BaseActivity extends AppCompatActivity implements MvpView {

    private ActivityComponent mActivityComponent;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mActivityComponent = DaggerActivityComponent.builder()
                .activityModule(new ActivityModule(this))
                .build();
    }

    public ActivityComponent getActivityComponent() {
        return mActivityComponent;
    }
    @Override
    public void showLoading() {
        System.out.println("show loading");
    }

    @Override
    public void hideLoading() {
        System.out.println("hide loading");
    }
}
