package com.github.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.gitee.zerowsh.actable.annotation.AcColumn;
import io.gitee.zerowsh.actable.annotation.AcTable;
import lombok.Data;

import java.io.Serializable;

/**
 * @author 许大仙
 * @version 1.0
 * @since 2023-02-27 08:20
 */
@Data
@TableName("`Book`")
@AcTable(name = "`Book`", comment = "图书")
public class Book implements Serializable {

    @AcColumn(name = "`id`", comment = "主键")
    @TableId(value = "`id`", type = IdType.AUTO)
    private Integer id;

    @AcColumn(name = "`type`", comment = "图书类型")
    @TableField("`type`")
    private String type;

    @AcColumn(name = "`name`", comment = "图书名称")
    @TableField("`name`")
    private String name;

    @AcColumn(name = "`description`", comment = "图书描述")
    @TableField("`description`")
    private String description;

}
