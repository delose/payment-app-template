package com.delose.paymentapp.helper.cache;

import io.reactivex.Observable;

/**
 * Created by Gio on 2/17/2018.
 */

public interface BaseCache {

    Observable get(Object o);

    void put(String id);

    boolean isCached();

    boolean isExpired();

}
