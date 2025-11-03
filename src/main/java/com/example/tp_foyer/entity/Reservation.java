package com.example.tp_foyer.entity;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
public class Reservation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String idReservation;

    private Date anneeUniversitaire;

    private Boolean estValide;
    @ManyToOne
    private Chambre chambre;

    @ManyToMany(mappedBy = "reservations")
    private List<Etudiant> etudiants;}
