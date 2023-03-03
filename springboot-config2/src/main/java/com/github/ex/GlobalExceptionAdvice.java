package com.github.ex;

import com.github.rest.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 全局异常捕获
 *
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
        ex.printStackTrace();
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
        ex.printStackTrace();
        return Result.error(ex.getMessage());
    }

    /**
     * 处理 form data方式调用接口校验失败抛出的异常
     *
     * @param ex
     * @return
     */
    @ExceptionHandler(BindException.class)
    public Result<?> handleBindException(BindException ex) {
        BindingResult bindingResult = ex.getBindingResult();
        String msg = bindingResult.getAllErrors().stream().map(ObjectError::getDefaultMessage)
                .collect(Collectors.joining(";"));
        log.info("GlobalExceptionAdvice ===> handleBindException 的异常信息是 {}", msg);
        return Result.error(msg);
    }

    /**
     * 处理 json 请求体调用接口校验失败抛出的异常
     *
     * @param ex
     * @return
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Result<?> handleMethodArgumentNotValidException(MethodArgumentNotValidException ex) {
        BindingResult bindingResult = ex.getBindingResult();
        String msg = bindingResult.getAllErrors().stream().map(ObjectError::getDefaultMessage)
                .collect(Collectors.joining(";"));
        log.info("GlobalExceptionAdvice ===> handleMethodArgumentNotValidException 的异常信息是 {}", msg);
        return Result.error(msg);
    }

    /**
     * 处理单个参数校验失败抛出的异常
     *
     * @param ex
     * @return
     */
    @ExceptionHandler(ConstraintViolationException.class)
    public Result<?> constraintViolationExceptionHandler(ConstraintViolationException ex) {
        Set<ConstraintViolation<?>> constraintViolations = ex.getConstraintViolations();
        String msg =
                constraintViolations.stream().map(ConstraintViolation::getMessage).collect(Collectors.joining(";"));
        log.info("GlobalExceptionAdvice ===> constraintViolationExceptionHandler 的异常信息是 {}", msg);
        return Result.error(msg);
    }

}
