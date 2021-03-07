package org.ok.milki.metadata.ui.tenants;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.ok.milki.metadata.ui.EntityType;
import org.ok.milki.metadata.ui.entity.EntityView;
import org.ok.milki.metadata.ui.entity.EntityViewBody;
import org.ok.milki.metadata.ui.main.MainView;

import static org.ok.milki.metadata.ui.EntityType.TENANT;
import static org.ok.milki.metadata.ui.Styles.CSS_FILE_EXTENSION;
import static org.ok.milki.metadata.ui.Styles.STYLES_FOLDER;
import static org.ok.milki.metadata.ui.tenants.TenantView.*;
import static org.ok.milki.metadata.ui.tenants.TenantsView.TENANTS_ID_PREFIX;
import static org.ok.milki.metadata.ui.tenants.TenantsView.TENANTS_ROUTE;

@Route(value = TENANTS_ROUTE, layout = MainView.class)
@PageTitle(TENANT_VIEW_NAME)
@CssImport(STYLES_FOLDER + TENANTS_ID_PREFIX + "/" + TENANT_ID_PREFIX + VIEW_ID_SUFFIX + CSS_FILE_EXTENSION)
public class TenantView extends EntityView {

    public static final String TENANT_VIEW_NAME = "Tenant";
    public static final String TENANT_ID_PREFIX = "tenant";

    @Override
    protected EntityType getEntityType() {
        return TENANT;
    }

    @Override
    protected EntityViewBody getViewBody() {
        return new TenantViewBody();
    }
}
