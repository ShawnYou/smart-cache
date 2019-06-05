package com.shawny.sagacache.autoconfigure;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.ConfigurableEnvironment;

import javax.annotation.PostConstruct;

/**
 * Created by shawn_lin on 2019/5/18.
 */

public abstract class AbstractCacheConfigAutoInit {

    @Autowired
    private ConfigurableEnvironment environment;

    @PostConstruct
    public void autoInit() {
        this.doProcess(environment);
    }

    public void doProcess(ConfigurableEnvironment environment) {
        
    }


}