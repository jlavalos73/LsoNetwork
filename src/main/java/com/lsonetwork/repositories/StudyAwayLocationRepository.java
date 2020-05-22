package com.lsonetwork.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lsonetwork.models.StudyAwayLocation;

@Repository
public interface StudyAwayLocationRepository extends JpaRepository<StudyAwayLocation, Integer>{

}
