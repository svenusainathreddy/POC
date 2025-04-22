 package com.example.Backend.Service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.Backend.Model.User;
import com.example.Backend.Repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public void registerUser(User user) {
        // Save user with plain text password
        userRepository.save(user);
    }

    @Override
    public boolean authenticateUser(String email, String password) {
        Optional<User> userOptional = userRepository.findByEmail(email);
        return userOptional
                .map(user -> password.equals(user.getPassword())) // assuming field is renamed to 'password'
                .orElse(false);
    }

    public User getUserProfile(Long userId) {
        return userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found"));
    }

    @Override
    public void updateUserProfile(User updatedUser) {
        userRepository.save(updatedUser);
    }

    public void linkFrequentFlyer(Long userId, String flyerNumber) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found"));
        System.out.println("Linking flyer number: " + flyerNumber + " to user: " + userId);
    }
}
