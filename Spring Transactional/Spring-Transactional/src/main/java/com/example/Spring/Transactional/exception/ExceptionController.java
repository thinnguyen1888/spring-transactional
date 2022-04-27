package com.example.Spring.Transactional.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionController {

  @ExceptionHandler(NullPointerException.class)
  public String nullPointer(Exception e) {
    e.printStackTrace();
    return "exception/null-pointer";
  }

  @ExceptionHandler(ArrayIndexOutOfBoundsException.class)
  public String illegalArgument(Exception e) {
    e.printStackTrace();
    return "exception/illegal-argument";
  }

  @ExceptionHandler(Exception.class)
  public String exception(Exception e) {
    e.printStackTrace();
    return "exception/exception";
  }
}
