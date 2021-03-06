package org.ok.milki.metadata.ui.accounts;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.ok.milki.metadata.ui.EntityType;
import org.ok.milki.metadata.ui.entity.EntityView;
import org.ok.milki.metadata.ui.entity.EntityViewBody;
import org.ok.milki.metadata.ui.main.MainView;

import static org.ok.milki.metadata.ui.EntityType.ACCOUNT;
import static org.ok.milki.metadata.ui.accounts.AccountView.ID_PREFIX;
import static org.ok.milki.metadata.ui.accounts.AccountView.VIEW_NAME;
import static org.ok.milki.metadata.ui.accounts.AccountsView.ROUTE;

@Route(value = ROUTE, layout = MainView.class)
@PageTitle(VIEW_NAME)
@CssImport("./styles/views/" + ROUTE + "/" + ID_PREFIX + "-view.css")
public class AccountView extends EntityView {

    public static final String VIEW_NAME = "Account";
    public static final String ID_PREFIX = "account";

    @Override
    protected EntityType getEntityType() {
        return ACCOUNT;
    }

    @Override
    protected EntityViewBody getViewBody() {
        return new AccountViewBody();
    }
}
