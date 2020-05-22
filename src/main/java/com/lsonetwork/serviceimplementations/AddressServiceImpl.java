package com.lsonetwork.serviceimplementations;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lsonetwork.models.Address;
import com.lsonetwork.repositories.AddressRepository;
import com.lsonetwork.services.AddressService;

@Service
public class AddressServiceImpl implements AddressService {

	private AddressRepository repository;
	
	@Autowired
	public void setRepository(AddressRepository repository) {
		this.repository = repository;
	}

	@Override
	public List<Address> getAddresses() {
		return this.repository.findAll();
	}

	@Override
	public Address addAddress(Address address) {
		return this.repository.save(address);
	}

	@Override
	public Optional<Address> getAddressbyId(int id) {
		return this.repository.findById(id);
	}

	@Override
	public Address updateAddress(Address address) {
		return this.repository.save(address);
	}

	@Override
	public void deleteAddressById(int id) {
		this.repository.deleteById(id);
		
	}
	
	
}
