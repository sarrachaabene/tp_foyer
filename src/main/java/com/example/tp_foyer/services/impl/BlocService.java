package com.example.tp_foyer.services.impl;

import com.example.tp_foyer.entity.Bloc;
import com.example.tp_foyer.repositories.BlocRepository;
import com.example.tp_foyer.services.interfaces.IBlocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlocService implements IBlocService {
    @Autowired
    private BlocRepository blocRepository;

    @Override
    public List<Bloc> retrieveAllBlocs() {
        return blocRepository.findAll();
    }

    @Override
    public Bloc addBloc(Bloc b) {
        return blocRepository.save(b);
    }

    @Override
    public Bloc updateBloc(Bloc b) {
        return blocRepository.save(b);
    }

    @Override
    public Bloc retrieveBloc(Long idBloc) {
        return blocRepository.findById(idBloc).orElse(null);
    }

    @Override
    public void removeBloc(Long idBloc) {
        blocRepository.deleteById(idBloc);
    }
}
