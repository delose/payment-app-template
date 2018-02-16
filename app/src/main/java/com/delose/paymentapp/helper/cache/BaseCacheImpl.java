package com.delose.paymentapp.helper.cache;

import android.support.annotation.NonNull;

import java.util.concurrent.Executor;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.reactivex.Observable;

/**
 * Created by Gio on 2/17/2018.
 */

@Singleton
public class BaseCacheImpl implements BaseCache {

    // TODO: include helper variables
    private final Executor executor;

    @Inject
    public BaseCacheImpl(Executor executor) {
        if (executor == null) {
            throw new IllegalArgumentException("Please specify a valid parameter");
        }
        this.executor = executor;
    }

    private void executeSynchronousTask(Runnable runnable) {
        this.executor.execute(runnable);
    }

    @Override
    public Observable get(Object o) {
        return null;
    }

    @Override
    public void put(String id) {

    }

    @Override
    public boolean isCached() {
        return false;
    }

    @Override
    public boolean isExpired() {
        return false;
    }
}
