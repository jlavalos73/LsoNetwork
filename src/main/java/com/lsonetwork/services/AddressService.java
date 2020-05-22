package com.lsonetwork.services;

import java.util.List;
import java.util.Optional;

import com.lsonetwork.models.Address;

public interface AddressService {
	
	List<Address> getAddresses();
	
	Optional<Address> getAddressbyId(int id);
	
	Address addAddress(Address address);
	
	Address updateAddress(Address address);
	
	 void deleteAddressById(int id);
}
