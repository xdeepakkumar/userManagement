package com.mgmt.repo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.mgmt.dtc.User;

@Repository
public class UserRepo {

	List<User> userList = new ArrayList<>();
	
		
	public List<User> getAllUsers() {
		return userList;
	}

	public User getUser(Long id) {
		Optional<User> first =  userList.stream()
				.filter(u -> u.getId().equals(id)).findFirst();
		if(first.isPresent()) {
			return first.get();
		}else {
			return new User();
		}
	}



	public void addUser(User user) {
		userList.add(user);	
	}

	public User updateUser(User user) {
		for(User u : userList) {
			if(u.getId().equals(user.getId())) {
				u.setName(u.getName());
				u.setAddress(u.getAddress());
				return u;
			}
		}
		return new User();
	}

	public User deleteUser(Long id) {
		Optional<User> first =  userList.stream()
				.filter(u -> u.getId().equals(id)).findFirst();
		if(first.isPresent()) {
			User user = first.get();
			userList.remove(user);
			return user;
		}else {
			return new User();
		}
	}

}
