 package com.example.Backend.Service;

import java.util.List;

import com.example.Backend.Model.Flight;
import com.example.Backend.Model.ReportDTO;
import com.example.Backend.Model.User;

public interface AdminService {
    Flight saveOrUpdateFlight(Flight flight);
    List<User> getAllUsers();
    ReportDTO generateReport();
}
