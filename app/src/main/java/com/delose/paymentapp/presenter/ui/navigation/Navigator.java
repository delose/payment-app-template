package com.delose.paymentapp.presenter.ui.navigation;

import android.content.Context;
import android.content.Intent;

import com.delose.paymentapp.presenter.ui.activity.BaseActivity;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by Gio on 2/8/2018.
 */

@Singleton
public class Navigator {

    @Inject
    public Navigator() {

    }

    public void navigateTo(Context context, BaseActivity activity) {
        if (context != null) {
            Intent intent = this.getCallingIntent(context, activity);
            context.startActivity(intent);
        }
    }

    public static Intent getCallingIntent(Context context, BaseActivity activity) {
        return new Intent(context, activity.getClass());
    }

}
