package com.lsonetwork.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lsonetwork.models.StudyAbroadLocation;

@Repository
public interface StudyAbroadLocationRepository extends JpaRepository<StudyAbroadLocation, Integer>{

}
