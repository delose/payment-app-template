package com.delose.paymentapp.usecase;

import com.delose.paymentapp.domain.model.UserLogin;

import java.util.concurrent.Executor;

import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.disposables.CompositeDisposable;

/**
 * Created by Gio on 2/8/2018.
 */

public class AttemptUserLogin extends UseCase<UserLogin, Void> {

    AttemptUserLogin(CompositeDisposable disposable, Executor executor, Scheduler scheduler) {
        super(disposable, executor, scheduler);
    }

    @Override
    Observable<UserLogin> buildUseCaseObservable(Void aVoid) {
        return null;
    }
}
