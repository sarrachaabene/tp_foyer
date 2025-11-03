package com.example.tp_foyer.services.impl;

import com.example.tp_foyer.entity.Reservation;
import com.example.tp_foyer.repositories.ReservationRepository;
import com.example.tp_foyer.services.interfaces.IReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationService implements IReservationService {
    @Autowired
    private ReservationRepository reservationRepository;

    @Override
    public List<Reservation> retrieveAllReservations() {
        return reservationRepository.findAll();
    }

    @Override
    public Reservation addReservation(Reservation r) {
        return reservationRepository.save(r);
    }

    @Override
    public Reservation updateReservation(Reservation r) {
        return reservationRepository.save(r);
    }

    @Override
    public Reservation retrieveReservation(String idReservation) {
        return reservationRepository.findById(idReservation).orElse(null);
    }

    @Override
    public void removeReservation(String idReservation) {
        reservationRepository.deleteById(idReservation);
    }
}
