package org.ok.milki.metadata.ui.tenants;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.H2;

import javax.validation.constraints.NotNull;
@CssImport("./styles/views/tenants/tenants-view-header-title.css")
public class TenantsViewHeaderTitle extends H2 {

    public TenantsViewHeaderTitle() {
        setId("tenants-view-header-title");
        setTitleText("All Tenants");
    }

    public void setTitleText(@NotNull String titleText) {
        setText(titleText);
    }
}
