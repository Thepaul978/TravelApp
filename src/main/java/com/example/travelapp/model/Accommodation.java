package com.example.travelapp.model;

import jakarta.persistence.*;
import java.util.Date;
import lombok.Data;

@Entity
@Table(name = "accommodation")
@Data
public class Accommodation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
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
