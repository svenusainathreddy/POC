 package com.example.Backend.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Backend.Model.Flight;
import com.example.Backend.Repository.FlightRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class FlightServiceImpl implements FlightService {

    private final FlightRepository flightRepository;

    @Override
    public List<Flight> searchFlights(String origin, String destination) {
        return flightRepository.findByOriginAndDestination(origin, destination);
    }

    
    public Flight getFlightDetails(Long flightId) {
        return flightRepository.findById(flightId)
                .orElseThrow(() -> new RuntimeException("Flight not found"));
    }

    public String selectSeat(Long flightId) {
        Flight flight = getFlightDetails(flightId);
        if (flight.getAvailableSeats() > 0) {
            flight.setAvailableSeats(flight.getAvailableSeats() - 1);
            flightRepository.save(flight);
            return "Seat selected successfully.";
        } else {
            return "No available seats.";
        }
    }

    public String getFlightStatus(Long flightId) {
        Flight flight = getFlightDetails(flightId);
        return flight.getStatus();
    }



	 
}
