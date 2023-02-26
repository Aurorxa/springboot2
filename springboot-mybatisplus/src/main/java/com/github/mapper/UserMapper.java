package com.github.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.github.domain.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author 许大仙
 * @version 1.0
 * @since 2023-02-26 07:44
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
