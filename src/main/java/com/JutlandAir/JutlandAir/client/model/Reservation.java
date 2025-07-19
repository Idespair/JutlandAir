package com.JutlandAir.JutlandAir.client.model;

import com.JutlandAir.JutlandAir.plane.model.Plane;
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
    @JoinColumn(name = "plane_id", unique = true)
    private Plane planeUsed;

    @OneToOne
    @JoinColumn(name = "seat_id", unique = true)
    private Seat seatAssigned;

}
