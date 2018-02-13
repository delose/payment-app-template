package com.delose.paymentapp.presenter.ui.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.delose.paymentapp.AndroidApplication;
import com.delose.paymentapp.presenter.di.component.ApplicationComponent;
import com.delose.paymentapp.presenter.ui.navigation.Navigator;

import javax.inject.Inject;

/**
 * Created by Gio on 2/8/2018.
 */

public class BaseActivity extends Activity {

    @Inject
    Navigator navigator;

    public static Intent getCallingIntent(Context context, Class<BaseActivity> tClass) {
        return new Intent(context, tClass);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        (AndroidApplication) this.getApplication().get
    }

    protected ApplicationComponent getApplicationComponent() {
        return ((AndroidApplication) getApplication()).getApplicationComponent();
    }


}
