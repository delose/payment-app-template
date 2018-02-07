package com.delose.paymentapp.domain.model;

/**
 * Created by Gio on 2/8/2018.
 */

public class UserLogin {
    private String mobileNumber;
    private String password;

    public String getMobileNumber() {
        return this.mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
