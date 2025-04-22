 package com.example.Backend.Controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Backend.Model.Flight;
import com.example.Backend.Service.FlightService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/flights")
@RequiredArgsConstructor
public class FlightController {

    private final FlightService flightService;

    // GET /flights/search
    @GetMapping("/search")
    public ResponseEntity<List<Flight>> searchFlights(@RequestParam String origin, @RequestParam String destination) {
        return ResponseEntity.ok(flightService.searchFlights(origin, destination));
    }

    // GET /flights/{flightId}
    @GetMapping("/{flightId}")
    public ResponseEntity<Flight> getFlightDetails(@PathVariable Long flightId) {
        return ResponseEntity.ok(flightService.getFlightDetails(flightId));
    }

    // POST /flights/{flightId}/select-seat
    @PostMapping("/{flightId}/select-seat")
    public ResponseEntity<String> selectSeat(@PathVariable Long flightId) {
        return ResponseEntity.ok(flightService.selectSeat(flightId));
    }

    // GET /flights/status/{flightId}
    @GetMapping("/status/{flightId}")
    public ResponseEntity<String> getFlightStatus(@PathVariable Long flightId) {
        return ResponseEntity.ok(flightService.getFlightStatus(flightId));
    }
}
