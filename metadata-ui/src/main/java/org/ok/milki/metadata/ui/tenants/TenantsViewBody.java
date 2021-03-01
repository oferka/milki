package org.ok.milki.metadata.ui.tenants;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.dependency.CssImport;
import org.ok.milki.metadata.ui.entities.EntitiesViewBody;

@CssImport("./styles/views/tenants/tenants-view-body.css")
public class TenantsViewBody extends EntitiesViewBody {

    public TenantsViewBody(String idPrefix) {
        super(idPrefix);
        add(new Text("tenants new"));
    }
}
