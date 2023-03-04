package com.github;

import com.github.dao.BookDao;
import com.github.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class SpringbootSqlApplicationTests {

    @Test
    public void test(@Autowired BookDao bookDao) {
        List<Book> bookList = bookDao.findAll();
        bookList.forEach(System.out::println);
    }

}
