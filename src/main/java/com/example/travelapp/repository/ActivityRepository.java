package com.example.travelapp.repository;

import com.example.travelapp.model.Activity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActivityRepository extends JpaRepository<Activity, Long> {
    // You can add custom query methods here if needed
}
