package com.github;

import com.github.domain.Book;
import com.github.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@SpringBootTest
public class SsmpApplicationTests {

    @Autowired
    private BookService bookService;

    @Test
    public void test() {
        Book book = new Book();
        book.setName("Java从入门到精通");
        book.setDescription("这是一本非常垃圾的书~");
        this.bookService.save(book);
    }


}
