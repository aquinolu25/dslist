package com.aquino.dslist.services;

import com.aquino.dslist.dto.GameMinDTO;
import com.aquino.dslist.entities.Game;
import com.aquino.dslist.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll() {
        var result = gameRepository.findAll();
        List<GameMinDTO> dto = result.stream().map(g -> new GameMinDTO(g)).toList();
        return dto;
    }
}
