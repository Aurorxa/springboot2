package com.github;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.Map;

@SpringBootTest
public class SpringbootRedisApplicationTests {

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    @Test
    public void test() {
        Map<String, Object> map = Map.of("hello", "world");

        String key = "redis";
        this.redisTemplate.opsForHash().putAll(key, map);

        Map<Object, Object> entries = this.redisTemplate.opsForHash().entries(key);
        System.out.println("entries = " + entries);
    }

}
