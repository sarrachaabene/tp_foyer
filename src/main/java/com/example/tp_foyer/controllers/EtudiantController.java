package com.example.tp_foyer.controllers;

import com.example.tp_foyer.entity.Etudiant;
import com.example.tp_foyer.services.interfaces.IEtudiantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/etudiant")
public class EtudiantController {
    @Autowired
    private IEtudiantService etudiantService;

    @GetMapping("/retrieve-all")
    public List<Etudiant> getAllEtudiants() {
        return etudiantService.retrieveAllEtudiants();
    }

    @GetMapping("/retrieve/{id}")
    public Etudiant getEtudiant(@PathVariable("id") Long idEtudiant) {
        return etudiantService.retrieveEtudiant(idEtudiant);
    }

    @PostMapping("/add")
    public Etudiant addEtudiant(@RequestBody Etudiant e) {
        return etudiantService.addEtudiant(e);
    }

    @PutMapping("/update")
    public Etudiant updateEtudiant(@RequestBody Etudiant e) {
        return etudiantService.updateEtudiant(e);
    }

    @DeleteMapping("/remove/{id}")
    public void removeEtudiant(@PathVariable("id") Long idEtudiant) {
        etudiantService.removeEtudiant(idEtudiant);
    }
}
