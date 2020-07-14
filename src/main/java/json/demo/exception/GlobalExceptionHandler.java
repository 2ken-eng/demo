package json.demo.exception;

import json.demo.JsonModel.Result;
import json.demo.JsonModel.Root;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * Create By C on 2020-07-05
 *
 * @author changtao
 */

@RestControllerAdvice
public class GlobalExceptionHandler {


    @ExceptionHandler(value = Exception.class)


    public Root globalExceptionHandler(Exception e) {


        return Result.getErrorRoot("系统异常" + e.toString());
    }

}
