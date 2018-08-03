package com.example.homework.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.homework.domain.Player;
import com.example.homework.exception.PlayerAldreadyException;
import com.example.homework.repository.PlayerRepository;
import com.example.homework.resource.PlayerResource;
import com.example.homework.resource.ResponseResource;

@Service
public class PlayerService {


  private PlayerRepository playerRepository;


  @Autowired
  public PlayerService(PlayerRepository playerRepository) {
    this.playerRepository = playerRepository;
  }

  @Transactional
  public ResponseResource create(PlayerResource playerResource) {

    Player player = playerRepository.findByName(playerResource.getName());
    if (player == null) {
      player = new Player();
      player.setAge(playerResource.getAge());
      player.setName(playerResource.getName());
      playerRepository.save(player);
      ResponseResource resource = new ResponseResource();
      resource.setDescription("Oyuncu başarıyla yaratıldı");
      return resource;
    } else {
      throw new PlayerAldreadyException(400, "Oyuncu adı zaten var");
    }

  }

}
