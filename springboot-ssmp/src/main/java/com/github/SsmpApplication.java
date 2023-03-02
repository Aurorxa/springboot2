package com.github;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 许大仙
 * @version 1.0
 * @since 2023-02-26 07:42
 */
@SpringBootApplication
public class SsmpApplication {

    public static void main(String[] args) {
        // 禁用热部署功能
        System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(SsmpApplication.class, args);
    }

}
