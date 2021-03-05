package org.ok.milki.metadata.ui.tenants;

import com.vaadin.flow.component.dependency.CssImport;
import org.ok.milki.metadata.ui.entities.EntitiesViewBody;

import static org.ok.milki.metadata.ui.EntityType.TENANT;

@CssImport("./styles/views/tenants/tenants-view-body.css")
public class TenantsViewBody extends EntitiesViewBody {

    public TenantsViewBody() {
        super(TENANT);
    }
}
