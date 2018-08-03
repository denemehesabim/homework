package com.example.homework.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.homework.domain.Game;
import com.example.homework.exception.GameNotFoundException;
import com.example.homework.repository.GameRepository;
import com.example.homework.resource.GameResource;
import com.example.homework.resource.ResponseResource;

@Service
public class GameService {


  private final GameRepository gameRepository;

  @Autowired
  public GameService(GameRepository gameRepository) {
    this.gameRepository = gameRepository;

  }

  @Transactional
  public ResponseResource create(GameResource gameResource) {
    Game game = new Game();
    game.setPlayer(gameResource.getPlayer());
    gameRepository.save(game);

    ResponseResource resource = new ResponseResource();
    resource.setDescription("Oyun başarıyla başlatıldı.");
    return resource;

  }


  public ResponseResource loadGame(Integer objId) throws GameNotFoundException {
    Optional<Game> game = gameRepository.findById(objId);
    if (game.isPresent()) {
      ResponseResource resource = new ResponseResource();
      resource.setDescription("Oyun sonlandırıldı.");
      return resource;
    } else {

      throw new GameNotFoundException(404, "Oyun bulunamadı.");
    }


  }



}
