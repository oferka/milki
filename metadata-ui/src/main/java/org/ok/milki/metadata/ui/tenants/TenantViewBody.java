package org.ok.milki.metadata.ui.tenants;

import com.vaadin.flow.component.dependency.CssImport;
import org.ok.milki.metadata.ui.entity.EntityViewBody;

import static org.ok.milki.metadata.ui.EntityType.TENANT;
import static org.ok.milki.metadata.ui.Styles.CSS_FILE_EXTENSION;
import static org.ok.milki.metadata.ui.Styles.STYLES_FOLDER;
import static org.ok.milki.metadata.ui.entity.EntityViewBody.VIEW_BODY_ID_SUFFIX;
import static org.ok.milki.metadata.ui.tenants.TenantView.TENANT_ID_PREFIX;
import static org.ok.milki.metadata.ui.tenants.TenantsView.TENANTS_ID_PREFIX;

@CssImport(STYLES_FOLDER + TENANTS_ID_PREFIX + "/" + TENANT_ID_PREFIX + VIEW_BODY_ID_SUFFIX + CSS_FILE_EXTENSION)
public class TenantViewBody extends EntityViewBody {

    public TenantViewBody() {
        super(TENANT);
    }
}
