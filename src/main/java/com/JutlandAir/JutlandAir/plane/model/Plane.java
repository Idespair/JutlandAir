package com.JutlandAir.JutlandAir.plane.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "planes")
public class Plane {

    private String Id;

    private String name;

    private String ICAOCode;

    private String countryOfRegistration;

    private float hoursFlown;

    private int seats;

    private boolean airworthy;

}
