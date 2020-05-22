package com.lsonetwork.repositories;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.lsonetwork.models.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer>{

}