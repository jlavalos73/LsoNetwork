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
@Table(name = "study_away_location")
@Data @NoArgsConstructor @AllArgsConstructor
public class StudyAwayLocation implements Serializable{
	private static final long serialVersionUID = 7496428392681841028L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "away_id")
	private int awayId;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "country")
	private String country;
	
	@Column(name = "program")
	private String program;

}
