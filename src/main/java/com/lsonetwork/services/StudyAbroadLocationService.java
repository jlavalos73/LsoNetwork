package com.lsonetwork.services;

import java.util.List;
import java.util.Optional;

import com.lsonetwork.models.StudyAbroadLocation;

public interface StudyAbroadLocationService {

	List<StudyAbroadLocation> getStudyAbroadLocations();
	
	Optional<StudyAbroadLocation> getStudyAbroadLocationById(int id);
	
	StudyAbroadLocation addStudyAbroadLocation(StudyAbroadLocation location);
	
	StudyAbroadLocation updateStudyAbroadLocation(StudyAbroadLocation location);
	
	void deleteStudyAbroadLocationById(int id);
}
