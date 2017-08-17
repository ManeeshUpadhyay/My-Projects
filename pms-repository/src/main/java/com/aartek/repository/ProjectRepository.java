package com.aartek.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.aartek.model.ProjectDto;

@Repository
public class ProjectRepository {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	public ProjectDto saveProject(ProjectDto project) {
		if (project != null) {
			hibernateTemplate.saveOrUpdate(project);
			return project;
		} else {
			return null;
		}

	}

	@SuppressWarnings("unchecked")
	public List<ProjectDto> getProjectList() {
		List<ProjectDto> projectList = hibernateTemplate.find("from ProjectDto");
		return projectList;
	}

	public void deleteProject(Integer pId) {

		System.out.println(pId);
		hibernateTemplate.delete(hibernateTemplate.get(ProjectDto.class, pId));
		System.out.println("delete repositry method");
	}

	public void updateProject(ProjectDto projectDto) {
		System.out.println("update method of repo");
		hibernateTemplate.update(projectDto);

	}

	@SuppressWarnings("unchecked")
	public List<ProjectDto> getProject(ProjectDto projectDto) {
		List<ProjectDto> list = hibernateTemplate.find("from ProjectDto where id=?", projectDto.getId());
		return list;
	}
}
