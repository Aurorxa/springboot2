package com.github.mapper;

import com.github.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author 许大仙
 * @version 1.0
 * @since 2023-02-26 07:44
 */
@Mapper
public interface UserMapper {
    /**
     * 查询所有的用户信息
     */
    @Select("SELECT * FROM `user`")
    List<User> findAll();
}
