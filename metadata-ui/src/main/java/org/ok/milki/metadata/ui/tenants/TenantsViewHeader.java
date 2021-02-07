package org.ok.milki.metadata.ui.tenants;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

@CssImport("./styles/views/tenants/tenants-view-header.css")
public class TenantsViewHeader extends HorizontalLayout {

    private final TenantsViewTitle tenantsViewTitle;

    public TenantsViewHeader() {
        setId("tenants-view-header");

        setWidthFull();
        setSpacing(false);
        setAlignItems(FlexComponent.Alignment.CENTER);

        tenantsViewTitle = new TenantsViewTitle();
        add(tenantsViewTitle);
    }
}
