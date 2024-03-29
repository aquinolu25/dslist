package com.aquino.dslist.dto;

import com.aquino.dslist.entities.Game;
import com.aquino.dslist.projections.GameMinProjection;

public record GameMinDTO(

     Long id,
     String title,
     Integer year,
     String imgUrl,
     String shortDescription){

    public GameMinDTO(Game game) {
        this(game.getId(), game.getTitle(), game.getYear(), game.getImgUrl(), game.getShortDescription());
    }

    public GameMinDTO(GameMinProjection projection) {
        this(projection.getId(), projection.getTitle(), projection.getGameYear(), projection.getImgUrl(), projection.getShortDescription());
    }
}
