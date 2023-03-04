package com.github.dao;

import com.github.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author 许大仙
 * @version 1.0
 * @since 2023-03-04 10:01
 */
@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

}
