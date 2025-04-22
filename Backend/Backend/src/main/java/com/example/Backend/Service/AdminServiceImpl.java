 package com.example.Backend.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Backend.Model.Flight;
import com.example.Backend.Model.ReportDTO;
import com.example.Backend.Model.User;
import com.example.Backend.Repository.FlightRepository;
import com.example.Backend.Repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AdminServiceImpl implements AdminService {

    private final FlightRepository flightRepository;
    private final UserRepository userRepository;

    
    public Flight saveOrUpdateFlight(Flight flight) {
        return flightRepository.save(flight);
    }

    
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    
    public ReportDTO generateReport() {
        // Mocked data for demonstration
        return ReportDTO.builder()
                .totalBookings(120)
                .totalRevenue(300000.00)
                .mostPopularDestination("Delhi")
                .build();
    }
}
