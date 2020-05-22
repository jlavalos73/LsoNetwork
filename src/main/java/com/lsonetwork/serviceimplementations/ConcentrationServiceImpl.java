package com.lsonetwork.serviceimplementations;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lsonetwork.models.Concentration;
import com.lsonetwork.repositories.ConcentrationRepository;
import com.lsonetwork.services.ConcentrationService;

@Service
public class ConcentrationServiceImpl implements ConcentrationService {
	private ConcentrationRepository repository;
	
	@Autowired
	public void setRepository(ConcentrationRepository repository) {
		this.repository = repository;
	}

	@Override
	public List<Concentration> getConcentrations() {
		return this.repository.findAll();
	}

	@Override
	public Optional<Concentration> getConcentrationById(int id) {
		return this.repository.findById(id);
	}

	@Override
	public Concentration addConcentration(Concentration concentration) {
		return this.repository.save(concentration);
	}

	@Override
	public Concentration updateConcentration(Concentration concentration) {
		return this.repository.save(concentration);
	}

	@Override
	public void deleteConcentrationById(int id) {
		this.repository.deleteById(id);
		
	}
}
