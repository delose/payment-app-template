package com.delose.paymentapp;

import android.app.Application;

import com.delose.paymentapp.presenter.di.component.ApplicationComponent;
import com.delose.paymentapp.presenter.di.component.DaggerApplicationComponent;
import com.delose.paymentapp.presenter.di.module.ApplicationModule;

/**
 * Created by Gio on 2/8/2018.
 */

public class AndroidApplication extends Application {

    private ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        this.applicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
    }

    public AndroidApplication(ApplicationComponent applicationComponent) {
        this.applicationComponent = applicationComponent;
    }

    public ApplicationComponent getApplicationComponent() {
        return this.applicationComponent;
    }
}
