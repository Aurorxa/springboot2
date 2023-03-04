package com.github;

import com.github.dao.BookRepository;
import com.github.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SpringbootH2ApplicationTests {

    @Autowired
    private BookRepository bookRepository;

    @Test
    public void testInsert() {
        Book book = new Book().setName("Java从入门到精通").setType("计算机图书").setDescription("这是一本好的书籍，你不觉得！");
        Book bookDb = this.bookRepository.save(book);
        System.out.println("bookDb = " + bookDb);
    }

}
