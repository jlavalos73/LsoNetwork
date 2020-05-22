package com.lsonetwork.serviceimplementations;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lsonetwork.models.Major;
import com.lsonetwork.repositories.MajorRepository;
import com.lsonetwork.services.MajorService;

@Service
public class MajorServiceImpl implements MajorService {
	private MajorRepository repository;
	
	@Autowired
	public void setRepository(MajorRepository repository) {
		this.repository = repository;
	}

	@Override
	public List<Major> getMajors() {
		return this.repository.findAll();
	}

	@Override
	public Major addMajor(Major major) {
		return this.repository.save(major);
	}

	@Override
	public Optional<Major> getMajorById(int id) {
		return this.repository.findById(id);
	}

	@Override
	public Major updateMajor(Major major) {
		return this.repository.save(major);
	}

	@Override
	public void deleteMajorById(int id) {
		this.repository.deleteById(id);
		
	}
	
	

}
