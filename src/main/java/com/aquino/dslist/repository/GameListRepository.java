package com.aquino.dslist.repository;

import com.aquino.dslist.entities.Game;
import com.aquino.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
