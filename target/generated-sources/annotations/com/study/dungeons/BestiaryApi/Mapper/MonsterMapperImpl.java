package com.study.dungeons.BestiaryApi.Mapper;

import com.study.dungeons.BestiaryApi.DTO.request.MonsterDto;
import com.study.dungeons.BestiaryApi.DTO.request.MonsterDto.MonsterDtoBuilder;
import com.study.dungeons.BestiaryApi.entity.Monster;
import com.study.dungeons.BestiaryApi.entity.Monster.MonsterBuilder;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-12-09T19:36:55-0400",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.13 (Amazon.com Inc.)"
)
@Component
public class MonsterMapperImpl implements MonsterMapper {

    @Override
    public Monster toModel(MonsterDto MonsterDto) {
        if ( MonsterDto == null ) {
            return null;
        }

        MonsterBuilder monster = Monster.builder();

        monster.id( MonsterDto.getId() );
        monster.name( MonsterDto.getName() );
        monster.description( MonsterDto.getDescription() );
        monster.alignment( MonsterDto.getAlignment() );
        monster.lifePoints( MonsterDto.getLifePoints() );
        monster.strength( MonsterDto.getStrength() );
        monster.dexterity( MonsterDto.getDexterity() );
        monster.constitution( MonsterDto.getConstitution() );
        monster.inteligence( MonsterDto.getInteligence() );
        monster.wisdom( MonsterDto.getWisdom() );
        monster.charisma( MonsterDto.getCharisma() );
        monster.languages( MonsterDto.getLanguages() );
        monster.challengeLevel( MonsterDto.getChallengeLevel() );

        return monster.build();
    }

    @Override
    public MonsterDto toDto(Monster monster) {
        if ( monster == null ) {
            return null;
        }

        MonsterDtoBuilder monsterDto = MonsterDto.builder();

        monsterDto.id( monster.getId() );
        monsterDto.name( monster.getName() );
        monsterDto.description( monster.getDescription() );
        monsterDto.alignment( monster.getAlignment() );
        monsterDto.lifePoints( monster.getLifePoints() );
        monsterDto.strength( monster.getStrength() );
        monsterDto.dexterity( monster.getDexterity() );
        monsterDto.constitution( monster.getConstitution() );
        monsterDto.inteligence( monster.getInteligence() );
        monsterDto.wisdom( monster.getWisdom() );
        monsterDto.charisma( monster.getCharisma() );
        monsterDto.languages( monster.getLanguages() );
        monsterDto.challengeLevel( monster.getChallengeLevel() );

        return monsterDto.build();
    }
}
