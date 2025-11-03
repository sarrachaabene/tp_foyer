package com.example.tp_foyer.entity;

import jakarta.persistence.*;
import org.antlr.v4.runtime.misc.Triple;

import java.io.Serializable;
import java.util.List;

@Entity
public class Chambre implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private Long idChambre;
    private Long numeroChambre;
    @Enumerated(EnumType.STRING)
    private TypeChambre typeC;
    @ManyToOne
    private Bloc bloc;
    @OneToMany(mappedBy = "chambre", cascade = CascadeType.ALL)
    private List<Reservation> reservations;

}
