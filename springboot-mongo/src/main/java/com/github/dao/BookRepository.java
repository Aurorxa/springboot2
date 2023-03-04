package com.github.dao;

import com.github.domain.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @author 许大仙
 * @version 1.0
 * @since 2023-03-04 17:21
 */
@Repository
public interface BookRepository extends MongoRepository<Book, String> {

}
