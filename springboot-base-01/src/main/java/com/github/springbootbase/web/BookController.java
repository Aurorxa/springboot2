package com.github.springbootbase.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 许大仙
 * @version 1.0
 * @since 2023-02-24 10:28
 */
@RestController
@RequestMapping(value = "/books")
public class BookController {

    @GetMapping(value = "/view")
    public String getById() {
        System.out.println("SpringBoot 入门");
        return "SpringBoot 入门";
    }
}
