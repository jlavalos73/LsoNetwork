package com.lsonetwork.services;

import java.util.List;
import java.util.Optional;

import com.lsonetwork.models.StudyAwayLocation;

public interface StudyAwayLocationService {

	List<StudyAwayLocation> getStudyAwayLocations();
	
	Optional<StudyAwayLocation> getStudyAwayLocationById(int id);
	
	StudyAwayLocation addStudyAwayLocation(StudyAwayLocation location);
	
	StudyAwayLocation updateStudyAwayLocation(StudyAwayLocation location);
	
	void delteStudyAwayLocationById(int id);
}
