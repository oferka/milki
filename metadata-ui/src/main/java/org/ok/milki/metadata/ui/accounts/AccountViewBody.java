package org.ok.milki.metadata.ui.accounts;

import com.vaadin.flow.component.dependency.CssImport;
import org.ok.milki.metadata.ui.entity.EntityViewBody;

import static org.ok.milki.metadata.ui.EntityType.ACCOUNT;

@CssImport("./styles/views/accounts/account-view-body.css")
public class AccountViewBody extends EntityViewBody {

    public AccountViewBody() {
        super(ACCOUNT);
    }
}
