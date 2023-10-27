package com.example.travelapp.repository;

import com.example.travelapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    // You can define custom query methods here if needed.
}
