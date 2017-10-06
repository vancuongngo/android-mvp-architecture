package com.codeko.moments.di.module;

import android.app.Application;
import android.content.Context;

import com.codeko.moments.BuildConfig;
import com.codeko.moments.data.AppDataManager;
import com.codeko.moments.data.DataManager;
import com.codeko.moments.data.db.AppDbHelper;
import com.codeko.moments.data.db.DbHelper;
import com.codeko.moments.data.network.ApiHeader;
import com.codeko.moments.data.network.ApiHelper;
import com.codeko.moments.data.network.AppApiHelper;
import com.codeko.moments.data.prefs.AppPreferencesHelper;
import com.codeko.moments.data.prefs.PreferencesHelper;
import com.codeko.moments.di.ApiInfo;
import com.codeko.moments.di.ApplicationContext;
import com.codeko.moments.di.DatabaseInfo;
import com.codeko.moments.di.PreferenceInfo;
import com.codeko.moments.utils.AppConstants;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by nvcuong on 10/5/17.
 */

@Module
public class ApplicationModule {

    private final Application mApplication;

    public ApplicationModule(Application application) {
        this.mApplication = application;
    }

    @Provides
    @ApplicationContext
    Context provideContext() {
        return mApplication;
    }

    @Provides
    @Singleton
    DataManager provideDataManager(AppDataManager appDataManager) {
        return appDataManager;
    }

    @Provides
    @Singleton
    DbHelper provideDbHelper(AppDbHelper appDbHelper) {
        return appDbHelper;
    }

    @Provides
    @Singleton
    PreferencesHelper providePreferencesHelper(AppPreferencesHelper appPreferencesHelper) {
        return appPreferencesHelper;
    }

    @Provides
    @Singleton
    ApiHelper provideApiHelper(AppApiHelper appApiHelper) {
        return appApiHelper;
    }
}
