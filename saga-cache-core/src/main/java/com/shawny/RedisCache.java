package com.shawny;

/**
 * Created by shawn_lin on 2019/4/28.
 */
public class RedisCache<K,V> extends AbstractRemoteCache<K,V> {
    @Override
    protected V PUT(K k, V v) {
        return null;
    }

    @Override
    protected V GET(K k) {
        return null;
    }

    @Override
    protected V REMOVE(K k) {
        return null;
    }
}
