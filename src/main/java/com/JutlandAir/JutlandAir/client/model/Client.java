package com.JutlandAir.JutlandAir.client.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "clients")
@Getter
@Setter
@NoArgsConstructor
public class Client {

    @Id
    @org.hibernate.annotations.UuidGenerator
    @Column(name = "id", updatable = false)
    private UUID id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String countryOfBirth;

    @Column(nullable = false, unique = true, columnDefinition = "VARCHAR(9)")
    private String passport;

    @OneToMany(mappedBy = "passenger")
    private List<Reservation> reservations = new ArrayList<>();

}
