package com.lucasbandeira.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lucasbandeira.dslist.dto.GameDto;
import com.lucasbandeira.dslist.dto.GameMinDto;
import com.lucasbandeira.dslist.entities.Game;
import com.lucasbandeira.dslist.repositories.GameRepository;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public GameDto findById(Long id){
        Game result = gameRepository.findById(id).get();
        GameDto dto = new GameDto(result);
        return dto;
    }
    @Transactional(readOnly = true)
    public List<GameMinDto> findAll() {
        var result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDto(x)).toList();

    }
}
