package com.github.springbootes7;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;

@SpringBootTest
public class SpringbootEs7ApplicationTests {

    @Autowired
    private ElasticsearchRestTemplate template;

    @Test
    public void test() {
        

    }

}
