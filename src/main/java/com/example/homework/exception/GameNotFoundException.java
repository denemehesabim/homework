package com.example.homework.exception;


/**
 * @author msaritas
 */
public class GameNotFoundException extends RuntimeException {
  private static final long serialVersionUID = 1L;

  private Integer code;

  private String message;

  public GameNotFoundException(Integer code, String message) {
    this.code = code;
    this.message = message;
  }

  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }



  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

}