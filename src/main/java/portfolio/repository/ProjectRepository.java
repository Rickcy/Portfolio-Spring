package portfolio.repository;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;
import portfolio.model.Project;


public interface ProjectRepository extends JpaRepository<Project,Long> {
    @Query("select p from Project p where p.projectName = :projectName")
    Project findByName(@Param("projectName") String projectName);

}
