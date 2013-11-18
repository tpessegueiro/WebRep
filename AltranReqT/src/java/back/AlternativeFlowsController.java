package back;

import db.AlternativeFlows;
import session.AlternativeFlowsFacade;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.inject.Inject;
import javax.enterprise.context.SessionScoped;

@Named(value = "alternativeFlowsController")
@SessionScoped
public class AlternativeFlowsController extends AbstractController<AlternativeFlows> implements Serializable {

    @Inject
    private AlternativeFlowsFacade ejbFacade;

    public AlternativeFlowsController() {
        super(AlternativeFlows.class);
    }

    @PostConstruct
    public void init() {
        super.setFacade(ejbFacade);
    }

}
