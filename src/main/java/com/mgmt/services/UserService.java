package com.mgmt.services;

import java.util.List;

import com.mgmt.dtc.User;

public interface UserService {
	
	List<User> getAllUser();

	User getUser(Long id);

	void addUser(User user);

	User updateUser(User user);

	User deleteUser(Long id);
}
