package com.axis.batch197.service;

import com.axis.batch197.model.User;

public interface UserService {

	public void saveUser(User user);
	
	public boolean isUserAlreadyPresent(User user);
}
