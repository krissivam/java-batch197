package com.axis.batch197.service;

import java.util.Arrays;
import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.axis.batch197.model.XAddressBookModel;
import com.axis.batch197.model.XRoleModel;
import com.axis.batch197.repository.XAddressBookRepo;
import com.axis.batch197.repository.XRoleRepo;

@Service
public class UserServiceImp implements UserService {
	
	@Autowired
	BCryptPasswordEncoder encoder;
	
	@Autowired
	XRoleRepo roleRepository;
	
	@Autowired
	XAddressBookRepo penggunaRepository;

	@Override
	public void savePengguna(XAddressBookModel pengguna) {
		// TODO Auto-generated method stub
		pengguna.setAbpwd(encoder.encode(pengguna.getAbpwd()));
		XRoleModel penggunaRole = roleRepository.findByName("ADMINISTRATOR");
		pengguna.setRoles(new HashSet<XRoleModel>(Arrays.asList(penggunaRole)));
		penggunaRepository.save(pengguna);
	}

	@Override
	public boolean isUserAlreadyPresent(XAddressBookModel pengguna) {
		boolean isUserAlreadyExists = false;
		XAddressBookModel existingUser = penggunaRepository.findByEmail(pengguna.getEmail());
		// If user is found in database, then then user already exists.
		if(existingUser != null){
			isUserAlreadyExists = true; 
		}
		return isUserAlreadyExists;
	}

}
