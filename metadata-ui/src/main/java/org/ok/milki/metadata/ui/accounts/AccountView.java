package org.ok.milki.metadata.ui.accounts;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.ok.milki.metadata.ui.EntityType;
import org.ok.milki.metadata.ui.entity.EntityView;
import org.ok.milki.metadata.ui.entity.EntityViewBody;
import org.ok.milki.metadata.ui.main.MainView;

import static org.ok.milki.metadata.ui.EntityType.ACCOUNT;
import static org.ok.milki.metadata.ui.Styles.CSS_FILE_EXTENSION;
import static org.ok.milki.metadata.ui.Styles.STYLES_FOLDER;
import static org.ok.milki.metadata.ui.accounts.AccountView.ACCOUNT_ID_PREFIX;
import static org.ok.milki.metadata.ui.accounts.AccountView.ACCOUNT_VIEW_NAME;
import static org.ok.milki.metadata.ui.accounts.AccountsView.ACCOUNTS_ID_PREFIX;
import static org.ok.milki.metadata.ui.accounts.AccountsView.ACCOUNTS_ROUTE;
import static org.ok.milki.metadata.ui.entity.EntityView.VIEW_ID_SUFFIX;

@Route(value = ACCOUNTS_ROUTE, layout = MainView.class)
@PageTitle(ACCOUNT_VIEW_NAME)
@CssImport(STYLES_FOLDER + ACCOUNTS_ID_PREFIX + "/" + ACCOUNT_ID_PREFIX + VIEW_ID_SUFFIX + CSS_FILE_EXTENSION)
public class AccountView extends EntityView {

    public static final String ACCOUNT_VIEW_NAME = "Account";
    public static final String ACCOUNT_ID_PREFIX = "account";

    @Override
    protected EntityType getEntityType() {
        return ACCOUNT;
    }

    @Override
    protected EntityViewBody getViewBody() {
        return new AccountViewBody();
    }
}
