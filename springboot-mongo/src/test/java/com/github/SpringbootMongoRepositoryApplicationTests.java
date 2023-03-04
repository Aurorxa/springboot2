package com.github;

import com.github.dao.BookRepository;
import com.github.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@SpringBootTest
public class SpringbootMongoRepositoryApplicationTests {

    @Autowired
    private BookRepository bookRepository;

    @Test
    public void testSave() {
        Book book1 = new Book().setType("计算机图书").setName("Java从入门到入坟").setDescription("这是一本非常棒的书籍，完美的记录了您的一生^_^");
        Book book2= new Book().setType("计算机图书").setName("C语言从入门到放弃").setDescription("这是一本非常棒的书籍，完美的记录了您的一生^_^");
        List<Book> bookList = Arrays.asList(book1,book2);
        bookRepository.saveAll(bookList);
    }

    @Test
    public void testFind() {
        List<Book> bookList = bookRepository.findAll();
        bookList.forEach(System.out::println);
    }

    @Test
    public void testDelete() {
        Optional<Book> optional = bookRepository.findOne(Example.of(new Book().setType("计算机图书")));
        optional.ifPresent(book -> bookRepository.deleteById(book.getId()));
    }

}
