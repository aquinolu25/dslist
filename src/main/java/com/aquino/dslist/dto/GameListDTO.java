package com.aquino.dslist.dto;

import com.aquino.dslist.entities.GameList;

public record GameListDTO(Long id, String name) {

    public GameListDTO (GameList gameList) {
        this(gameList.getId(), gameList.getName());
    }
}
