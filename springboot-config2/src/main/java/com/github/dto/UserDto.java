package com.github.dto;

import com.github.validate.ValidGroup;
import com.github.validator.GenderEnum;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.*;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * @author 许大仙
 * @version 1.0
 * @since 2023-03-03 09:34
 */
@Data
public class UserDto implements Serializable {

    @Null(message = "新增的时候不需要传递 id", groups = ValidGroup.Add.class)
    @NotBlank.List(value = {
            @NotBlank(message = "更新的时候需要传递 id", groups = ValidGroup.Edit.class),
            @NotBlank(message = "删除的时候需要传递 id", groups = {ValidGroup.Delete.class}),
    })
    private String id;

    @NotBlank(message = "用户名不能为空")
    private String username;

    @NotBlank(message = "密码不能为空")
    @Pattern(regexp = "^(?![0-9]+$)(?![a-z]+$)(?![A-Z]+$)(?!([^(0-9a-zA-Z)])+$).{6,20}$", message = "密码包含：数字,英文,字符中的两种以上，长度6-20")
    private String password;

    @Past(message = "生日必须是过去的时间，不可以是当前或未来的时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthday;

    @Email(message = "邮箱格式错误")
    private String email;

    @Min(value = 1, message = "年龄不能小于 1 岁")
    @Max(value = 120, message = "年龄不能大于 120 岁")
    private Integer age;

    @GenderEnum(value = {"M", "F"}, message = "性别只能是 M 或 F")
    private String gender;

}
