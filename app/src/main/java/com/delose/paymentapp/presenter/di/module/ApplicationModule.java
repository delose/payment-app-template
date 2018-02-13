package com.delose.paymentapp.presenter.di.module;

import com.delose.paymentapp.AndroidApplication;
import com.delose.paymentapp.domain.repository.UserLoginRepository;
import com.delose.paymentapp.presenter.di.scope.PerActivity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Gio on 2/8/2018.
 */

@Module
public class ApplicationModule {

    private final AndroidApplication application;

    public ApplicationModule(AndroidApplication application) {
        this.application = application;
    }

    @Provides
    @PerActivity
    UserLoginRepository provideUserLoginRepository(UserLoginRepository userLoginRepository) {
        return userLoginRepository;
    }

}
