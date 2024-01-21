package com.aquino.dslist.dto;

import com.aquino.dslist.entities.Game;

public record GameMinDTO(

     Long id,
     String title,
     Integer year,
     String imgUrl,
     String shortDescription){

    public GameMinDTO(Game game) {
        this(game.getId(), game.getTitle(), game.getYear(), game.getImgUrl(), game.getShortDescription());
    }
}
