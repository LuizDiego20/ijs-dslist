package com.projeto_ijs.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto_ijs.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}