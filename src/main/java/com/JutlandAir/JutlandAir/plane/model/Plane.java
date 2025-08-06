package com.JutlandAir.JutlandAir.plane.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "planes")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Plane {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(nullable = false, unique = true)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Model model;

    @Column(nullable = false)
    private String countryOfRegistration;

    @Column(nullable = false)
    private float hoursFlown;

    @Column(nullable = false)
    private int numberOfSeats;

    @Column(nullable = false)
    private boolean airworthy;
}
