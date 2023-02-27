package com.github.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.domain.Book;
import com.github.mapper.BookMapper;
import com.github.service.BookService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 许大仙
 * @version 1.0
 * @since 2023-02-27 08:29
 */
@Service
@Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRES_NEW)
public class BookServiceImpl extends ServiceImpl<BookMapper, Book> implements BookService {
    
}
