package com.JutlandAir.JutlandAir.client.service;

import com.JutlandAir.JutlandAir.client.repository.IReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationService {

    @Autowired
    private IReservationRepository reservationRepository;

}
