package com.delose.paymentapp;

import android.app.Application;

import com.delose.paymentapp.presenter.di.component.ApplicationComponent;

/**
 * Created by Gio on 2/8/2018.
 */

public class AndroidApplication extends Application {

    private ApplicationComponent applicationComponent;

//    public AndroidApplication(ApplicationComponent applicationComponent) {
//        this.applicationComponent = applicationComponent;
//    }

    public ApplicationComponent getApplicationComponent() {
        return this.applicationComponent;
    }
}
