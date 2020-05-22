package com.lsonetwork.services;

import java.util.List;
import java.util.Optional;

import com.lsonetwork.models.User;

public interface UserService {

	List<User> getUsers();
	
	Optional<User> getUserById(int id);
	
	User addUser(User user);
	
	User updateUser(User user);
	
	void deleteUserById(int id);
}
