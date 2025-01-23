package com.devsuperior.dslist.servicies;

import com.devsuperior.dslist.dto.GameDto;
import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll(){
        List<GameMinDTO> games = gameRepository.findAll().stream().map(g -> new GameMinDTO(g)).toList();
        return games;
    };
    @Transactional(readOnly = true)

    public GameDto findById(Long id){
        Game game = gameRepository.findById(id).get();
        GameDto gameDto = new GameDto(game);
        return gameDto;

    };

}
