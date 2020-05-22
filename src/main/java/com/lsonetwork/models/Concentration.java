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
@Table(name = "concentrations")
@Data @NoArgsConstructor @AllArgsConstructor
public class Concentration implements Serializable{
	private static final long serialVersionUID = 2998194568118782530L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "concentration_id")
	private int concentrationId;
	
	private String name;
	
	private String division;
	
	private boolean activeConcentration;

}
