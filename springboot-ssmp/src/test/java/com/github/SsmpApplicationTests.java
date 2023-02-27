package com.github;

import com.github.domain.Book;
import com.github.mapper.BookMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class SsmpApplicationTests {

    @Autowired
    private BookMapper bookMapper;

    @Test
    public void testQuery() {
        List<Book> bookList = this.bookMapper.selectList(null);
        bookList.forEach(System.out::println);
    }

    @Test
    public void test() {
        Book book = new Book();
        book.setType("技术图书");
        book.setName("Java从入门到入坟");
        book.setDescription("写的太好了");

        this.bookMapper.insert(book);
    }

}
