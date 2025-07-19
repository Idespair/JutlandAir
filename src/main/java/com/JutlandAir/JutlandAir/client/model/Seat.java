package com.JutlandAir.JutlandAir.client.model;

import com.JutlandAir.JutlandAir.plane.model.Plane;
import jakarta.persistence.*;

@Entity
@Table(name = "seats")
public class Seat {

    @Id
    private String id;

    @OneToOne
    @JoinColumn(name = "plane_id")
    private Plane planeAssigned;

    @OneToOne
    @JoinColumn(name = "reservation_id")
    private Reservation reservation;
}