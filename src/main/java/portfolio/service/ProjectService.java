package portfolio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;
import portfolio.model.Project;
import portfolio.repository.ProjectRepository;
import portfolio.service.interfaces.IProjectService;

import java.util.List;

@Service
public class ProjectService implements IProjectService {

    @Autowired
    ProjectRepository projectRepository;


    public Project addProject(Project project) {
        Project saveProject = projectRepository.saveAndFlush(project);
        return saveProject;
    }

    public void delete(long id) {
        projectRepository.delete(id);
    }

    public Project getByName(String name) {
        return projectRepository.findByName(name);
    }

    public Project editProject(Project project) {
        return projectRepository.saveAndFlush(project);
    }

    public List<Project> getAll() {
        return projectRepository.findAll();
    }
}
