package com.codeko.moments.ui.splash;

import com.codeko.moments.data.DataManager;
import com.codeko.moments.ui.base.BasePresenter;
import com.codeko.moments.ui.base.BasePresenterImpl;
import com.codeko.moments.utils.rx.SchedulerProvider;

import javax.inject.Inject;

import io.reactivex.ObservableSource;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;

/**
 * Created by nvcuong on 10/5/17.
 */

public class SplashPresenter<V extends SplashContract.View> extends BasePresenterImpl<V>
        implements SplashContract.Presenter<V> {

    /*@Inject
    public SplashPresenter(DataManager dataManager,
                           SchedulerProvider schedulerProvider,
                           CompositeDisposable compositeDisposable) {
        super(dataManager, schedulerProvider, compositeDisposable);
    }*/
    @Override
    public void onAttach(V baseView) {
        super.onAttach(baseView);

        /*getCompositeDisposable().add(getDataManager()
            .seedDatabaseQuestions()
            .subscribeOn(getSchedulerProvider().io())
            .observeOn(getSchedulerProvider().ui())
            .concatMap(new Function<Boolean, ObservableSource<Boolean>>() {
                @Override
                public ObservableSource<Boolean> apply(@NonNull Boolean aBoolean) throws Exception {
                    return getDataManager().seedDatabaseOptions();
                }
            })
            .subscribe(new Consumer<Boolean>() {
                @Override
                public void accept(@NonNull Boolean aBoolean) throws Exception {
                    if (!isViewAttached()) {
                        return;
                    }
                    decideNextActivity();
                }
            }, new Consumer<Throwable>() {
                @Override
                public void accept(@NonNull Throwable throwable) throws Exception {
                    if (!isViewAttached()) {
                        return;
                    }
                    getBaseView().onError("Some Error Occurred!");
                    decideNextActivity();
                }
            })
        );*/
    }

    private void decideNextActivity() {
        /*if (getDataManager().getCurrentUserLoggedInMode()
                == DataManager.LoggedInMode.LOGGED_IN_MODE_LOGGED_OUT.getType()) {
            getBaseView().openLoginActivity();
        } else {
            getBaseView().openMainActivity();
        }*/
    }

    @Override
    public void onDetach() {

    }
}
