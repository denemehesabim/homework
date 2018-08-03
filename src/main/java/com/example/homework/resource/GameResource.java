package com.example.homework.resource;

import java.io.Serializable;

import com.example.homework.enums.GameStatus;


public class GameResource implements Serializable {

  private static final long serialVersionUID = 1L;

  private Integer Id;

  private String player;



  private String guesses;

  private Integer guessesLeft;

  private String guessedWord;

  private String incorrectLetters;

  private GameStatus gameStatus;

  public Integer getId() {
    return Id;
  }

  public void setId(Integer id) {
    Id = id;
  }

  public String getGuesses() {
    return guesses;
  }

  public void setGuesses(String guesses) {
    this.guesses = guesses;
  }

  public Integer getGuessesLeft() {
    return guessesLeft;
  }

  public void setGuessesLeft(Integer guessesLeft) {
    this.guessesLeft = guessesLeft;
  }

  public String getGuessedWord() {
    return guessedWord;
  }

  public void setGuessedWord(String guessedWord) {
    this.guessedWord = guessedWord;
  }

  public String getIncorrectLetters() {
    return incorrectLetters;
  }

  public void setIncorrectLetters(String incorrectLetters) {
    this.incorrectLetters = incorrectLetters;
  }

  public GameStatus getGameStatus() {
    return gameStatus;
  }

  public void setGameStatus(GameStatus gameStatus) {
    this.gameStatus = gameStatus;
  }

  public String getPlayer() {
    return player;
  }

  public void setPlayer(String player) {
    this.player = player;
  }

}
