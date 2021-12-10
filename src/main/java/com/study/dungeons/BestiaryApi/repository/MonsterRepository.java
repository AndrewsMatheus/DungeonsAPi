package com.study.dungeons.BestiaryApi.repository;

import com.study.dungeons.BestiaryApi.entity.Monster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface MonsterRepository extends JpaRepository<Monster, Integer> {

    @Query("select m from Monster m where m.name like :name")
    Optional<Monster> findByName(String name);
}
