package com.axis.batch197.service;

import com.axis.batch197.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}