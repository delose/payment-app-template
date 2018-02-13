package com.delose.paymentapp.presenter.di.component;

import com.delose.paymentapp.presenter.di.module.ApplicationModule;
import com.delose.paymentapp.presenter.ui.activity.BaseActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Gio on 2/8/2018.
 */

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(BaseActivity baseActivity);

}
