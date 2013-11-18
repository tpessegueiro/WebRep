package back;

import db.NonFunctionalRequirement;
import session.NonFunctionalRequirementFacade;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.inject.Inject;
import javax.enterprise.context.SessionScoped;

@Named(value = "nonFunctionalRequirementController")
@SessionScoped
public class NonFunctionalRequirementController extends AbstractController<NonFunctionalRequirement> implements Serializable {

    @Inject
    private NonFunctionalRequirementFacade ejbFacade;

    public NonFunctionalRequirementController() {
        super(NonFunctionalRequirement.class);
    }

    @PostConstruct
    public void init() {
        super.setFacade(ejbFacade);
    }

}
