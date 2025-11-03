package com.example.tp_foyer.services.impl;

import com.example.tp_foyer.entity.Etudiant;
import com.example.tp_foyer.repositories.EtudiantRepository;
import com.example.tp_foyer.services.interfaces.IEtudiantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EtudiantService implements IEtudiantService {
    @Autowired
    private EtudiantRepository etudiantRepository;

    @Override
    public List<Etudiant> retrieveAllEtudiants() {
        return etudiantRepository.findAll();
    }

    @Override
    public Etudiant addEtudiant(Etudiant e) {
        return etudiantRepository.save(e);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant e) {
        return etudiantRepository.save(e);
    }

    @Override
    public Etudiant retrieveEtudiant(Long idEtudiant) {
        return etudiantRepository.findById(idEtudiant).orElse(null);
    }

    @Override
    public void removeEtudiant(Long idEtudiant) {
        etudiantRepository.deleteById(idEtudiant);
    }
}
