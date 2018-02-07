package com.delose.paymentapp.domain.repository;

import io.reactivex.Completable;

/**
 * Created by Gio on 2/8/2018.
 */

public interface UserLoginRepository {

    Completable successLoginAttempt();

    Completable failLoginAttempt();

}
