package com.codeko.moments.ui.splash;

import android.os.Bundle;

import com.codeko.moments.R;
import com.codeko.moments.ui.base.BaseActivity;

import javax.inject.Inject;

public class SplashActivity extends BaseActivity implements SplashMvpView{

    /*
    * Activity khong co constructor, do do phai dung field inject dependency
    * Inject field dependency duoc goi bang tay thong qua method inject cua component
    * */
    @Inject
    SplashMvpPresenter<SplashMvpView> mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        getActivityComponent().inject(this);
    }

    @Override
    public void openLoginActivity() {
        System.out.println("open login activity");
    }

    @Override
    public void openMainActivity() {
        System.out.println("open main activity");
    }
}
