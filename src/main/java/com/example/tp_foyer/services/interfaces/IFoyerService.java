package com.example.tp_foyer.services.interfaces;

import com.example.tp_foyer.entity.Foyer;
import java.util.List;

public interface IFoyerService {
    List<Foyer> retrieveAllFoyers();
    Foyer addFoyer(Foyer f);
    Foyer updateFoyer(Foyer f);
    Foyer retrieveFoyer(Long idFoyer);
    void removeFoyer(Long idFoyer);
}
