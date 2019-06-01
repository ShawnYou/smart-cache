package com.shawny.core;

import com.shawny.config.ConfigBase;
import com.shawny.config.SagaCacheConfig;
import org.springframework.cache.Cache;

import java.util.function.Function;

/**
 * Created by shawn_lin on 2019/6/1.
 */
public abstract class AbstractBuilder implements CacheBuilder{

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