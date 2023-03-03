package com.github.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Arrays;
import java.util.List;

/**
 * @author 许大仙
 * @version 1.0
 * @since 2023-03-03 10:55
 */
public class GenderEnumValidator implements ConstraintValidator<GenderEnum, String> {


    /**
     * 存储注解中的 value 值
     */
    private List<String> genderEnumStringList;

    /**
     * 该方法的作用是将 GenderEnumString 中的内容传递进来
     *
     * @param constraintAnnotation GenderEnumString注解
     */
    @Override
    public void initialize(GenderEnum constraintAnnotation) {
        this.genderEnumStringList = Arrays.asList(constraintAnnotation.value());
    }

    /**
     * @param value   需要校验的值，即用户传递过来的参数
     * @param context 上下文对象
     * @return
     */
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {

        if (value == null) {
            return true;
        }

        return this.genderEnumStringList.contains(value);
    }


}
