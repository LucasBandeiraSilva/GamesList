package com.lucasbandeira.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasbandeira.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList,Long> {
    
}
