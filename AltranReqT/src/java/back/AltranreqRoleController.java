package back;

import db.AltranreqRole;
import session.AltranreqRoleFacade;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.inject.Inject;
import javax.enterprise.context.SessionScoped;

@Named(value = "altranreqRoleController")
@SessionScoped
public class AltranreqRoleController extends AbstractController<AltranreqRole> implements Serializable {

    @Inject
    private AltranreqRoleFacade ejbFacade;

    public AltranreqRoleController() {
        super(AltranreqRole.class);
    }

    @PostConstruct
    public void init() {
        super.setFacade(ejbFacade);
    }

}
