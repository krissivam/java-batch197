package com.axis.batch197.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Repository;

import com.axis.batch197.formbean.AppUserForm;
import com.axis.batch197.model.AppUser;

@Repository
public class AppUserDAO {
 
    // Config in WebSecurityConfig
    @Autowired
    private PasswordEncoder passwordEncoder;
 
    private static final Map<Long, AppUser> USERS_MAP = new HashMap<>();
 
    static {
        initDATA();
    }
 
    private static void initDATA() {
        String encrytedPassword = "";
 
        AppUser tom = new AppUser(1L, "tom", //
                true, "tom@waltdisney.com", encrytedPassword);
 
        AppUser jerry = new AppUser(2L, "jerry", //
                true, "jerry@waltdisney.com", encrytedPassword);
 
        USERS_MAP.put(tom.getUserId(), tom);
        USERS_MAP.put(jerry.getUserId(), jerry);
    }
 
    public Long getMaxUserId() {
        long max = 0;
        for (Long id : USERS_MAP.keySet()) {
            if (id > max) {
                max = id;
            }
        }
        return max;
    }
 
    //
 
    public AppUser findAppUserByUserName(String userName) {
        Collection<AppUser> appUsers = USERS_MAP.values();
        for (AppUser u : appUsers) {
            if (u.getUserName().equals(userName)) {
                return u;
            }
        }
        return null;
    }
 
    public AppUser findAppUserByEmail(String email) {
        Collection<AppUser> appUsers = USERS_MAP.values();
        for (AppUser u : appUsers) {
            if (u.getEmail().equals(email)) {
                return u;
            }
        }
        return null;
    }
 
    public List<AppUser> getAppUsers() {
        List<AppUser> list = new ArrayList<>();
 
        list.addAll(USERS_MAP.values());
        return list;
    }
 
    public AppUser createAppUser(AppUserForm form) {
        Long userId = this.getMaxUserId() + 1;
        String encrytedPassword = this.passwordEncoder.encode(form.getPassword());
 
        AppUser user = new AppUser(userId, form.getUserName(), //
                false, //
                form.getEmail(), //
                encrytedPassword);
 
        USERS_MAP.put(userId, user);
        return user;
    }
 
}