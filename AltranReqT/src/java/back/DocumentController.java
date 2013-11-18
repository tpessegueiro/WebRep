package back;

import db.Document;
import session.DocumentFacade;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.inject.Inject;
import javax.enterprise.context.SessionScoped;

@Named(value = "documentController")
@SessionScoped
public class DocumentController extends AbstractController<Document> implements Serializable {

    @Inject
    private DocumentFacade ejbFacade;

    public DocumentController() {
        super(Document.class);
    }

    @PostConstruct
    public void init() {
        super.setFacade(ejbFacade);
    }

}
