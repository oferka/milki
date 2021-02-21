package org.ok.milki.metadata.ui.accounts;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.icon.IconFactory;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.ok.milki.metadata.ui.entities.EntitiesView;
import org.ok.milki.metadata.ui.main.MainView;

import static org.ok.milki.metadata.ui.accounts.AccountsView.ROUTE;
import static org.ok.milki.metadata.ui.accounts.AccountsView.VIEW_NAME;

@Route(value = ROUTE, layout = MainView.class)
@PageTitle(VIEW_NAME)
@CssImport("./styles/views/"+ ROUTE + "/" + ROUTE + "-view.css")
public class AccountsView extends EntitiesView {

    public static final String ROUTE = "accounts";
    public static final String VIEW_NAME = "Accounts";
    public static final String ENTITY_NAME ="Account";
    public static final String VIEW_DESCRIPTION ="Accounts view description";
    public static final IconFactory VIEW_ICON = VaadinIcon.CALC_BOOK;

    @Override
    protected String getIdPrefix() {
        return ROUTE;
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
    protected IconFactory getViewIconFactory() {
        return VIEW_ICON;
    }

    @Override
    protected String getEntityName() {
        return ENTITY_NAME;
    }

    @Override
    protected Component getViewBody() {
        return new AccountsViewBody();
    }
}
