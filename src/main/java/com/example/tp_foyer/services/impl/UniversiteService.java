package com.example.tp_foyer.services.impl;

import com.example.tp_foyer.entity.Universite;
import com.example.tp_foyer.repositories.UniversiteRepository;
import com.example.tp_foyer.services.interfaces.IUniversiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UniversiteService implements IUniversiteService {
    @Autowired
    private UniversiteRepository universiteRepository;

    @Override
    public List<Universite> retrieveAllUniversites() {
        return universiteRepository.findAll();
    }

    @Override
    public Universite addUniversite(Universite u) {
        return universiteRepository.save(u);
    }

    @Override
    public Universite updateUniversite(Universite u) {
        return universiteRepository.save(u);
    }

    @Override
    public Universite retrieveUniversite(Long idUniversite) {
        return universiteRepository.findById(idUniversite).orElse(null);
    }

    @Override
    public void removeUniversite(Long idUniversite) {
        universiteRepository.deleteById(idUniversite);
    }
}
