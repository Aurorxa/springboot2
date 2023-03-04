package com.github;

import com.github.domain.Book;
import com.github.mapper.BookMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class SpringbootSqlApplicationTests {

    @Test
    public void test(@Autowired BookMapper bookMapper) {
        List<Book> userList = bookMapper.findAll();
        userList.forEach(System.out::println);

    }

}
