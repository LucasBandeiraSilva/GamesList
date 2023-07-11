package com.lucasbandeira.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasbandeira.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game,Long> {
    
}
