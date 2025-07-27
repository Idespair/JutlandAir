package com.JutlandAir.JutlandAir.client.model;

import com.JutlandAir.JutlandAir.plane.model.Plane;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "seats")
@Getter
@Setter
@NoArgsConstructor
public class Seat {

    @Id
    @GeneratedValue
    @org.hibernate.annotations.UuidGenerator
    @Column(name = "id", updatable = false, nullable = false)
    private UUID id;

    @Column(nullable = false, columnDefinition = "VARCHAR(4)")
    private String seatNumber;

    @OneToOne
    @JoinColumn(name = "plane_id")
    private Plane planeAssigned;

    @OneToOne(mappedBy = "seatAssigned")
    private Reservation reservation;
}