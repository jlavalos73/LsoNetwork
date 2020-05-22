package com.lsonetwork.services;

import java.util.List;
import java.util.Optional;

import com.lsonetwork.models.Minor;

public interface MinorService {

	List<Minor> getMinors();
	
	Optional<Minor> getMinorbyId(int id);
	
	Minor addMinor(Minor minor);
	
	Minor updateMinor(Minor minor);
	
	void deleteMinorById(int id);
}
