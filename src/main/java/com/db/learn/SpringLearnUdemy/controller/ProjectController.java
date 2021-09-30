package com.db.learn.SpringLearnUdemy.controller;

import com.db.learn.SpringLearnUdemy.entities.Project;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/projects")
public class ProjectController {

    @RequestMapping ("/new")
    public String displayProjectForm(Model model){
        Project aProject =new Project();
        model.addAttribute("project", aProject);
        return "new-project";
    }

}
