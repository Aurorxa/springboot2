package com.github;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.github.domain.User;
import com.github.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class ApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void test() {
        List<User> userList = userMapper.selectList(new LambdaQueryWrapper<>(User.class));
        userList.forEach(System.out::println);
    }

}
