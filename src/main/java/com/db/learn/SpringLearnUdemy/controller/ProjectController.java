package com.db.learn.SpringLearnUdemy.controller;

import com.db.learn.SpringLearnUdemy.entities.Project;
import com.db.learn.SpringLearnUdemy.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/projects")
public class ProjectController {

    @Autowired
    ProjectRepository proRepo;

    @RequestMapping ("/new")
    public String displayProjectForm(Model model){
        Project aProject =new Project();
        model.addAttribute("project", aProject);
        return "new-project";
    }

    @PostMapping("/save")
    public String createProjectForm(Project project,Model model){
       proRepo.save(project);
       //use redirect to prevent duplicates submissions
        return "redirect:/projects/new";
    }

}
