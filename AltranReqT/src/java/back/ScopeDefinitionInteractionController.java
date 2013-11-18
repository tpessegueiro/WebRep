package back;

import db.ScopeDefinitionInteraction;
import session.ScopeDefinitionInteractionFacade;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.inject.Inject;
import javax.enterprise.context.SessionScoped;

@Named(value = "scopeDefinitionInteractionController")
@SessionScoped
public class ScopeDefinitionInteractionController extends AbstractController<ScopeDefinitionInteraction> implements Serializable {

    @Inject
    private ScopeDefinitionInteractionFacade ejbFacade;

    public ScopeDefinitionInteractionController() {
        super(ScopeDefinitionInteraction.class);
    }

    @PostConstruct
    public void init() {
        super.setFacade(ejbFacade);
    }

}
