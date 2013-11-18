package back;

import db.Privilege;
import session.PrivilegeFacade;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.inject.Inject;
import javax.enterprise.context.SessionScoped;

@Named(value = "privilegeController")
@SessionScoped
public class PrivilegeController extends AbstractController<Privilege> implements Serializable {

    @Inject
    private PrivilegeFacade ejbFacade;

    public PrivilegeController() {
        super(Privilege.class);
    }

    @PostConstruct
    public void init() {
        super.setFacade(ejbFacade);
    }

}
