package com.example.tp_foyer.controllers;

import com.example.tp_foyer.entity.Reservation;
import com.example.tp_foyer.services.interfaces.IReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reservation")
public class ReservationController {

    @Autowired
    private IReservationService reservationService;

    @GetMapping("/retrieve-all")
    public List<Reservation> getAllReservations() {
        return reservationService.retrieveAllReservations();
    }

    @GetMapping("/retrieve/{id}")
    public Reservation getReservation(@PathVariable("id") String idReservation) {
        return reservationService.retrieveReservation(idReservation);
    }

    @PostMapping("/add")
    public Reservation addReservation(@RequestBody Reservation r) {
        return reservationService.addReservation(r);
    }

    @PutMapping("/update")
    public Reservation updateReservation(@RequestBody Reservation r) {
        return reservationService.updateReservation(r);
    }

    @DeleteMapping("/remove/{id}")
    public void removeReservation(@PathVariable("id") String idReservation) {
        reservationService.removeReservation(idReservation);
    }
}
