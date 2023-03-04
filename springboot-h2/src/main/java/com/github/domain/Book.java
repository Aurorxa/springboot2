package com.github.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author 许大仙
 * @version 1.0
 * @since 2023-02-26 07:42
 */
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "book")
@Accessors(chain = true)
public class Book implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String type;

    private String name;

    private String description;

}
