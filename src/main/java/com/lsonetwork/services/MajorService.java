package com.lsonetwork.services;

import java.util.List;
import java.util.Optional;

import com.lsonetwork.models.Major;

public interface MajorService {

	List<Major> getMajors();
		
	Major addMajor(Major major);
	
	Optional<Major> getMajorById(int id);
	
	Major updateMajor(Major major);
	
	void deleteMajorById(int id);
}
