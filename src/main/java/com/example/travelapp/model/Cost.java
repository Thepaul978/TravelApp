package com.example.travelapp.model;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Embeddable
@Data
public class Cost {

    private Double amount;
    private String currency;

}
