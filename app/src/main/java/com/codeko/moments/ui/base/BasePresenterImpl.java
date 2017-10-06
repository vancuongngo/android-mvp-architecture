package com.codeko.moments.ui.base;

import com.codeko.moments.data.DataManager;
import com.codeko.moments.utils.rx.SchedulerProvider;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;

/**
 * Created by nvcuong on 10/5/17.
 */

public class BasePresenterImpl<V extends BaseView> implements BasePresenter<V> {

//    private final DataManager mDataManager;
//    private final SchedulerProvider mSchedulerProvider;
//    private final CompositeDisposable mCompositeDisposable;

    private V mBaseView;

    /*@Inject
    public BasePresenterImpl(DataManager dataManager,
                             SchedulerProvider schedulerProvider,
                             CompositeDisposable compositeDisposable) {
        this.mDataManager = dataManager;
        this.mSchedulerProvider = schedulerProvider;
        this.mCompositeDisposable = compositeDisposable;
    }*/

    @Override
    public void onAttach(V baseView) {
        this.mBaseView = baseView;
    }

    @Override
    public void onDetach() {
//        mCompositeDisposable.dispose();
        mBaseView = null;
    }

    /*public DataManager getDataManager() {
        return mDataManager;
    }

    public SchedulerProvider getSchedulerProvider() {
        return mSchedulerProvider;
    }

    public CompositeDisposable getCompositeDisposable() {
        return mCompositeDisposable;
    }*/

    public V getBaseView() {
        return mBaseView;
    }

    public boolean isViewAttached() {
        return mBaseView != null;
    }
}
