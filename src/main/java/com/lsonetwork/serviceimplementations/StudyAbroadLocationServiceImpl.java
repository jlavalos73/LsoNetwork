package com.lsonetwork.serviceimplementations;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lsonetwork.models.StudyAbroadLocation;
import com.lsonetwork.repositories.StudyAbroadLocationRepository;
import com.lsonetwork.services.StudyAbroadLocationService;

@Service
public class StudyAbroadLocationServiceImpl implements StudyAbroadLocationService {
	private StudyAbroadLocationRepository repository;
	
	@Autowired
	public void setRepository(StudyAbroadLocationRepository repository) {
		this.repository = repository;
	}

	@Override
	public List<StudyAbroadLocation> getStudyAbroadLocations() {
		return this.repository.findAll();
	}

	@Override
	public Optional<StudyAbroadLocation> getStudyAbroadLocationById(int id) {
		return this.repository.findById(id);
	}

	@Override
	public StudyAbroadLocation addStudyAbroadLocation(StudyAbroadLocation location) {
		return this.repository.save(location);
	}

	@Override
	public StudyAbroadLocation updateStudyAbroadLocation(StudyAbroadLocation location) {
		return this.repository.save(location);
	}

	@Override
	public void deleteStudyAbroadLocationById(int id) {
		this.repository.deleteById(id);
	}

}
