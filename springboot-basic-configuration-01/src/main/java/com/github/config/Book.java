package com.github.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @author 许大仙
 * @version 1.0
 * @since 2023-02-25 23:20
 */
@Data // 定义数据模型封装 yaml 文件中定义的数据
@Component // 定义为 SpringBoot 管理的 Bean
@ConfigurationProperties(prefix = "book") // 指定加载的数据，prefix 表示以 book 开头
public class Book implements Serializable {

    private String name;

    private Double price;

    private String address;

    private String author;

}
