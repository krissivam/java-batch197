package com.axis.batch197.service;

import com.axis.batch197.model.XAddressBookModel;

public interface UserService {

	public void savePengguna(XAddressBookModel pengguna);
	
	public boolean isUserAlreadyPresent(XAddressBookModel pengguna);
}