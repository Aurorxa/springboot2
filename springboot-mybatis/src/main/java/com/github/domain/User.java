package com.github.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 许大仙
 * @version 1.0
 * @since 2023-02-26 07:42
 */
@Data
public class User implements Serializable {

    private Long id;

    private String userName;

    private String password;

    private String name;

    private Integer age;

    private String email;

}
