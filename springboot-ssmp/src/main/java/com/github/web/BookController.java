package com.github.web;

import com.github.service.BookService;
import io.swagger.annotations.Api;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 许大仙
 * @version 1.0
 * @since 2023-02-27 08:30
 */
@Api(tags = "图书模块")
@Slf4j
@RestController
@RequiredArgsConstructor
public class BookController {

    @NonNull
    private BookService bookService;
    

}
