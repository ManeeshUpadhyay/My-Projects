package com.aartek.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aartek.model.ProjectDto;
import com.aartek.repository.ProjectRepository;
import com.aartek.service.ProjectService;
import com.aartek.validator.ProjectValidator;

@Controller
public class ProjectController {
	
	@Autowired
	private ProjectService projectService;
	@Autowired
	private ProjectValidator projectValidator;
	@Autowired
	private ProjectRepository projectRepository;

	@RequestMapping(value = "/showProject", method = RequestMethod.GET)
	public String showProject(Map<String, Object> map) {
		System.out.println("Inside project controller");
		map.put("ProjectDto", new ProjectDto());
		List<ProjectDto> projectList = projectService.projectList();
		map.put("projectList", projectList);

		return "showProject";
	}

	@RequestMapping(value = "/project", method = RequestMethod.POST)
	public String saveProject(@ModelAttribute("ProjectDto") ProjectDto project, BindingResult result, ModelMap map) {
		List<ProjectDto> projectList = projectService.projectList();
		map.addAttribute("projectList", projectList);
		projectValidator.validate(project, result);
		if (result.hasErrors()) {

			return "redirect:/showProject.do";
		} else {

			projectService.saveProject(project);

			return "redirect:/showProject.do";
		}
	}

	@RequestMapping(value = "/deleteProject", method = RequestMethod.GET)
	public String deleteProject(@ModelAttribute("ProjectDto") ProjectDto project, HttpServletRequest request) {
		int projectId = Integer.parseInt(request.getParameter("id"));
		projectService.deleteProject(projectId);
		return "redirect:/showProject.do";
	}

	@RequestMapping(value = "/updateProject", method = RequestMethod.GET)
	public String updateProject(@ModelAttribute("ProjectDto") ProjectDto project, HttpServletRequest request,
			ModelMap map) {
		System.out.println("inside controller update");
		List<ProjectDto> list = projectRepository.getProject(project);
		map.addAttribute("project", new ProjectDto());		
		map.addAttribute("projectList", list);
		

		return "editProject";
	}

	@RequestMapping(value = "/saveUpdate", method = RequestMethod.POST)
	public String getShow(@ModelAttribute("project") ProjectDto project, HttpServletRequest request) {
		int id = Integer.parseInt(request.getParameter("cid"));
		project.setId(id);
		projectService.updateProject(project);
		return "redirect:/showProject.do";
	}

	
}
