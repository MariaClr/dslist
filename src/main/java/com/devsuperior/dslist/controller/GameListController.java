package com.devsuperior.dslist.controller;

import com.devsuperior.dslist.dto.GameListDto;
import com.devsuperior.dslist.servicies.GameListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/lists")
public class GameListController {
    @Autowired
    private GameListService gameListService;

    @GetMapping()
    public List<GameListDto> findAll(){
        List<GameListDto> gameListDtos = gameListService.findAll();
        return gameListDtos;
    }
}
