package com.lsonetwork.serviceimplementations;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lsonetwork.models.Project;
import com.lsonetwork.repositories.ProjectRepository;
import com.lsonetwork.services.ProjectService;

@Service
public class ProjectServiceImpl implements ProjectService {
	private ProjectRepository repository;
	
	@Autowired
	public void setRepository(ProjectRepository repository) {
		this.repository = repository;
	}

	@Override
	public List<Project> getProjects() {
		return this.repository.findAll();
	}

	@Override
	public Optional<Project> getProjectById(int id) {
		return this.repository.findById(id);
	}

	@Override
	public Project addProject(Project project) {
		return this.repository.save(project);
	}

	@Override
	public Project updateProject(Project project) {
		return this.repository.save(project);
	}

	@Override
	public void deleteProjectById(int id) {
		this.repository.deleteById(id);
	}

}
