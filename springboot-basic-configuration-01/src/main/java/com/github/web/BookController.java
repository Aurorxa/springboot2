package com.github.web;

import com.github.config.Book;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private Book book;

    @GetMapping(value = "/view")
    public String getById() {
        log.info("book = {}", book);
        return "SpringBoot 入门";
    }
}
