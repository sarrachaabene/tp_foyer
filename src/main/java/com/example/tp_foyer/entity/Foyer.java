package com.example.tp_foyer.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
public class Foyer implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFoyer;

    private String nomFoyer;

    private Long capaciteFoyer;
    @OneToOne(mappedBy="foyer")
    private Universite universite;
   @OneToMany(mappedBy = "foyer", cascade = CascadeType.ALL)
    private List<Bloc> blocs;
}
