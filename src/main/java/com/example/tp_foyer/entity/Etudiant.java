package com.example.tp_foyer.entity;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
public class Etudiant implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEtudiant;

    private String nomEt;
    private String prenomEt;
    private Long cin;

    private String ecole;
    private Date dateNaissance;
    @ManyToMany
    private List<Reservation> reservations;
}

