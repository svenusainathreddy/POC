package com.example.Backend.Controller;

 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Backend.Model.User;
import com.example.Backend.Service.UserService;

@RestController
@RequestMapping("/users")
 
public class UserController {
@Autowired
    private  UserService userService;

    // POST /users/register
    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody User user) {
        userService.registerUser(user);
        return ResponseEntity.ok("User registered successfully.");
    }

    // POST /users/login
    @PostMapping("/login")
    public ResponseEntity<String> loginUser(@RequestParam String email, @RequestParam String password) {
        boolean isAuthenticated = userService.authenticateUser(email, password);
        if (isAuthenticated) {
            return ResponseEntity.ok("Login successful.");
        } else {
            return ResponseEntity.status(401).body("Invalid credentials.");
        }
    }

    // GET /users/profile
    @GetMapping("/profile")
    public ResponseEntity<User> getUserProfile(@RequestParam Long userId) {
        User user = userService.getUserProfile(userId);
        return ResponseEntity.ok(user);
    }

    // PUT /users/profile
    @PutMapping("/profile")
    public ResponseEntity<String> updateUserProfile(@RequestBody User updatedUser) {
        userService.updateUserProfile(updatedUser);
        return ResponseEntity.ok("Profile updated successfully.");
    }

    // POST /users/link-frequent-flyer
    @PostMapping("/link-frequent-flyer")
    public ResponseEntity<String> linkFrequentFlyer(@RequestParam Long userId, @RequestParam String flyerNumber) {
        userService.linkFrequentFlyer(userId, flyerNumber);
        return ResponseEntity.ok("Frequent flyer account linked successfully.");
    }
}

