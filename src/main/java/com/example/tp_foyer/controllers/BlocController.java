package com.example.tp_foyer.controllers;

import com.example.tp_foyer.entity.Bloc;
import com.example.tp_foyer.services.interfaces.IBlocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bloc")
public class BlocController {

    @Autowired
    private IBlocService blocService;

    @GetMapping("/retrieve-all")
    public List<Bloc> getAllBlocs() {
        return blocService.retrieveAllBlocs();
    }

    @GetMapping("/retrieve/{id}")
    public Bloc getBloc(@PathVariable("id") Long idBloc) {
        return blocService.retrieveBloc(idBloc);
    }

    @PostMapping("/add")
    public Bloc addBloc(@RequestBody Bloc b) {
        return blocService.addBloc(b);
    }

    @PutMapping("/update")
    public Bloc updateBloc(@RequestBody Bloc b) {
        return blocService.updateBloc(b);
    }

    @DeleteMapping("/remove/{id}")
    public void removeBloc(@PathVariable("id") Long idBloc) {
        blocService.removeBloc(idBloc);
    }
}
