package com.axis.batch197.service;

public interface SecurityService {
    String findLoggedInUsername();

    void autoLogin(String username, String password);
}