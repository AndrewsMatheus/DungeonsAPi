package com.study.dungeons.BestiaryApi.service;

import com.study.dungeons.BestiaryApi.DTO.request.MonsterDto;
import com.study.dungeons.BestiaryApi.DTO.response.MessageResponseDto;
import com.study.dungeons.BestiaryApi.Mapper.MonsterMapper;
import com.study.dungeons.BestiaryApi.entity.Monster;
import com.study.dungeons.BestiaryApi.exception.MonsterNotFoundException;
import com.study.dungeons.BestiaryApi.repository.MonsterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MonsterService {

    @Autowired
    private MonsterRepository monsterRepository;

    @Autowired
    private final MonsterMapper monsterMapper = MonsterMapper.INSTANCE;

    public MessageResponseDto create(MonsterDto monsterDto){ // Create a new monster in database if not exists a monster with same name

        Monster monsterToSave = monsterMapper.toModel(monsterDto);

        Monster savedMonster = monsterRepository.save(monsterToSave);

        System.out.println(monsterDto);

        return createMessageResponse("Created monster with name ", savedMonster.getName());
    }
    public MonsterDto findbyName(String monsterName) throws MonsterNotFoundException { // Search in database for a monster

        Monster monster = monsterRepository.findByName(monsterName)
                .orElseThrow(() -> new MonsterNotFoundException(monsterName));

        return monsterMapper.toDto(monster);
    }

    public List<MonsterDto> listAll(){ // Get all Monsters in repository
        List<Monster> monster = monsterRepository.findAll();

        return monster.stream()
                .map(monsterMapper::toDto)
                .collect(Collectors.toList());
    }
    public MessageResponseDto update(String monsterName, MonsterDto monsterDto) throws MonsterNotFoundException { // Update a exist monster

        Monster existsMonster = monsterRepository.findByName(monsterName)
                .orElseThrow(() -> new MonsterNotFoundException(monsterName));

        Monster updatedMonster = monsterMapper.toModel(monsterDto);

        updatedMonster.setId(existsMonster.getId());

        Monster savedMonster = monsterRepository.save(updatedMonster);

        MessageResponseDto messageResponse = createMessageResponse("Monster updated successfully", savedMonster.getName());

        return messageResponse;
    }
    public void delete(String monsterName) throws MonsterNotFoundException{ // method to delete an exist monster in database

        Monster existsMonster = monsterRepository.findByName(monsterName)
                .orElseThrow(() -> new MonsterNotFoundException(monsterName));

        monsterRepository.deleteById(existsMonster.getId());

    }
    private MessageResponseDto createMessageResponse(String s, String name){ // method to respond with a message

        return MessageResponseDto
                .builder()
                .message(s + name)
                .build();
    }
}
