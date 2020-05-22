package com.lsonetwork.controllers;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lsonetwork.models.Address;
import com.lsonetwork.services.AddressService;

@RestController
@RequestMapping("/address")
@CrossOrigin
public class AddressController {
	
	private AddressService addressService;
	
	@Autowired
	public void setAddressService(AddressService addressService) {
		this.addressService = addressService;
	}
	
	@GetMapping
	public ResponseEntity<List<Address>> getAddressess(){
		List<Address> addresses = addressService.getAddresses();
		if(addresses.isEmpty()) {
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.ok(addresses);
	}
	
	@PostMapping
	public ResponseEntity<Address> addAddress(@RequestBody Address address){
		Optional<Address> foundAddress = addressService.getAddressbyId(address.getAddressId());
		if(foundAddress.isPresent()) {
			return ResponseEntity.status(HttpStatus.CONFLICT).build();
		}
		Address newAddress = addressService.addAddress(address);
		return ResponseEntity.ok(newAddress);
	}
}
