package com.xsis.batch197.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.xsis.batch197.model.XAddressBookModel;
import com.xsis.batch197.model.XRoleModel;
import com.xsis.batch197.repository.XAddressBookRepo;
import com.xsis.batch197.repository.XRoleRepo;


@Service
public class UserServiceImp implements UserService {
	
	@Autowired
	BCryptPasswordEncoder encoder;
	@Autowired
	XRoleRepo roleRepository;
	@Autowired
	XAddressBookRepo userRepository;

	@Override
	public void saveUser(XAddressBookModel user) {
		user.setAbpwd(encoder.encode(user.getAbpwd()));
		XRoleModel userRole = roleRepository.findByName("SITE_USER");
		user.setRoles(new HashSet<XRoleModel>(Arrays.asList(userRole)));
		userRepository.save(user);
	}

	@Override
	public boolean isUserAlreadyPresent(XAddressBookModel user) {
		boolean isUserAlreadyExists = false;
		XAddressBookModel existingUser = userRepository.findByEmail(user.getEmail());
		// If user is found in database, then then user already exists.
		if(existingUser != null){
			isUserAlreadyExists = true; 
		}
		return isUserAlreadyExists;
	}

}

