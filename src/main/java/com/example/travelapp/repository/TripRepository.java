package com.example.travelapp.repository;

import com.example.travelapp.model.Trip;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TripRepository extends JpaRepository<Trip, Long> {
    // You can add custom query methods here if needed
}
