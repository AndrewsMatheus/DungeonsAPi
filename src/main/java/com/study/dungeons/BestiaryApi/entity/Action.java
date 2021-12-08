package com.study.dungeons.BestiaryApi.entity;

import javax.persistence.*;

@Entity
@Table(name = "action")
public class Action {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="action_sequence")
    @SequenceGenerator(name="action_sequence", sequenceName="act_seq")
    private String name;

    @Column(nullable = false)
    private String description;

}