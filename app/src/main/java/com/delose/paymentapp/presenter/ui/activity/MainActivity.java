package com.delose.paymentapp.presenter.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.delose.paymentapp.R;
import com.delose.paymentapp.presenter.ui.navigation.Navigator;

import javax.inject.Inject;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.navigateToUserLogin();
    }

    private void navigateToUserLogin() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                navigator.navigateTo(getApplicationContext(), new UserLoginActivity());
            }
        }, SPLASH_TIME_OUT);
    }
}
