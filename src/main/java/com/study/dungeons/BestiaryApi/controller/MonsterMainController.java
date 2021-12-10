package com.study.dungeons.BestiaryApi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MonsterMainController {

    @GetMapping("/")
    public String index() {
        return "Greetings to Monster Bestiary!!";
    }
}
