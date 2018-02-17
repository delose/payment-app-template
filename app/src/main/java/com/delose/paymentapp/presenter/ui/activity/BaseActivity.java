package com.delose.paymentapp.presenter.ui.activity;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.delose.paymentapp.AndroidApplication;
import com.delose.paymentapp.presenter.di.component.ApplicationComponent;
import com.delose.paymentapp.presenter.di.module.ActivityModule;
import com.delose.paymentapp.presenter.ui.navigation.Navigator;

import javax.inject.Inject;

/**
 * Created by Gio on 2/8/2018.
 */

public class BaseActivity extends AppCompatActivity {

    @Inject
    Navigator navigator;

    protected static final int SPLASH_TIME_OUT = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getApplicationComponent().inject(this);
    }

    protected void addFragment(int viewId, Fragment fragment) {
        final FragmentTransaction fragmentTransaction = this.getFragmentManager().beginTransaction();
        fragmentTransaction.add(viewId, fragment);
        fragmentTransaction.commit();
    }

    protected ActivityModule getActivityModule() {
        return new ActivityModule(this);
    }

    protected ApplicationComponent getApplicationComponent() {
        return ((AndroidApplication) getApplication()).getApplicationComponent();
    }


}
