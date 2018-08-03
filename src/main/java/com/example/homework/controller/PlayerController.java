package com.example.homework.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.homework.resource.PlayerResource;
import com.example.homework.resource.ResponseResource;
import com.example.homework.service.PlayerService;

@RestController
@RequestMapping("/players")
public class PlayerController {



  private PlayerService playerService;


  @Autowired
  public PlayerController(PlayerService playerService) {
    this.playerService = playerService;
  }

  @PostMapping
  public ResponseEntity<ResponseResource> startGame(@RequestBody PlayerResource playerResource) {
    return ResponseEntity.ok().body(playerService.create(playerResource));
  }



}
