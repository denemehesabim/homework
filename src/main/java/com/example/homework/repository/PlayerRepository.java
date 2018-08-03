package com.example.homework.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.homework.domain.Player;


@Repository
public interface PlayerRepository extends CrudRepository<Player, Integer> {

  Player findByName(String name);
}
