package com.example.homework.enums;

public enum GameStatus {



  CONTINUE(0), WIN(1), LOOSED(2);

  private Integer value;

  private GameStatus(Integer value) {
      this.value = value;
  }

  public Integer getValue() {
    return value;
  }

  public Integer toValue() {
    return this.value;
  }



}
