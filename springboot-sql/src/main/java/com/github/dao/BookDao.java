package com.github.dao;

import com.github.domain.Book;

import java.util.List;

/**
 * @author 许大仙
 * @version 1.0
 * @since 2023-03-04 09:06
 */
public interface BookDao {

    List<Book> findAll();
}
