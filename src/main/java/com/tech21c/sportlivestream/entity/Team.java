package com.tech21c.sportlivestream.entity;


import javax.persistence.*;

@Entity
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String teamName;
    @Column(nullable = true)
    private String photo;
    private String leagueName;
}
