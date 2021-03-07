package org.ok.milki.metadata.ui.accounts;

import com.vaadin.flow.component.dependency.CssImport;
import org.ok.milki.metadata.ui.entities.EntitiesViewBody;

import static org.ok.milki.metadata.ui.EntityType.ACCOUNT;
import static org.ok.milki.metadata.ui.Styles.STYLES_FOLDER;

@CssImport(STYLES_FOLDER + "accounts/accounts-view-body.css")
public class AccountsViewBody extends EntitiesViewBody {

    public AccountsViewBody() {
        super(ACCOUNT);
    }
}
