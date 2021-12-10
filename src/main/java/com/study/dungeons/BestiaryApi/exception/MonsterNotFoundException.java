package com.study.dungeons.BestiaryApi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class MonsterNotFoundException extends Exception{

    public MonsterNotFoundException(String name){
        super(String.format("Monster with name %s not found!", name));
    }
}
