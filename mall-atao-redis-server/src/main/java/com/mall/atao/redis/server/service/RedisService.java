package com.mall.atao.redis.server.service;

/**
 * @author: chenrencun
 * @version：
 * @date: 2020/1/5 16:28
 **/
public interface RedisService {

    void put(String key, Object value, long seconds);

    Object get(String key);
}
