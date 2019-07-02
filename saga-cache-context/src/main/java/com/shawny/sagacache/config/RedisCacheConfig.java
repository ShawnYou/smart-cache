package com.shawny.sagacache.config;

import lombok.Data;
import org.springframework.data.redis.core.RedisTemplate;
import redis.clients.jedis.JedisPool;

/**
 * Created by shawn_lin on 2019/6/1.
 */
@Data
public class RedisCacheConfig extends ConfigBase {
    private RedisTemplate redisTemplate;
}
