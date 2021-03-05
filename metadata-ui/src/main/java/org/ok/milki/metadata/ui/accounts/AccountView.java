package org.ok.milki.metadata.ui.accounts;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.ok.milki.metadata.ui.EntityType;
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
    protected EntityType getEntityType() {
        return ACCOUNT;
    }

    @Override
    protected EntityViewBody getViewBody() {
        return new AccountViewBody();
    }
}
