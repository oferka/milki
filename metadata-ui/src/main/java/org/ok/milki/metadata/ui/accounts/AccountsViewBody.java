package org.ok.milki.metadata.ui.accounts;

import com.vaadin.flow.component.dependency.CssImport;
import org.ok.milki.metadata.ui.entities.EntitiesViewBody;

import static org.ok.milki.metadata.ui.EntityType.ACCOUNT;
import static org.ok.milki.metadata.ui.Styles.CSS_FILE_EXTENSION;
import static org.ok.milki.metadata.ui.Styles.STYLES_FOLDER;
import static org.ok.milki.metadata.ui.accounts.AccountsView.ACCOUNTS_ID_PREFIX;

@CssImport(STYLES_FOLDER + ACCOUNTS_ID_PREFIX + "/" + ACCOUNTS_ID_PREFIX + "-view-body" + CSS_FILE_EXTENSION)
public class AccountsViewBody extends EntitiesViewBody {

    public AccountsViewBody() {
        super(ACCOUNT);
    }
}
