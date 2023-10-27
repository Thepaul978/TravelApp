package com.example.travelapp.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "activity")
@Data
public class Activity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;

    @Embedded
    private Cost cost;

    @ManyToOne
    @JoinColumn(name = "address_id")
    private Address address;

    private int durationInHours;
    private int numberOfParticipants;

}
