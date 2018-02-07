package com.delose.paymentapp.usecase;

import java.util.concurrent.Executor;

import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by Gio on 2/8/2018.
 */

public abstract class UseCase<T, P> {

    private final CompositeDisposable disposable;
    private final Executor executor;
    private final Scheduler scheduler;

    UseCase(CompositeDisposable disposable, Executor executor, Scheduler scheduler) {
        this.disposable = disposable;
        this.executor = executor;
        this.scheduler = scheduler;
    }

    abstract Observable<T> buildUseCaseObservable(P p);

    public void execute(DisposableObserver<T> observer, P p) {
        if (observer != null) {
            final Observable<T> observable = this.buildUseCaseObservable(p)
                    .subscribeOn(Schedulers.from(executor))
                    .observeOn(scheduler);
        }
    };

    public void dispose() {
        if (!disposable.isDisposed()) {
            disposable.dispose();
        }
    }

}
