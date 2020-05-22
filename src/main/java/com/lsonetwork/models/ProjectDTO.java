package com.lsonetwork.models;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ProjectDTO {
	private int projectId;
	
	private UserDTO user;
	
	private String projectName;
	
	private String projectDescription;
	
	private ProjectType projectType;
	
	public ProjectDTO(Project project) {
		super();
		if(project != null) {
			this.projectId = project.getProjectId();
			this.user = new UserDTO(project.getUser());
			this.projectName = project.getProjectName();
			this.projectDescription = project.getProjectDescription();
			this.projectType = project.getProjectType();
		}
	}
}
