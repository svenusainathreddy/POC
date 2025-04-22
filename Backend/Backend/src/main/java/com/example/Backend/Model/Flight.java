 package com.example.Backend.Model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "flights")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Flight {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long flightId;

    private String origin;
    private String destination;
    private String departureTime;
    private String arrivalTime;
    private String status;
    private int totalSeats;
    private int availableSeats;
}
