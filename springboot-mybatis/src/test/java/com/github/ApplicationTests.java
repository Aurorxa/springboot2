package com.github;

import com.github.domain.Book;
import com.github.mapper.BookMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class ApplicationTests {

    @Autowired
    private BookMapper bookMapper;

    @Test
    public void test() {
        List<Book> bookList = this.bookMapper.findAll();
        bookList.forEach(System.out::println);
    }

}
