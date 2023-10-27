package com.example.travelapp.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "trip")
@Data
public class Trip {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date date;
    private String description;

    @ManyToOne
    @JoinColumn(name = "address_id")
    private Address address;

    @Temporal(TemporalType.DATE)
    @Column(name = "checkin")
    private Date checkin;

    @Temporal(TemporalType.DATE)
    @Column(name = "checkout")
    private Date checkOut;
    private Double price;
}
