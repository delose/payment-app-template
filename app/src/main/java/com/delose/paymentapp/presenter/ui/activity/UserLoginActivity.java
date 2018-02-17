package com.delose.paymentapp.presenter.ui.activity;

import android.os.Bundle;
import android.widget.Button;

import com.delose.paymentapp.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Gio on 2/17/2018.
 */

public class UserLoginActivity extends BaseActivity {

    @BindView(R.id.userLoginButton)
    Button btnUserLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userlogin);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.userLoginButton)
    void navigateToDashboard() {
        // TODO: add user verification
        this.navigator.navigateTo(this, new DashboardActivity());
    }
}
