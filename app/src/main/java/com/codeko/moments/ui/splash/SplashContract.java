package com.codeko.moments.ui.splash;

import com.codeko.moments.di.PerActivity;
import com.codeko.moments.ui.base.BasePresenter;
import com.codeko.moments.ui.base.BasePresenterImpl;
import com.codeko.moments.ui.base.BaseView;

/**
 * Created by nvcuong on 10/5/17.
 */

public interface SplashContract {

    interface View extends BaseView {

        void openLoginActivity();

        void openMainActivity();
    }

    @PerActivity
    interface Presenter<V extends SplashContract.View> extends BasePresenter<V> {
    }


}
