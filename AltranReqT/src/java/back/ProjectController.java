package back;

import db.Project;
import session.ProjectFacade;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.inject.Inject;
import javax.enterprise.context.SessionScoped;

@Named(value = "projectController")
@SessionScoped
public class ProjectController extends AbstractController<Project> implements Serializable {

    @Inject
    private ProjectFacade ejbFacade;

    public ProjectController() {
        super(Project.class);
    }

    @PostConstruct
    public void init() {
        super.setFacade(ejbFacade);
    }

}
