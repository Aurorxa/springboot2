package com.github;

import com.github.dto.UserDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Email;

/**
 * @author 许大仙
 * @version 1.0
 * @since 2023-03-03 09:44
 */

@Slf4j
@Validated // 开启校验
@RestController
@RequestMapping(value = "/user")
public class UserController {

    /**
     * RequestBody 校验
     *
     * @param userDto
     * @return
     */
    @PostMapping("/valid/test1")
    public String test1(@Validated @RequestBody UserDto userDto) {
        log.info("userDto is {}", userDto);
        return "test1 valid success";
    }

    /**
     * Form 校验
     *
     * @param userDto
     * @return
     */
    @PostMapping(value = "/valid/test2")
    public String test2(@Validated UserDto userDto) {
        log.info("validEntity is {}", userDto);
        return "test2 valid success";
    }

    /**
     * 单个参数校验
     *
     * @param email
     * @return
     */
    @PostMapping(value = "/valid/test3")
    public String test3(@Email(message = "邮箱格式错误") String email) {
        log.info("email is {}", email);
        return "email valid success";
    }
}
