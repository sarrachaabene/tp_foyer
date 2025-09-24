package com.example.tp_foyer.entity;

import jakarta.persistence.*;
@Entity
public class Universite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUniversite;
    private String adresse;
    private String nomUniversite;


}
