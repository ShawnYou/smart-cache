package com.shawny.configuration;

import org.springframework.boot.env.YamlPropertySourceLoader;
import org.springframework.core.env.PropertySource;
import org.springframework.core.io.support.DefaultPropertySourceFactory;
import org.springframework.core.io.support.EncodedResource;

import java.io.IOException;

/**
 * Created by shawn_lin on 2019/5/21.
 */
public class YmalPropertyLoadFactory extends DefaultPropertySourceFactory{
    @Override
    public PropertySource<?> createPropertySource(String name, EncodedResource resource) throws IOException {
        if(resource == null){
            return super.createPropertySource(name, resource);
        }
        return new YamlPropertySourceLoader().load(resource.getResource().getFilename(),resource.getResource()).get(0);
    }
}
