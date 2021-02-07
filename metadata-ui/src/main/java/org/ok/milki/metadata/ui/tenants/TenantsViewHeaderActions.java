package org.ok.milki.metadata.ui.tenants;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

@CssImport("./styles/views/tenants/tenants-view-header-actions.css")
public class TenantsViewHeaderActions extends HorizontalLayout {

    public TenantsViewHeaderActions() {
        setId("tenants-view-header-actions");

        add(new Button("action 1"), new Button("action 2"));
    }
}
