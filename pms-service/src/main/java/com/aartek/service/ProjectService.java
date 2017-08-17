package com.aartek.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aartek.model.ProjectDto;
import com.aartek.repository.ProjectRepository;

@Service
public class ProjectService {

	@Autowired
	private ProjectRepository projectRepository;

	public ProjectDto saveProject(ProjectDto project) {

		if (project != null) {
			projectRepository.saveProject(project);
			return project;
		} else {
			return null;
		}
	}

	public List<ProjectDto> projectList() {
		List<ProjectDto> list = projectRepository.getProjectList();
		return list;
	}

	public void deleteProject(Integer pId) {
		projectRepository.deleteProject(pId);
	}

	public void updateProject(ProjectDto projectDto) {
		System.out.println("inside update service");
		projectRepository.updateProject(projectDto);
		//return id;
	}
}
