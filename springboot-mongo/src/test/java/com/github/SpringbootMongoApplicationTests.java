package com.github;

import com.github.domain.Book;
import com.mongodb.client.result.DeleteResult;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import java.util.List;
import java.util.regex.Pattern;

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

    @Test
    public void testFind() {
        List<Book> bookList = this.mongoTemplate.findAll(Book.class);
        bookList.forEach(System.out::println);
    }

    @Test
    public void testDelete() {
        Pattern pattern = Pattern.compile("^.*" + "大" + ".*$", Pattern.CASE_INSENSITIVE);
        Query query = Query.query(Criteria.where("name").regex(pattern));
        DeleteResult result = this.mongoTemplate.remove(query, Book.class);
        long deletedCount = result.getDeletedCount();
        System.out.println("deletedCount = " + deletedCount);
    }

}
