package com.example.travelapp.repository;

import com.example.travelapp.model.Accommodation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccommodationRepository extends JpaRepository<Accommodation, Long> {
    // You can add custom query methods here if needed
}
