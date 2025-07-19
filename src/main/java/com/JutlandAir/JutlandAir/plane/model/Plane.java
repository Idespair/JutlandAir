package com.JutlandAir.JutlandAir.plane.model;

import com.JutlandAir.JutlandAir.client.model.Seat;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "planes")
public class Plane {

    @Id
    private String id;

    private String name;

    private String ICAOCode;

    private String countryOfRegistration;

    private float hoursFlown;

    private int NumberOfSeats;

    private boolean airworthy;

    @OneToMany(mappedBy = "planeAssigned")
    private List<Seat> seats;

}
