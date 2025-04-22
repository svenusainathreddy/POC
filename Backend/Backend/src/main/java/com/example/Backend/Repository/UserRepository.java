package com.example.Backend.Repository;

  import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Backend.Model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
