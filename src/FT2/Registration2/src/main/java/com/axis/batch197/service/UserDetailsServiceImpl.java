package com.axis.batch197.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;


import com.axis.batch197.model.Roles;
import com.axis.batch197.model.Users;
import com.axis.batch197.utils.RolesDAO;
import com.axis.batch197.utils.UsersDAO;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
 
    @Autowired
    private UsersDAO usersDAO;
 
    @Autowired
    private RolesDAO rolesDAO;
 
    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        Users users = this.usersDAO.findUserAccount(userName);
 
        if (users == null) {
            System.out.println("User not found! " + userName);
            throw new UsernameNotFoundException("User " + userName + " was not found in the database");
        }
 
        System.out.println("Found User: " + users);
 
        // [ROLE_USER, ROLE_ADMIN,..]
        List<String> rolesNames = this.rolesDAO.getRoleNames(users.getUsersId());
 
        List<GrantedAuthority> grantList = new ArrayList<GrantedAuthority>();
        if (rolesNames != null) {
            for (String roles : rolesNames) {
                // ROLE_USER, ROLE_ADMIN,..
                GrantedAuthority authority = new SimpleGrantedAuthority(roles);
                grantList.add(authority);
            }
        }
 
        UserDetails userDetails = (UserDetails) new Users();
 
        return userDetails;
    }
 
}
