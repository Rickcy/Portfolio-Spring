package portfolio.service.interfaces;

import org.springframework.stereotype.Service;
import portfolio.model.Project;

import java.util.List;


public interface IProjectService {


    Project addProject(Project project);
    void delete(long id);
    Project editProject(Project project);
    List<Project> getAll();

}
