package org.ok.milki.metadata.ui.tenants;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.ok.milki.metadata.data.EntityDataProvider;
import org.ok.milki.metadata.ui.EntityType;
import org.ok.milki.metadata.ui.entities.EntitiesView;
import org.ok.milki.metadata.ui.entities.EntitiesViewBody;
import org.ok.milki.metadata.ui.main.MainView;

import static org.ok.milki.metadata.ui.EntityType.TENANT;
import static org.ok.milki.metadata.ui.Styles.CSS_FILE_EXTENSION;
import static org.ok.milki.metadata.ui.Styles.STYLES_FOLDER;
import static org.ok.milki.metadata.ui.tenants.TenantsView.*;

@Route(value = TENANTS_ROUTE, layout = MainView.class)
@PageTitle(TENANTS_VIEW_NAME)
@CssImport(STYLES_FOLDER + TENANTS_ID_PREFIX + "/" + TENANTS_ID_PREFIX + VIEW_ID_SUFFIX + CSS_FILE_EXTENSION)
public class TenantsView extends EntitiesView {

    public static final String TENANTS_ROUTE = "tenants";
    public static final String TENANTS_VIEW_NAME = "Tenants";
    public static final String TENANTS_ID_PREFIX = "tenants";

    public TenantsView(EntityDataProvider entityDataProvider) {
        super(entityDataProvider);
    }

    @Override
    protected EntityType getEntityType() {
        return TENANT;
    }

    @Override
    protected EntitiesViewBody getViewBody() {
        return new TenantsViewBody();
    }
}
