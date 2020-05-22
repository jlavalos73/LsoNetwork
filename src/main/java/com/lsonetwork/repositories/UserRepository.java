package com.lsonetwork.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lsonetwork.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
