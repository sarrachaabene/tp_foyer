package com.example.tp_foyer.entity;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
public class Bloc implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBloc;

    private String nomBloc;

    private Long capaciteFoyerBloc;
    @ManyToOne
    private Foyer foyer;

    @OneToMany(mappedBy = "bloc", cascade = CascadeType.ALL)
    private List<Chambre> chambres;}
