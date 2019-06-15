package com.axis.batch197.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.axis.batch197.model.User;
import com.axis.batch197.web.dto.UserRegistrationDto;



public interface UserService extends UserDetailsService {

    User findByEmail(String email);

    User save(UserRegistrationDto registration);
}