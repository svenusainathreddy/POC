package com.example.Backend.Service;

import com.example.Backend.Model.User;

public interface UserService {

    void registerUser(User user);

    boolean authenticateUser(String email, String password);

    User getUserProfile(Long userId);

    void updateUserProfile(User user);

    void linkFrequentFlyer(Long userId, String flyerNumber);
}

