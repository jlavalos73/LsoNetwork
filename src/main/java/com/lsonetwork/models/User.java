package com.lsonetwork.models;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Entity
@Table(name = "users")
@Data @NoArgsConstructor @AllArgsConstructor
public class User implements Serializable{
	private static final long serialVersionUID = 4172900979887952332L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "user_id")
	private int userId;
	
	@Column(name = "user_name")
	private String userName;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "phone_number")
	private String phoneNumber;
	
	@OneToOne(cascade = CascadeType.ALL)
	@LazyCollection(LazyCollectionOption.FALSE)
	@JoinColumn(name = "address")
	private Address address;	
	
	@ManyToMany
	@JoinTable(name = "user_majors", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "user_major_id"))
	private List<Major> majors;
	
	@ManyToMany
	@JoinTable(name = "user_minors", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "user_minor_id"))
	private List<Minor> minors;
	
	@ManyToMany
	@JoinTable(name = "user_concentrations", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "user_concentration_id"))
	private List<Concentration> concentrations;
	
	@ManyToOne
	@JoinColumn(name = "abroad_id")
	private StudyAbroadLocation abroadLocation;
	
	@ManyToOne
	@JoinColumn(name = "away_id")
	private StudyAwayLocation awayLocation;
	
	@Column(name = "user_type")
	private UserType userType;
	
	@Column(name = "job_title")
	private String jobTitle;
	
	@Column(name = "permission_level")
	private PermissionLevel permissionLevel;
	
	@Column(name = "graduation_date")
	private Date graduationDate;
	
	@Column(name = "lso_role")
	private LSORole lsoRole;
	
	public User(UserDTO userDTO) {
		super();
		if (userDTO != null) {
			this.userId = userDTO.getUserId();
			this.userName = userDTO.getUserName();
			this.firstName = userDTO.getFirstName();
			this.lastName = userDTO.getLastName();
			this.email = userDTO.getEmail();
			this.phoneNumber = userDTO.getPhoneNumber();
			this.address = new Address(userDTO.getAddress());
			this.majors = userDTO.getMajors();
			this.minors = userDTO.getMinors();
			this.concentrations = userDTO.getConcentrations();
			this.abroadLocation = userDTO.getAbroadLocation();
			this.awayLocation = userDTO.getAwayLocation();
			this.userType = userDTO.getUserType();
			this.jobTitle = userDTO.getJobTitle();
			this.permissionLevel = userDTO.getPermissionLevel();
			this.graduationDate = userDTO.getGraduationDate();
			this.lsoRole = userDTO.getLsoRole();
		}
	}
	
}


