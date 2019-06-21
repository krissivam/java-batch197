package com.xsis.batch197.service;

import com.xsis.batch197.model.XAddressBookModel;

public interface UserService {

	public void saveUser(XAddressBookModel user);
	
	public boolean isUserAlreadyPresent(XAddressBookModel user);
}
