package com.example.tp_foyer.entity;

import jakarta.persistence.*;
import org.antlr.v4.runtime.misc.Triple;
@Entity
public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private Long idChambre;
    private Long numeroChambre;
    @Enumerated(EnumType.STRING)
    private TypeChambre typeC;
}
