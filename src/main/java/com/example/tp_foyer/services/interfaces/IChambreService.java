package com.example.tp_foyer.services.interfaces;

import com.example.tp_foyer.entity.Chambre;
import java.util.List;

public interface IChambreService {
    List<Chambre> retrieveAllChambres();
    Chambre addChambre(Chambre c);
    Chambre updateChambre(Chambre c);
    Chambre retrieveChambre(Long idChambre);
    void removeChambre(Long idChambre);
}
