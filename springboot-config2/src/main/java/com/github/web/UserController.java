package com.github.web;

import com.github.dto.UserDto;
import com.github.validate.ValidGroup;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
     * 新增接口
     */
    @PostMapping("/add")
    public String add(@Validated(value = ValidGroup.Add.class) @RequestBody UserDto userDto) {
        log.info("add = {}", userDto);
        return "add";
    }

    /**
     * 更新接口
     */
    @PostMapping("/edit")
    public String edit(@Validated(value = ValidGroup.Edit.class) @RequestBody UserDto userDto) {
        log.info("add = {}", userDto);
        return "edit";
    }
}
