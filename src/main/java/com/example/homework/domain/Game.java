package com.example.homework.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.example.homework.enums.GameStatus;

@Entity
@Table(name = "GAME")
public class Game {


  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
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
