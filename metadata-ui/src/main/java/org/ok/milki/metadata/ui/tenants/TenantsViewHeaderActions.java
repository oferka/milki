package org.ok.milki.metadata.ui.tenants;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

@CssImport("./styles/views/tenants/tenants-view-header-actions.css")
public class TenantsViewHeaderActions extends HorizontalLayout {

    private final TenantsFilterButton tenantsFilterButton;
    private final TenantsNewButton tenantsNewButton;

    public TenantsViewHeaderActions() {
        setId("tenants-view-header-actions");

        tenantsFilterButton = new TenantsFilterButton();
        add(tenantsFilterButton);

        tenantsNewButton = new TenantsNewButton();
        add(tenantsNewButton);
    }
}
