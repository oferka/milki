package org.ok.milki.metadata.ui.tenants;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.H1;

import javax.validation.constraints.NotNull;
@CssImport("./styles/views/tenants/tenants-view-title.css")
public class TenantsViewTitle extends H1 {

    public TenantsViewTitle() {
        setId("tenants-view-title");
        setTitleText("All Tenants");
    }

    public void setTitleText(@NotNull String titleText) {
        setText(titleText);
    }
}
