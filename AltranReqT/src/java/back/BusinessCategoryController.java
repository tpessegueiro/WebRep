package back;

import db.BusinessCategory;
import session.BusinessCategoryFacade;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.inject.Inject;
import javax.enterprise.context.SessionScoped;

@Named(value = "businessCategoryController")
@SessionScoped
public class BusinessCategoryController extends AbstractController<BusinessCategory> implements Serializable {

    @Inject
    private BusinessCategoryFacade ejbFacade;

    public BusinessCategoryController() {
        super(BusinessCategory.class);
    }

    @PostConstruct
    public void init() {
        super.setFacade(ejbFacade);
    }

}
