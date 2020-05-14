package com.lsonetwork.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Entity
@Table(name = "majors")
@NoArgsConstructor @Data
public class Major implements Serializable{
	private static final long serialVersionUID = -8278082149094865927L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "major_id")
	private int majorId;
	
	private String name;
	
	private String division;
	
	private boolean activeMajor;
}
