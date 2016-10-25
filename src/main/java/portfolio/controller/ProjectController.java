package portfolio.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import portfolio.model.Project;
import portfolio.service.ProjectService;

@Controller
public class ProjectController {
    @Autowired
    ProjectService projectService;

    @RequestMapping(value = "/createProject",method = RequestMethod.GET)
    public String createProject(Model model){
        model.addAttribute("newProject", new Project());
        return "createProject";
    }

    @RequestMapping(value = "/createProject",method = RequestMethod.POST)
    public String createProject(@ModelAttribute("newProject") Project newProject, BindingResult bindingResult, Model model){
        projectService.addProject(newProject);

        return "redirect:/admin";
    }
}
