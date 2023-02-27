package com.github.ex;

import com.github.rest.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author 许大仙
 * @version 1.0
 * @since 2023-02-27 14:02
 */
@Slf4j
@RestControllerAdvice
public class GlobalExceptionAdvice {
    /**
     * 捕获 Exception 异常
     *
     * @param ex 异常
     * @return 响应信息
     */
    @ExceptionHandler(Exception.class)
    public Result<?> handleException(Exception ex) {
        log.info("GlobalExceptionAdvice ===> handleException 的异常信息是 {}", ex.getMessage());
        return Result.error(ex.getMessage());
    }

    /**
     * 捕获 BizException 异常
     *
     * @param ex 异常
     * @return 响应信息
     */
    @ExceptionHandler(BizException.class)
    public Result<?> handleBizException(BizException ex) {
        log.info("GlobalExceptionAdvice ===> handleBizException 的异常信息是 {}", ex.getMessage());
        return Result.error(ex.getMessage());
    }
}
