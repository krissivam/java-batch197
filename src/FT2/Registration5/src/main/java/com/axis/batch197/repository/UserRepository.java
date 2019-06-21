package com.axis.batch197.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.axis.batch197.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}