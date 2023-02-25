package com.github.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 许大仙
 * @version 1.0
 * @since 2023-02-24 13:15
 */
@Slf4j
@RestController
@RequestMapping(value = "/books")
public class BookController {

    @Value("${flag}")
    private Boolean flag;

    @Value("${school.name}")
    private String schoolName;

    @Value("${school.address}")
    private String schoolAddress;

    @Value("${school.subject[0]}")
    private String java;

    @Value("${person.likes[0]}")
    private String eat;


    @GetMapping(value = "/view")
    public String getById() {
        log.info("flag = {}",flag);
        log.info("schoolName = {}",schoolName);
        log.info("schoolAddress = {}",schoolAddress);
        log.info("java = {}",java);
        log.info("eat = {}",eat);
        return "SpringBoot 入门";
    }
}
