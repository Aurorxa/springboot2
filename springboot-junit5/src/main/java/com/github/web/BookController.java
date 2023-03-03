package com.github.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author 许大仙
 * @version 1.0
 * @since 2023-03-03 13:43
 */
@RestController
@RequestMapping(value = "/book")
public class BookController {

    @GetMapping(value = "/view")
    public Map<String, String> view() {
        return Map.of("username", "admin", "password", "123456");
    }
}
