package com.codeko.moments.ui.base;

import android.support.annotation.StringRes;

/**
 * Created by nvcuong on 10/5/17.
 */

public interface BaseView {

    void showLoading();

    void hideLoading();

    void onError(@StringRes int resId);

    void onError(String message);
}
