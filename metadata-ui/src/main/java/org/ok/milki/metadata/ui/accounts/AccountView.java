package org.ok.milki.metadata.ui.accounts;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.ok.milki.metadata.ui.entities.EntitiesView;
import org.ok.milki.metadata.ui.entity.EntityView;
import org.ok.milki.metadata.ui.entity.EntityViewBody;
import org.ok.milki.metadata.ui.main.MainView;

import static org.ok.milki.metadata.ui.EntityType.ACCOUNT;
import static org.ok.milki.metadata.ui.accounts.AccountView.ROUTE;
import static org.ok.milki.metadata.ui.accounts.AccountView.VIEW_NAME;

@Route(value = ROUTE, layout = MainView.class)
@PageTitle(VIEW_NAME)
@CssImport("./styles/views/" + ROUTE + "/" + "account-view.css")
public class AccountView extends EntityView {

    public static final String ROUTE = "accounts";
    public static final String VIEW_NAME = "Accounts";

    @Override
    protected String getIdPrefix() {
        return ACCOUNT.getEntityIdPrefix();
    }

    @Override
    protected String getViewName() {
        return ACCOUNT.getEntityViewName();
    }

    @Override
    protected String getViewDescription() {
        return ACCOUNT.getEntityViewDescription();
    }

    @Override
    protected VaadinIcon getViewIcon() {
        return ACCOUNT.getEntitiesViewIcon();
    }

    @Override
    protected String getEntityName() {
        return ACCOUNT.getEntityViewName();
    }

    @Override
    protected EntityViewBody getViewBody() {
        return new AccountViewBody(ACCOUNT.getEntityIdPrefix(), ACCOUNT.getEntitiesViewName(), ACCOUNT.getEntitiesViewClass());
    }

    @Override
    protected String getEntitiesRoute() {
        return ACCOUNT.getRoute();
    }

    @Override
    protected Class<? extends EntitiesView> getEntitiesNavigationTarget() {
        return ACCOUNT.getEntitiesViewClass();
    }
}
