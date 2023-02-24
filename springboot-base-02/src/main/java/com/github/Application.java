package com.github;

import com.github.web.BookController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author 许大仙
 * @version 1.0
 * @since 2023-02-24 13:15
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        // ConfigurableApplicationContext 其实就是 Spring 的容器
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
        // 从 Spring 容器中获取 Bean
        BookController bean = context.getBean(BookController.class);
        System.out.println("bean = " + bean);
    }
}
