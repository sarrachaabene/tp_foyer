package com.example.tp_foyer.controllers;

import com.example.tp_foyer.entity.Universite;
import com.example.tp_foyer.services.interfaces.IUniversiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/universite")
public class UniversiteController {

    @Autowired
    private IUniversiteService universiteService;

    @GetMapping("/retrieve-all")
    public List<Universite> getAllUniversites() {
        return universiteService.retrieveAllUniversites();
    }

    @GetMapping("/retrieve/{id}")
    public Universite getUniversite(@PathVariable("id") Long idUniversite) {
        return universiteService.retrieveUniversite(idUniversite);
    }

    @PostMapping("/add")
    public Universite addUniversite(@RequestBody Universite u) {
        return universiteService.addUniversite(u);
    }

    @PutMapping("/update")
    public Universite updateUniversite(@RequestBody Universite u) {
        return universiteService.updateUniversite(u);
    }

    @DeleteMapping("/remove/{id}")
    public void removeUniversite(@PathVariable("id") Long idUniversite) {
        universiteService.removeUniversite(idUniversite);
    }
}
