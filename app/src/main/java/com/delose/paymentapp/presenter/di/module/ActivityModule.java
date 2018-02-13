package com.delose.paymentapp.presenter.di.module;

import android.app.Activity;

import com.delose.paymentapp.presenter.di.scope.PerActivity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Gio on 2/9/2018.
 */

@Module
public class ActivityModule {

    private final Activity activity;

    public ActivityModule(Activity activity) {
        this.activity = activity;
    }

    @Provides @PerActivity Activity getActivity() {
        return this.activity;
    }

}
