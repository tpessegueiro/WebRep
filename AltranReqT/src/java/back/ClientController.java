package back;

import db.Client;
import session.ClientFacade;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.inject.Inject;
import javax.enterprise.context.SessionScoped;

@Named(value = "clientController")
@SessionScoped
public class ClientController extends AbstractController<Client> implements Serializable {

    @Inject
    private ClientFacade ejbFacade;

    public ClientController() {
        super(Client.class);
    }

    @PostConstruct
    public void init() {
        super.setFacade(ejbFacade);
    }

}
