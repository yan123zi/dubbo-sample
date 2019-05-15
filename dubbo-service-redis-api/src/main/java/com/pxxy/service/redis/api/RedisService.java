package com.pxxy.service.redis.api;

/**
 * @author YZJ
 * @date 2019/5/12 - 17:30
 */
public interface RedisService {
    void set(String key,Object value);
    void set(String key,Object value,int seconds);
    void del(String key);
    Object get(String key);
}
