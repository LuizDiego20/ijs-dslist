package com.projeto_ijs.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto_ijs.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}