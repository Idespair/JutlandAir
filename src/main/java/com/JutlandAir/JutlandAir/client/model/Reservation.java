package com.JutlandAir.JutlandAir.client.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
import java.util.UUID;

@Entity
@Table(name = "reservations")
@Getter
@Setter
@NoArgsConstructor
public class Reservation {

    @Id
    @GeneratedValue
    @org.hibernate.annotations.UuidGenerator
    @Column(name = "id", updatable = false)
    private UUID id;

    @Column(nullable = false)
    private Instant reservationDate;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client passenger;

    @OneToOne
    @JoinColumn(name = "seat_id", unique = true)
    private Seat seatAssigned;

}
