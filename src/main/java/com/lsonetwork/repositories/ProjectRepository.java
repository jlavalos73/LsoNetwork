package com.lsonetwork.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lsonetwork.models.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Integer>{

}
