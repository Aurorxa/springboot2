package com.github.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 许大仙
 * @version 1.0
 * @since 2023-02-27 08:30
 */
@Slf4j
@RestController
@RequestMapping("/book")
public class BookHandler {

    @GetMapping("/view/{id}")
    public String view(@PathVariable("id") String id) {

        log.debug("id = {} ", id);
        // 默认的日志级别是 info
        log.info("id = {} ", id);
        log.warn("id = {} ", id);
        log.error("id = {} ", id);

        return "【Book】id = " + id;
    }
}