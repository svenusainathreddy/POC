 package com.example.Backend.Model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "bookings")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Booking {

    @Id
    private String bookingId;
    private String userId;
    private String flightId;
    private int seatNumber;
    private double amountPaid;
    private String status; // e.g., "CONFIRMED", "CANCELLED", "REFUNDED"
    private LocalDateTime bookingDate;
}
