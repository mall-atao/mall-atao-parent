package com.mall.atao.redis.server.controller;

import com.mall.atao.redis.server.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: chenrencun
 * @version：
 * @date: 2020/1/5 16:33
 **/
@RestController
public class RedisController {

    @Autowired
    private RedisService redisService;

    @RequestMapping("/put")
    public String put(String key, String value, long seconds) {
        try {
            redisService.put(key, value, seconds);
            return "success";
        } catch (Exception e) {
            return "error";
        }
    }

    @RequestMapping("/get")
    public String get(String key) {
        Object o = redisService.get(key);
        if (o != null) {
            return String.valueOf(o);
        }
        return null;
    }
}
