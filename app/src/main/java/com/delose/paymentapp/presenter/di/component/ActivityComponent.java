package com.delose.paymentapp.presenter.di.component;

import android.app.Activity;

import com.delose.paymentapp.presenter.di.module.ActivityModule;
import com.delose.paymentapp.presenter.di.scope.ActivityScope;

import dagger.Component;

/**
 * Created by Gio on 2/9/2018.
 */

@ActivityScope
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    Activity activity();

}
