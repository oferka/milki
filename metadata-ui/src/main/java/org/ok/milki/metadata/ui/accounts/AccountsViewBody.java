package org.ok.milki.metadata.ui.accounts;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

@CssImport("./styles/views/accounts/accounts-view-body.css")
public class AccountsViewBody extends VerticalLayout {

    public AccountsViewBody() {
        setId("accounts-view-body");
        add(new Text("accounts new"));
    }
}
