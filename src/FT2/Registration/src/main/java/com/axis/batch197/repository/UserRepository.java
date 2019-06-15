package com.axis.batch197.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.axis.batch197.model.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	User findByEmail(String email);
}

