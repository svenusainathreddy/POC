 package com.example.Backend.Repository;
  
 import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Backend.Model.Flight;

 public interface FlightRepository extends JpaRepository<Flight, Long> {
     List<Flight> findByOriginAndDestination(String origin, String destination);
 }
