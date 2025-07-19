package com.JutlandAir.JutlandAir.client.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name = "clients")
public class Client {

    @Id
    private String id;

    private String name;

    private String lastName;

    private String email;

    private String password;

    private String countryOfBirth;

    private String document;

    @OneToMany(mappedBy = "passenger")
    private List<Reservation> reservations;

}
