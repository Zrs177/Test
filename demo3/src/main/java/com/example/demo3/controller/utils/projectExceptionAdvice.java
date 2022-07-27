package com.example.demo3.controller.utils;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class projectExceptionAdvice {
      @ExceptionHandler
      public R doException(Exception ex){

          ex.printStackTrace();
          return new R(false,"服务器故障，请稍后再试");
      }
}
