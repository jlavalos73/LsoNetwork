package com.lsonetwork.serviceimplementations;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lsonetwork.models.Minor;
import com.lsonetwork.repositories.MinorRepository;
import com.lsonetwork.services.MinorService;

@Service
public class MinorServiceImpl implements MinorService {
	private MinorRepository repository;
	
	@Autowired
	public void setRepository(MinorRepository repository) {
		this.repository = repository;
	}

	@Override
	public List<Minor> getMinors() {
		return this.repository.findAll();
	}

	@Override
	public Optional<Minor> getMinorbyId(int id) {
		return this.repository.findById(id);
	}

	@Override
	public Minor addMinor(Minor minor) {
		return this.repository.save(minor);
	}

	@Override
	public Minor updateMinor(Minor minor) {
		return this.repository.save(minor);
	}

	@Override
	public void deleteMinorById(int id) {
		this.repository.deleteById(id);
	}

}
