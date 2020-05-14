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
@Table(name = "minors")
@Data @NoArgsConstructor
public class Minor implements Serializable{
	private static final long serialVersionUID = -6925214774182118730L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "minor_id")
	private int minorId;
	
	private String name;
	
	private String divison;
	
	private boolean activeMinor;
}
