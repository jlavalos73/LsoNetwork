package com.lsonetwork.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Entity
@Table(name = "address")
@Data @NoArgsConstructor @AllArgsConstructor
public class Address implements Serializable{
	private static final long serialVersionUID = -3912307400122003822L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "address_id")
	private int addressId;
	
	private String street;
	private String unit;
	private String city;
	private String state;
	private String zip;
	
	public Address(AddressDTO addressDTO) {
		super();
		if (addressDTO != null) {
			this.addressId = addressDTO.getId();
			this.street = addressDTO.getStreet();
			this.unit = addressDTO.getUnit();
			this.city = addressDTO.getCity();
			this.state = addressDTO.getState();
			this.zip = addressDTO.getZip();
		}
	}
}
