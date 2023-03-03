package com.github.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @author 许大仙
 * @version 1.0
 * @since 2023-03-03 10:56
 */
@Documented
@Constraint(validatedBy = {GenderEnumValidator.class})
@Target({METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER, TYPE_USE})
@Retention(RUNTIME)
@Repeatable(GenderEnum.List.class)
public @interface GenderEnum {

    String message() default "{javax.validation.constraints.GenderEnumString.message}";

    Class<?>[] groups() default {};


    /**
     * 实际存储的值
     *
     * @return
     */
    String[] value();

    Class<? extends Payload>[] payload() default {};


    @Target({METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER, TYPE_USE})
    @Retention(RUNTIME)
    @Documented
    public @interface List {
        GenderEnum[] value();
    }

}
