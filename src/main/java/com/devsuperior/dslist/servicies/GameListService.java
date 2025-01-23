package com.devsuperior.dslist.servicies;

import com.devsuperior.dslist.dto.GameListDto;
import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameListService {
    @Autowired
    private GameListRepository gameListRepository;
    public List<GameListDto> findAll(){
        List<GameListDto> gameListDtos = gameListRepository.findAll().stream().map(g -> new GameListDto(g)).toList();
        return gameListDtos;
    }


}
