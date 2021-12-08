package com.study.dungeons.BestiaryApi.entity;

import javax.persistence.*;

@Entity
@Table(name = "hability")
public class Hability {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="hability_sequence")
    @SequenceGenerator(name="hability_sequence", sequenceName="hab_seq")
    private String name;

    @Column(nullable = false)
    private String description;


}