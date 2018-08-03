package com.example.homework.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.homework.domain.Game;


@Repository
public interface GameRepository extends JpaRepository<Game, Integer> {



}
