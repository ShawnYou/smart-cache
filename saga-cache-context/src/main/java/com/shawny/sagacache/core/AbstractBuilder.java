package com.shawny.sagacache.core;

import com.shawny.sagacache.config.ConfigBase;
import com.shawny.sagacache.config.SagaCacheConfig;

import java.util.function.Function;

/**
 * Created by shawn_lin on 2019/6/1.
 */
public abstract class AbstractBuilder implements CacheBuilder {

    protected SagaCacheConfig sagaCacheConfig;

    private Function<ConfigBase,Cache> cacheFunction;

    public AbstractBuilder(SagaCacheConfig sagaCacheConfig){
        this.sagaCacheConfig = sagaCacheConfig;
    }

    public abstract ConfigBase getConfig();

    public void setCacheFunction(Function<ConfigBase,Cache> cacheFunction){
        this.cacheFunction = cacheFunction;
    }

    @Override
    public Cache buildCache() {
        ConfigBase configBase = this.getConfig();
        Cache cache = cacheFunction.apply(configBase);
        return cache;
    }
}