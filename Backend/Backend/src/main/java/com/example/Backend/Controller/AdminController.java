 package com.example.Backend.Controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Backend.Model.Flight;
import com.example.Backend.Model.ReportDTO;
import com.example.Backend.Model.User;
import com.example.Backend.Service.AdminService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/admin")
@RequiredArgsConstructor
public class AdminController {

    private final AdminService adminService;

    // POST /admin/flights
    @PostMapping("/flights")
    public ResponseEntity<Flight> createOrUpdateFlight(@RequestBody Flight flight) {
        return ResponseEntity.ok(adminService.saveOrUpdateFlight(flight));
    }

    // GET /admin/users
    @GetMapping("/users")
    public ResponseEntity<List<User>> getAllUsers() {
        return ResponseEntity.ok(adminService.getAllUsers());
    }

    // GET /admin/reports
    @GetMapping("/reports")
    public ResponseEntity<ReportDTO> generateReport() {
        return ResponseEntity.ok(adminService.generateReport());
    }
}
