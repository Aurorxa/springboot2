package com.github.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 许大仙
 * @version 1.0
 * @since 2023-03-03 08:40
 */
@Configuration // 标注这个一个配置类
public class DataSourceConfiguration {

    @Bean // 将第三方的 Bean 加入到 SpringBoot 的容器中
    public DruidDataSource druidDataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        return dataSource;
    }

}
