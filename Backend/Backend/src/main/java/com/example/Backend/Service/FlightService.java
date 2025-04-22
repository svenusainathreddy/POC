 package com.example.Backend.Service;

import java.util.List;

import com.example.Backend.Model.Flight;

public interface FlightService {
    List<Flight> searchFlights(String origin, String destination);
    Flight getFlightDetails(Long flightId);
    String selectSeat(Long flightId);
    String getFlightStatus(Long flightId);
}
