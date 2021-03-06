package com.lsonetwork.models;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AddressDTO {
	private int id;
	
	@Pattern(regexp = "[a-zA-Z0-9 ,]+", message = "Addresses may only contain letters, numbers, spaces, and commas")
	@NotBlank(message = "Street cannot be blank.")
	private String street;
	
	@Pattern(regexp = "[a-zA-Z0-9 ]*", message = "Units may only contain letters, numbers, and spaces")
	private String unit;

	@Pattern(regexp = "[a-zA-Z]+([ -][a-zA-Z]+)*", message = "Cities must be words made from letters separated by a single space or -.")
	@NotBlank(message = "City cannot be blank.")
	private String city;

	@Pattern(regexp = "[A-Z]+", message = "State abbreviations must be capitol letters")
	@Size(min = 2, max = 2, message = "State abbreviations must be 2 letters")
	@NotBlank(message = "State cannot be blank.")
	private String state;

	@Pattern(regexp = "[0-9]*", message = "Zipcodes can only contain numbers")
	@Size(min = 5, max = 5, message = "Zipcodes must be 5 digits")
	@NotBlank(message = "Zipcode cannot be blank.")
	private String zip;
	
	public AddressDTO(Address address) {
		super();
		if (address != null) {
			this.id = address.getAddressId();
			this.street = address.getStreet();
			this.unit = address.getUnit();
			this.city = address.getCity();
			this.state = address.getState();
			this.zip = address.getZip();
		}
	}
}
