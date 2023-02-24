package com.github;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 测试 GitLab 能否同步到 GitHub 中
 *
 * @author 许大仙
 * @version 1.0
 * @since 2023-02-24 13:15
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
