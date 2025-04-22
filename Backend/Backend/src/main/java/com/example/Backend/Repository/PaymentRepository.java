 package com.example.Backend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Backend.Model.Payment;

public interface PaymentRepository extends JpaRepository<Payment, String> {
}
