package com.codeko.moments.ui.base;

/**
 * Created by nvcuong on 10/5/17.
 */

public interface BasePresenter<V extends BaseView> {

    void onAttach(V baseView);

    void onDetach();
}
