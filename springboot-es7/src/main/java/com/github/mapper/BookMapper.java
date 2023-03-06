package com.github.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.github.domain.Book;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author 许大仙
 * @version 1.0
 * @since 2023-02-27 08:27
 */
@Mapper
public interface BookMapper extends BaseMapper<Book> {
    
}
