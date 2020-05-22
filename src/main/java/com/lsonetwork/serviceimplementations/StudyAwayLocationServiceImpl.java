package com.lsonetwork.serviceimplementations;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lsonetwork.models.StudyAwayLocation;
import com.lsonetwork.repositories.StudyAwayLocationRepository;
import com.lsonetwork.services.StudyAwayLocationService;

@Service
public class StudyAwayLocationServiceImpl implements StudyAwayLocationService {
	private StudyAwayLocationRepository repository;
	
	@Autowired
	public void setRepository(StudyAwayLocationRepository repository) {
		this.repository = repository;
	}

	@Override
	public List<StudyAwayLocation> getStudyAwayLocations() {
		return this.repository.findAll();
	}

	@Override
	public Optional<StudyAwayLocation> getStudyAwayLocationById(int id) {
		return this.repository.findById(id);
	}

	@Override
	public StudyAwayLocation addStudyAwayLocation(StudyAwayLocation location) {
		return this.repository.save(location);
	}

	@Override
	public StudyAwayLocation updateStudyAwayLocation(StudyAwayLocation location) {
		return this.repository.save(location);
	}

	@Override
	public void delteStudyAwayLocationById(int id) {
		this.repository.deleteById(id);
	}
}
