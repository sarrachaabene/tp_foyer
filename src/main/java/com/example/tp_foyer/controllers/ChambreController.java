package com.example.tp_foyer.controllers;

import com.example.tp_foyer.entity.Chambre;
import com.example.tp_foyer.services.interfaces.IChambreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/chambre")
public class ChambreController {

    @Autowired
    private IChambreService chambreService;

    @GetMapping("/retrieve-all")
    public List<Chambre> getAllChambres() {
        return chambreService.retrieveAllChambres();
    }

    @GetMapping("/retrieve/{id}")
    public Chambre getChambre(@PathVariable("id") Long idChambre) {
        return chambreService.retrieveChambre(idChambre);
    }

    @PostMapping("/add")
    public Chambre addChambre(@RequestBody Chambre c) {
        return chambreService.addChambre(c);
    }

    @PutMapping("/update")
    public Chambre updateChambre(@RequestBody Chambre c) {
        return chambreService.updateChambre(c);
    }

    @DeleteMapping("/remove/{id}")
    public void removeChambre(@PathVariable("id") Long idChambre) {
        chambreService.removeChambre(idChambre);
    }
}
