package com.github;

import com.github.config.MsgConfiguration;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Slf4j
@SpringBootTest
@Import(MsgConfiguration.class)
public class ApplicationTests {
    @Test
    public void test(@Autowired String msg) {
        log.info("msg = {}", msg); // msg = HelloWorld
    }
}
