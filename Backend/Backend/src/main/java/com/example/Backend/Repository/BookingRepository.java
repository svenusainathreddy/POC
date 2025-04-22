 package com.example.Backend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Backend.Model.Booking;

public interface BookingRepository extends JpaRepository<Booking, String> {
}
