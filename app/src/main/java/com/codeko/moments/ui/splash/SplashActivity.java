package com.codeko.moments.ui.splash;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.StringRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.codeko.moments.R;
import com.codeko.moments.ui.base.BaseActivity;
import com.codeko.moments.ui.login.LoginActivity;

import javax.inject.Inject;

public class SplashActivity extends BaseActivity implements SplashContract.View{

    @Inject
    SplashContract.Presenter<SplashContract.View> mPresenter;

    public static Intent getStartIntent(Context context) {
        Intent intent = new Intent(context, SplashActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        getActivityComponent().inject(this);

        mPresenter.onAttach(SplashActivity.this);
    }

    @Override
    public void openLoginActivity() {
        Intent intent = LoginActivity.getStartIntent(SplashActivity.this);
        startActivity(intent);
        finish();
    }

    @Override
    public void openMainActivity() {

    }

    @Override
    protected void onDestroy() {
        mPresenter.onDetach();
        super.onDestroy();
    }
}