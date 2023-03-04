package com.github;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

import java.util.Map;

@SpringBootTest
public class SpringbootRedisApplicationTests {

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Test
    public void test() {
        Map<Object, Object> map = Map.of("hello", "world");

        String key = "redis";
        this.redisTemplate.opsForHash().putAll(key, map);

        Map<Object, Object> entries = this.redisTemplate.opsForHash().entries(key);
        System.out.println("entries = " + entries);
    }


    @Test
    public void test2() {
        Map<String, String> map = Map.of("hello", "world");
        String key = "redis";
        this.stringRedisTemplate.opsForHash().putAll(key, map);

        Map<Object, Object> entries = this.stringRedisTemplate.opsForHash().entries(key);
        System.out.println("entries = " + entries);
    }

}
