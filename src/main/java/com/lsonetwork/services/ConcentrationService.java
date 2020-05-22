package com.lsonetwork.services;

import java.util.List;
import java.util.Optional;

import com.lsonetwork.models.Concentration;

public interface ConcentrationService {

	List<Concentration> getConcentrations();
	
	Optional<Concentration> getConcentrationById(int id);
		
	Concentration addConcentration(Concentration concentration);
	
	Concentration updateConcentration(Concentration concentration);
	
	void deleteConcentrationById(int id);
}
