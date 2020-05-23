package com.lsonetwork.models;

import java.util.Date;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserDTO {
	private int userId;
	
	@NotBlank(message="Username cannot be blank.")
	@Size(min=3,max=12, message="Number of characters must be between 3 and 12.")
	@Pattern(regexp="[a-zA-Z0-9]+", message="Username may only have letters and numbers.")
	private String userName;

	@NotBlank(message="First name cannot be blank.")
	@Size(max=30, message= "Number of characters cannot be larger than 30.")
	@Pattern(regexp="^[a-zA-Z\\u00C0-\\u017F]+[- ]?[a-zA-Z\\u00C0-\\u017F]+$", message="First name format is incorrect")
	private String firstName;

	@NotBlank(message="Last name cannot be blank.")
	@Size(max=30, message="Number of characters cannot be larger than 30.")
	@Pattern(regexp="^[a-zA-Z\\u00C0-\\u017F]+[- ]?[a-zA-Z\\u00C0-\\u017F]+$", message="Last name format is incorrect")
	private String lastName;

	@NotBlank(message="Email cannot be blank.")
	@Email(message="Email format is incorrect.")
	private String email;
	
	@NotBlank(message="Password cannot be blank.")
	@Size(min=8, message="Password must be at least 8 characters long.")
	private String password;

	@NotBlank(message="Phone number cannot be blank.")
	@Pattern(regexp = "^\\d{3}-\\d{3}-\\d{4}$", message="Phone number format is incorrect.")
	private String phoneNumber;
	
	@Valid
	private AddressDTO address;

	private List<Major> majors;

	private List<Minor> minors;
	
	private List<Concentration> concentrations;
	
	private StudyAbroadLocation abroadLocation;
	
	private StudyAwayLocation awayLocation;
	
	private UserType userType;
	
	private String jobTitle;
	
	private PermissionLevel permissionLevel;
	
	private Date graduationDate;
	
	private LSORole lsoRole;
	

	public UserDTO(User user) {
		super();
		if (user != null) {
			this.userId = user.getUserId();
			this.userName = user.getUserName();
			this.firstName = user.getFirstName();
			this.lastName = user.getLastName();
			this.email = user.getEmail();
			this.phoneNumber = user.getPhoneNumber();
			this.address = new AddressDTO(user.getAddress());
			this.majors = user.getMajors();
			this.minors = user.getMinors();
			this.concentrations = user.getConcentrations();
			this.abroadLocation = user.getAbroadLocation();
			this.awayLocation = user.getAwayLocation();
			this.userType = user.getUserType();
			this.jobTitle = user.getJobTitle();
			this.permissionLevel = user.getPermissionLevel();
			this.graduationDate = user.getGraduationDate();
			this.lsoRole = user.getLsoRole();
		}
	}
}
