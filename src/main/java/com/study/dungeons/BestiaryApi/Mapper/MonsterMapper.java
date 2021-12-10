package com.study.dungeons.BestiaryApi.Mapper;

import com.study.dungeons.BestiaryApi.DTO.request.MonsterDto;
import com.study.dungeons.BestiaryApi.entity.Monster;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface MonsterMapper {

    MonsterMapper INSTANCE = Mappers.getMapper(MonsterMapper.class);

    Monster toModel(MonsterDto MonsterDto);

    MonsterDto toDto(Monster monster);


}
