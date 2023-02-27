package com.github.rest;

import cn.hutool.core.date.DatePattern;
import lombok.Data;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 返回结果的模型类，用于后端和前端进行数据格式统一，也称为"前后端数据协议"
 * 对于增删改查操作： <br/>
 * ① 如果接口成功，返回 {"status":true,"data":null} <br/>
 * ② 如果接口失败，返回 {"status":false,"data":null} <br/>
 * 对于查询操作： <br/>
 * ① 如果接口成功，返回 {"status":true,"data": {}} <br/>
 * ② 如果接口成功，但是数据不存在，返回 {"status":true,"data": null} <br/>
 * ③ 如果查询失败（服务器异常），返回 {"status":false,"data": null} <br/>
 *
 * @author 许大仙
 * @version 1.0
 * @since 2023-02-27 13:43
 */
@Data
public class Result<T> {
    public static Boolean SUCCESS_STATUS = true;

    public static Boolean ERROR_STATUS = false;

    private Boolean status;

    private T data;

    private String msg;

    private String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern(DatePattern.NORM_DATETIME_PATTERN));

    private Result() {
        
    }

    public static <T> Result<T> success(T data, String msg) {
        Result<T> result = new Result<>();
        result.setStatus(SUCCESS_STATUS);
        result.setData(data);
        result.setMsg(msg);
        return result;
    }

    public static <T> Result<T> success(T data) {
        return success(data, "操作成功");
    }

    public static <T> Result<T> success() {
        return success(null, "操作成功");
    }

    public static <T> Result<T> error(T data, String msg) {
        Result<T> result = new Result<>();
        result.setStatus(ERROR_STATUS);
        result.setMsg(msg);
        result.setData(data);
        return result;
    }

    public static <T> Result<T> error() {
        return error(null, "操作失败");
    }

    public static <T> Result<T> error(String msg) {
        return error(null, msg);
    }

}
