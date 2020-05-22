package com.lsonetwork.services;

import java.util.List;
import java.util.Optional;

import com.lsonetwork.models.Project;

public interface ProjectService {

	List<Project> getProjects();
	
	Optional<Project> getProjectById(int id);
	
	Project addProject(Project project);
	
	Project updateProject(Project project);
	
	void deleteProjectById(int id);
}
