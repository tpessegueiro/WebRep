package back;

import db.Actor;
import session.ActorFacade;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.inject.Inject;
import javax.enterprise.context.SessionScoped;

@Named(value = "actorController")
@SessionScoped
public class ActorController extends AbstractController<Actor> implements Serializable {

    @Inject
    private ActorFacade ejbFacade;

    public ActorController() {
        super(Actor.class);
    }

    @PostConstruct
    public void init() {
        super.setFacade(ejbFacade);
    }

}
