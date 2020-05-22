package com.lsonetwork.serviceimplementations;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lsonetwork.models.User;
import com.lsonetwork.repositories.UserRepository;
import com.lsonetwork.services.UserService;

@Service
public class UserServiceImpl implements UserService {
	private UserRepository repository;
	
	@Autowired
	public void setRepository(UserRepository repository) {
		this.repository = repository;
	}

	@Override
	public List<User> getUsers() {
		return this.repository.findAll();
	}

	@Override
	public Optional<User> getUserById(int id) {
		return this.repository.findById(id);
	}

	@Override
	public User addUser(User user) {
		return this.repository.save(user);
	}

	@Override
	public User updateUser(User user) {
		return this.repository.save(user);
	}

	@Override
	public void deleteUserById(int id) {
		this.repository.deleteById(id);
	}
}
