package org.ok.milki.metadata.ui.tenants;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.router.RouterLink;
import org.ok.milki.metadata.ui.main.EntityViewBody;

@CssImport("./styles/views/tenants/tenant-view-body.css")
public class TenantViewBody extends EntityViewBody {

    public TenantViewBody(String idPrefix) {
        super(idPrefix);
        add(new RouterLink("tenants", TenantsView.class));
    }

    @Override
    public void selectedEntityChanged(String selectedEntityId) {
        selectedIdLabel.setText(selectedEntityId);
    }
}
