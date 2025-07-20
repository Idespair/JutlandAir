package com.JutlandAir.JutlandAir.client.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "reservations")
@Getter
@Setter
@NoArgsConstructor
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
