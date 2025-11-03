package com.example.tp_foyer.entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Universite implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUniversite;
    private String adresse;
    private String nomUniversite;

    @OneToOne
    private Foyer foyer;
}
