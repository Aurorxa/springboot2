package com.github.web;

import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
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
import java.util.Objects;

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

    @ApiOperation("新增图书")
    @PostMapping(value = "/add")
    public Result<Boolean> add(@RequestBody Book book) {
        log.info("book = {}", book);
        return this.bookService.save(book) ? Result.success() : Result.error();
    }

    @ApiOperation("查询全部图书")
    @GetMapping(value = "/getAll")
    public Result<List<Book>> getAll() {
        return Result.success(this.bookService.list());
    }

    @ApiOperation("查询图书详情")
    @GetMapping(value = "/view/{id}")
    public Result<Book> view(@PathVariable("id") @ApiParam(value = "主键") Integer id) {
        return Result.success(this.bookService.getById(id));
    }

    @ApiOperation("删除图书")
    @DeleteMapping(value = "/delete/{id}")
    public Result<Boolean> delete(@PathVariable("id") @ApiParam(value = "主键") Integer id) {
        return this.bookService.removeById(id) ? Result.success() : Result.error();
    }

    @ApiOperation("编辑图书")
    @PutMapping(value = "/edit")
    public Result<Boolean> edit(@RequestBody Book book) {
        log.info("book = {}", book);
        return this.bookService.updateById(book) ? Result.success() : Result.error();
    }

    @ApiOperation("分页显示")
    @PostMapping(value = "/pageList/{pageNo}/{pageSize}")
    public Result<Page<Book>> pageList(@PathVariable("pageNo") @ApiParam(value = "页码") Integer pageNo, @PathVariable("pageSize") @ApiParam(value = "每页显示条数") Integer pageSize, @RequestBody Book book) {

        LambdaQueryWrapper<Book> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.like(StrUtil.isNotBlank(book.getType()), Book::getType, book.getType());
        queryWrapper.like(StrUtil.isNotBlank(book.getName()), Book::getName, book.getName());
        queryWrapper.like(StrUtil.isNotBlank(book.getDescription()), Book::getDescription, book.getDescription());

        Page<Book> page = this.bookService.page(new Page<>(pageNo, pageSize), queryWrapper);

        long current = page.getCurrent();
        long pages = page.getPages();
        
        // 如果当前页码值大于总页码值，重新执行查询操作，使用最大页码值作为当前页码值
        if (current > pages) {
            page = this.bookService.page(new Page<>(pages, pageSize), queryWrapper);
        }

        return Objects.nonNull(page) ? Result.success(page) : Result.error();
    }


}
