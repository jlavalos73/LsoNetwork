package com.lsonetwork.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lsonetwork.models.Major;

@Repository
public interface MajorRepository extends JpaRepository<Major, Integer>{

}
