package com.study.dungeons.BestiaryApi.DTO.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MonsterDto {

    private int id;

    @NotEmpty
    private String name;

    @NotEmpty
    private String description;

    @NotEmpty
    private String alignment;

    @NotEmpty
    private int lifePoints;

    @NotEmpty
    private int strength;

    @NotEmpty
    private int dexterity;

    @NotEmpty
    private int constitution;

    @NotEmpty
    private int inteligence;

    @NotEmpty
    private int wisdom;

    @NotEmpty
    private int charisma;

    @NotEmpty
    private String languages;

    @NotEmpty
    private int challengeLevel;
}
