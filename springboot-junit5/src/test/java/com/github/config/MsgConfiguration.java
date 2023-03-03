package com.github.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 许大仙
 * @version 1.0
 * @since 2023-03-03 13:34
 */
@Configuration
public class MsgConfiguration {

    @Bean
    public String msg() {
        return "HelloWorld";
    }

}
