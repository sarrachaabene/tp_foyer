package com.example.tp_foyer.controllers;

import com.example.tp_foyer.entity.Foyer;
import com.example.tp_foyer.services.interfaces.IFoyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/foyer")
public class FoyerController {

    @Autowired
    private IFoyerService foyerService;

    @GetMapping("/retrieve-all")
    public List<Foyer> getAllFoyers() {
        return foyerService.retrieveAllFoyers();
    }

    @GetMapping("/retrieve/{id}")
    public Foyer getFoyer(@PathVariable("id") Long idFoyer) {
        return foyerService.retrieveFoyer(idFoyer);
    }

    @PostMapping("/add")
    public Foyer addFoyer(@RequestBody Foyer f) {
        return foyerService.addFoyer(f);
    }

    @PutMapping("/update")
    public Foyer updateFoyer(@RequestBody Foyer f) {
        return foyerService.updateFoyer(f);
    }

    @DeleteMapping("/remove/{id}")
    public void removeFoyer(@PathVariable("id") Long idFoyer) {
        foyerService.removeFoyer(idFoyer);
    }
}
