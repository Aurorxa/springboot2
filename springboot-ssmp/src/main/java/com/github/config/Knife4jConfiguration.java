package com.github.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @author 许大仙
 * @version 1.0
 * @since 2023-02-27 08:33
 */
@Configuration
@EnableOpenApi
public class Knife4jConfiguration {
    @Bean
    public Docket docket() {
        // 指定使用Swagger2规范
        return new Docket(DocumentationType.OAS_30)
                .apiInfo(new ApiInfoBuilder()
                        // 描述字段支持Markdown语法
                        .description("# 基于 SpringBoot 的 SSMP 整合案例的接口文档")
                        .termsOfServiceUrl("https://www.github.com")
                        .contact(new Contact("许大仙", "", ""))
                        .version("1.0")
                        .build())
                // 分组名称
                // .groupName("用户服务")
                .select()
                // 这里指定 Controller 扫描包路径
                .apis(RequestHandlerSelectors.basePackage("com.github.web"))
                .paths(PathSelectors.any())
                .build();
    }

}
