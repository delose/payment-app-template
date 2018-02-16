package com.delose.paymentapp.presenter.di.module;

import com.delose.paymentapp.AndroidApplication;
import com.delose.paymentapp.domain.repository.UserLoginRepository;
import com.delose.paymentapp.helper.cache.BaseCache;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Gio on 2/8/2018.
 */

/**
 * A module that provides the objects that will live during application lifecycle
 */
@Module
public class ApplicationModule {

    private final AndroidApplication application;

    public ApplicationModule(AndroidApplication application) {
        this.application = application;
    }

    @Provides
    @Singleton
    UserLoginRepository provideUserLoginRepository(UserLoginRepository userLoginRepository) {
        return userLoginRepository;
    }

    @Provides
    @Singleton
    BaseCache provideCache(BaseCache cache) {
        return cache;
    }


}
