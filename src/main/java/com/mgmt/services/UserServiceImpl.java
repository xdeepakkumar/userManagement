package com.mgmt.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mgmt.dtc.User;
import com.mgmt.repo.UserRepo;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepo userRepo;

	@Override
	public List<User> getAllUser() {
		return userRepo.getAllUsers();
	}

	@Override
	public User getUser(Long id) {
		return userRepo.getUser(id);
	}

	@Override
	public void addUser(User user) {
		userRepo.addUser(user);		
	}

	@Override
	public User updateUser(User user) {
		return userRepo.updateUser(user);
	}

	@Override
	public User deleteUser(Long id) {
		return userRepo.deleteUser(id);
	}

}
