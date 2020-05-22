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
@Table(name = "study_abroad_location")
@Data @NoArgsConstructor @AllArgsConstructor
public class StudyAbroadLocation implements Serializable{
	private static final long serialVersionUID = 1243488088575238567L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "abroad_id")
	private int abroadId;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "country")
	private String country;
	
	@Column(name = "university")
	private String university;
}
