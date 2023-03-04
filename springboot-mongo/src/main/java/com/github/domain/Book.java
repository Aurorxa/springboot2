package com.github.domain;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author 许大仙
 * @version 1.0
 * @since 2023-02-26 07:42
 */
@Data
@Accessors(chain = true)
public class Book implements Serializable {

    private String id;

    private String type;

    private String name;

    private String description;

}
