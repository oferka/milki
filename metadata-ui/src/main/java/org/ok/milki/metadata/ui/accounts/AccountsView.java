package org.ok.milki.metadata.ui.accounts;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.ok.milki.metadata.ui.EntityType;
import org.ok.milki.metadata.ui.entities.EntitiesView;
import org.ok.milki.metadata.ui.entities.EntitiesViewBody;
import org.ok.milki.metadata.ui.main.MainView;

import static org.ok.milki.metadata.ui.EntityType.ACCOUNT;
import static org.ok.milki.metadata.ui.Styles.CSS_FILE_EXTENSION;
import static org.ok.milki.metadata.ui.Styles.STYLES_FOLDER;
import static org.ok.milki.metadata.ui.accounts.AccountsView.*;

@Route(value = ACCOUNTS_ROUTE, layout = MainView.class)
@PageTitle(ACCOUNTS_VIEW_NAME)
@CssImport(STYLES_FOLDER + ACCOUNTS_ROUTE + "/" + ACCOUNTS_ID_PREFIX + VIEW_ID_SUFFIX + CSS_FILE_EXTENSION)
public class AccountsView extends EntitiesView {

    public static final String ACCOUNTS_ROUTE = "accounts";
    public static final String ACCOUNTS_VIEW_NAME = "Accounts";
    public static final String ACCOUNTS_ID_PREFIX = "accounts";

    @Override
    protected EntityType getEntityType() {
        return ACCOUNT;
    }

    @Override
    protected EntitiesViewBody getViewBody() {
        return new AccountsViewBody();
    }
}
