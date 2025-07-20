package com.JutlandAir.JutlandAir.client.model;

import com.JutlandAir.JutlandAir.plane.model.Plane;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "seats")
@Getter
@Setter
@NoArgsConstructor
public class Seat {

    @Id
    private String id;

    private String seatNumber;

    @OneToOne
    @JoinColumn(name = "plane_id")
    private Plane planeAssigned;

    @OneToOne(mappedBy = "seatAssigned")
    private Reservation reservation;
}