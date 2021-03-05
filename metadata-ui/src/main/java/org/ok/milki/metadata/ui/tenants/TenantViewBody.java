package org.ok.milki.metadata.ui.tenants;

import com.vaadin.flow.component.dependency.CssImport;
import org.ok.milki.metadata.ui.entity.EntityViewBody;

import static org.ok.milki.metadata.ui.EntityType.TENANT;

@CssImport("./styles/views/tenants/tenant-view-body.css")
public class TenantViewBody extends EntityViewBody {

    public TenantViewBody() {
        super(TENANT);
    }
}
