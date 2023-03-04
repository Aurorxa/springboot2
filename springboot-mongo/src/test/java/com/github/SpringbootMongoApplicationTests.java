package com.github;

import com.github.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;

@SpringBootTest
public class SpringbootMongoApplicationTests {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Test
    public void testSave() {
        Book book = new Book();
        book.setType("计算机图书");
        book.setName("Java从入门到入坟");
        book.setDescription("这是一本非常棒的书籍，完美的记录了您的一生^_^");
        this.mongoTemplate.save(book);
    }

}
