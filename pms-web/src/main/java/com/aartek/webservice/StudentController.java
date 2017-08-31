package com.aartek.webservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.aartek.model.ProjectDto;
import com.aartek.model.RegistrationDto;
import com.aartek.repository.ProjectRepository;

@Controller
public class StudentController {

	@Autowired
	private ProjectRepository projectRepository;

	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public @ResponseBody List<ProjectDto>  show(ModelMap map) {
		System.out.println("Web serive method");
		//map.addAttribute("ProjectDto", new ProjectDto());
		List<ProjectDto> list = projectRepository.getProjectList();
		//map.addAttribute("projectList", list);

		return list;
	}

	/*@RequestMapping(value = "/projects", method = RequestMethod.GET)
	public @ResponseBody ModelAndView showModel(ModelMap map) {
		System.out.println("inside student controller");
		//map.addAttribute("ProjectDto", new ProjectDto());
		List<ProjectDto> list = projectRepository.getProjectList();
		//map.addAttribute("projectList", list);
		return new ModelAndView("showProject", "projects", list);
	}*/
	
	@RequestMapping(value="/saveProject",method=RequestMethod.POST)
	public @ResponseBody ProjectDto saveProject(@RequestBody ProjectDto project) {
		System.out.println("inside web save");
		//projectRepository.saveProject(project);
		return projectRepository.saveProject(project);
	}
}
