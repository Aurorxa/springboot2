package com.github.dao;

import com.github.domain.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author 许大仙
 * @version 1.0
 * @since 2023-03-04 17:21
 */
public interface BookRepository extends MongoRepository<Book, String> {
}
