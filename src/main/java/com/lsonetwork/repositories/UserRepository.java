package com.lsonetwork.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.lsonetwork.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	
	@Query("select u from User u where u.userName = ?1")
	public List<User> findByUsername(String username);

}
