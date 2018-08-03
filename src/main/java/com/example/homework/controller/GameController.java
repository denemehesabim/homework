package com.example.homework.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.homework.exception.GameNotFoundException;
import com.example.homework.resource.GameResource;
import com.example.homework.resource.ResponseResource;
import com.example.homework.service.GameService;

@RestController
@RequestMapping("/games")
public class GameController {


  private GameService gameService;

  @Autowired
  public GameController(GameService gameService) {
    this.gameService = gameService;
  }


  /**
   * 
   * Create New Game
   * 
   * @param gameResource
   * @return
   */

  @PostMapping
  public ResponseEntity<ResponseResource> startGame(@RequestBody GameResource gameResource) {
    return ResponseEntity.ok().body(gameService.create(gameResource));
  }



  @GetMapping(value = "/{objId}")
  public ResponseEntity<ResponseResource> load(@PathVariable Integer objId)
      throws GameNotFoundException {
    return ResponseEntity.ok().body(gameService.loadGame(objId));
  }



}
