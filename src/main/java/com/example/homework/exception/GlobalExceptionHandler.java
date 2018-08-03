package com.example.homework.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {


  @ResponseBody
  @ExceptionHandler(value = GameNotFoundException.class)
  public ResponseEntity<ErrorResource> gameNotFoundException(GameNotFoundException e) {
    return new ResponseEntity<ErrorResource>(new ErrorResource(e.getCode(), e.getMessage()),
        HttpStatus.NOT_FOUND);
  }



  @ResponseBody
  @ExceptionHandler(value = PlayerAldreadyException.class)
  public ResponseEntity<ErrorResource> playerAldreadyException(PlayerAldreadyException e) {
    return new ResponseEntity<ErrorResource>(new ErrorResource(e.getCode(), e.getMessage()),
        HttpStatus.BAD_REQUEST);
  }
}

