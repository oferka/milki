package org.ok.milki.metadata.ui.accounts;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.ok.milki.metadata.ui.entities.EntitiesView;
import org.ok.milki.metadata.ui.entities.EntitiesViewBody;
import org.ok.milki.metadata.ui.entity.EntityView;
import org.ok.milki.metadata.ui.main.MainView;

import static org.ok.milki.metadata.ui.EntityType.ACCOUNT;
import static org.ok.milki.metadata.ui.accounts.AccountsView.ROUTE;
import static org.ok.milki.metadata.ui.accounts.AccountsView.VIEW_NAME;

@Route(value = ROUTE, layout = MainView.class)
@PageTitle(VIEW_NAME)
@CssImport("./styles/views/" + ROUTE + "/" + ROUTE + "-view.css")
public class AccountsView extends EntitiesView {

    public static final String ROUTE = "accounts";
    public static final String VIEW_NAME = "Accounts";

    @Override
    protected String getIdPrefix() {
        return ACCOUNT.getEntitiesIdPrefix();
    }

    @Override
    protected String getViewName() {
        return ACCOUNT.getEntitiesViewName();
    }

    @Override
    protected int getEntityCount() {
        return ACCOUNT.getEntityCount();
    }

    @Override
    protected String getViewDescription() {
        return ACCOUNT.getEntitiesViewDescription();
    }

    @Override
    protected VaadinIcon getViewIcon() {
        return ACCOUNT.getEntitiesViewIcon();
    }

    @Override
    protected String getEntityName() {
        return ACCOUNT.getEntityName();
    }

    @Override
    protected EntitiesViewBody getViewBody() {
        return new AccountsViewBody();
    }

    @Override
    protected Class<? extends EntityView> getEntityNavigationTarget() {
        return ACCOUNT.getEntityViewClass();
    }
}
