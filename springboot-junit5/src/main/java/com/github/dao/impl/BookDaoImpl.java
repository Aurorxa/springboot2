package com.github.dao.impl;

import com.github.dao.BookDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

/**
 * @author 许大仙
 * @version 1.0
 * @since 2023-02-25 23:56
 */
@Slf4j
@Repository
public class BookDaoImpl implements BookDao {
    @Override
    public void add() {
        log.info("增加图书信息");
    }
}
