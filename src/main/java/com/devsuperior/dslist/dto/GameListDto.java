package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.GameList;

public class GameListDto {
    private Long id;
    private String name;
    public GameListDto(GameList gameList) {
        this.id = gameList.getId();
        this.name = gameList.getName();
    }
    public GameListDto(){};
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }


}
