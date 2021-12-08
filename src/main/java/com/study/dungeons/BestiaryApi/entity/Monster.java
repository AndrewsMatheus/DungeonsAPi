package com.study.dungeons.BestiaryApi.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "monster")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Monster {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="monster_sequence")
    @SequenceGenerator(name="monster_sequence", sequenceName="mons_seq")
    private String name;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private String alignment;

    @Column(nullable = false)
    private int lifePoints;

    @Column(nullable = false)
    private int strength;

    @Column(nullable = false)
    private int dexterity;

    @Column(nullable = false)
    private int constitution;

    @Column(nullable = false)
    private int inteligence;

    @Column(nullable = false)
    private int wisdom;

    @Column(nullable = false)
    private int charisma;

    @Column(nullable = false)
    private String languages;

    @Column(nullable = false)
    private int challengeLevel;

    @OneToMany(fetch = FetchType.LAZY,
            cascade = {CascadeType.PERSIST,
                    CascadeType.MERGE,
                    CascadeType.REMOVE})
    private List<Action> actionsList;

    @OneToMany(fetch = FetchType.LAZY,
            cascade = {CascadeType.PERSIST,
                    CascadeType.MERGE, CascadeType.REMOVE})
    private List<Hability> habilitiesList;

}
