package com.study.dungeons.BestiaryApi.controller;

import com.study.dungeons.BestiaryApi.DTO.request.MonsterDto;
import com.study.dungeons.BestiaryApi.DTO.response.MessageResponseDto;
import com.study.dungeons.BestiaryApi.exception.MonsterNotFoundException;
import com.study.dungeons.BestiaryApi.service.MonsterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/monster")
public class MonsterController {

    @Autowired
    MonsterService monsterService;
    
    @RequestMapping("/")
    public String intro(){
        return "Welcome to monsters API";
    } 
    
    @PostMapping
    public MessageResponseDto createMonster(@RequestBody @Valid MonsterDto monsterDto){

        return monsterService.create(monsterDto);
    }

    @GetMapping("/{monsterName}") // Get a determined monster
    @ResponseStatus(HttpStatus.OK)
    public MonsterDto findByName(@PathVariable String monsterName) throws MonsterNotFoundException {

        return monsterService.findbyName(monsterName);
    }

    @GetMapping
    public List<MonsterDto> listAll() {
        return monsterService.listAll();
    }

    @PutMapping("/{monsterName}")
    @ResponseStatus(HttpStatus.OK)
    public MessageResponseDto update(@PathVariable String monsterName, @RequestBody @Valid MonsterDto monsterDto) throws MonsterNotFoundException {
        return monsterService.update(monsterName, monsterDto);
    }
    @DeleteMapping("/{monsterName}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable String monsterName) throws MonsterNotFoundException{

        monsterService.delete(monsterName);
    }
}
