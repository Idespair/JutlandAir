package com.JutlandAir.JutlandAir.client.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "reservations")
public class Reservation {

    @Id
    private String id;

    private LocalDateTime reservationDate;

    @OneToOne
    @JoinColumn(name = "client_id")
    private Client passenger;

    @OneToOne
    @JoinColumn(name = "seat_id", unique = true)
    private Seat seatAssigned;

}
