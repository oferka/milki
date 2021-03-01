package org.ok.milki.metadata.ui.accounts;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.dependency.CssImport;
import org.ok.milki.metadata.ui.entities.EntitiesViewBody;

@CssImport("./styles/views/accounts/accounts-view-body.css")
public class AccountsViewBody extends EntitiesViewBody {

    public AccountsViewBody(String idPrefix, String entityName) {
        super(idPrefix, entityName);
        add(new Text("accounts new"));
    }
}
