package portfolio.model;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "projects")
public class Project implements Serializable{


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "projectName",nullable = false)
    private String projectName;

    @Column(name = "enable",nullable = false)
    private Boolean showMain;

    @Column(name = "language",nullable = false)
    private String language;

    @Column(name = "content",nullable = true)
    private String content;

    @Column(name = "path_url",nullable = true)
    private String pathUrl;

    public Project(String projectName, Boolean showMain, String language, String content, String pathUrl) {
        this.projectName = projectName;
        this.showMain = showMain;
        this.language = language;
        this.content = content;
        this.pathUrl = pathUrl;
    }

    public Project() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Boolean getShowMain() {
        return showMain;
    }

    public void setShowMain(Boolean showMain) {
        this.showMain = showMain;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPathUrl() {
        return pathUrl;
    }

    public void setPathUrl(String pathUrl) {
        this.pathUrl = pathUrl;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", projectName='" + projectName + '\'' +
                ", showMain=" + showMain +
                ", language='" + language + '\'' +
                ", content='" + content + '\'' +
                ", pathUrl='" + pathUrl + '\'' +
                '}';
    }
}
