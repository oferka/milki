package org.ok.milki.metadata.ui.accounts;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.ok.milki.metadata.ui.entity.EntityView;
import org.ok.milki.metadata.ui.main.EntityViewBody;
import org.ok.milki.metadata.ui.main.MainView;

import static com.vaadin.flow.component.icon.VaadinIcon.CALC_BOOK;
import static org.ok.milki.metadata.ui.accounts.AccountView.ROUTE;
import static org.ok.milki.metadata.ui.accounts.AccountView.VIEW_NAME;

@Route(value = ROUTE, layout = MainView.class)
@PageTitle(VIEW_NAME)
@CssImport("./styles/views/"+ ROUTE + "/" + "account-view.css")
public class AccountView extends EntityView {

    public static final String ROUTE = "accounts";
    public static final String ID_PREFIX = "account";
    public static final String VIEW_NAME = "Accounts";
    public static final String ENTITY_NAME = "Account";
    public static final String VIEW_DESCRIPTION ="Account view description";
    public static final VaadinIcon VIEW_ICON = CALC_BOOK;

    @Override
    protected String getIdPrefix() {
        return ID_PREFIX;
    }

    @Override
    protected String getViewName() {
        return VIEW_NAME;
    }

    @Override
    protected String getViewDescription() {
        return VIEW_DESCRIPTION;
    }

    @Override
    protected VaadinIcon getViewIcon() {
        return VIEW_ICON;
    }

    @Override
    protected String getEntityName() {
        return VIEW_NAME;
    }

    @Override
    protected EntityViewBody getViewBody() {
        return new AccountViewBody(getIdPrefix());
    }
}
