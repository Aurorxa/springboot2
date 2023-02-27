package com.github.web;

import com.github.domain.Book;
import com.github.rest.Result;
import com.github.service.BookService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @ApiOperation("新增数据")
    @PostMapping(value = "/add")
    public Result<Boolean> add(@RequestBody Book book) {
        log.info("book = {}", book);
        return Result.success(this.bookService.save(book));
    }

    @ApiOperation("查询全部数据")
    @GetMapping(value = "/getAll")
    public Result<List<Book>> getAll() {
        return Result.success(this.bookService.list());
    }

    @ApiOperation("查询详情接口")
    @GetMapping(value = "/view/{id}")
    public Result<Book> view(@PathVariable("id") @ApiParam(value = "主键") Integer id) {
        return Result.success(this.bookService.getById(id));
    }


}
