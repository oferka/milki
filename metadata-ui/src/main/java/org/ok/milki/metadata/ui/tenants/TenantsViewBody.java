package org.ok.milki.metadata.ui.tenants;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

@CssImport("./styles/views/tenants/tenants-view-body.css")
public class TenantsViewBody extends VerticalLayout {

    public TenantsViewBody() {
        setId("tenants-view-body");

        setHeightFull();
        setAlignItems(FlexComponent.Alignment.CENTER);

        add(new Text("Body"));
    }
}
