package com.lucasbandeira.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucasbandeira.dslist.dto.GameMinDto;
import com.lucasbandeira.dslist.repositories.GameRepository;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDto> findAll() {
        var result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDto(x)).toList();

    }
}
