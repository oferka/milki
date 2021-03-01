package org.ok.milki.metadata.ui.accounts;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.router.RouterLink;
import org.ok.milki.metadata.ui.main.EntityViewBody;

@CssImport("./styles/views/accounts/account-view-body.css")
public class AccountViewBody extends EntityViewBody {

    public AccountViewBody(String idPrefix) {
        super(idPrefix);
        add(new RouterLink("accounts", AccountsView.class));
    }

    @Override
    public void selectedEntityChanged(String selectedEntityId) {
        selectedIdLabel.setText(selectedEntityId);
    }
}
