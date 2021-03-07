package org.ok.milki.metadata.ui.tenants;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.ok.milki.metadata.ui.EntityType;
import org.ok.milki.metadata.ui.entities.EntitiesView;
import org.ok.milki.metadata.ui.entities.EntitiesViewBody;
import org.ok.milki.metadata.ui.main.MainView;

import static org.ok.milki.metadata.ui.EntityType.TENANT;
import static org.ok.milki.metadata.ui.Styles.STYLES_FOLDER;
import static org.ok.milki.metadata.ui.tenants.TenantsView.*;

@Route(value = ROUTE, layout = MainView.class)
@PageTitle(VIEW_NAME)
@CssImport(STYLES_FOLDER + ROUTE + "/" + ID_PREFIX + "-view.css")
public class TenantsView extends EntitiesView {

    public static final String ROUTE = "tenants";
    public static final String VIEW_NAME = "Tenants";
    public static final String ID_PREFIX = "tenants";

    @Override
    protected EntityType getEntityType() {
        return TENANT;
    }

    @Override
    protected EntitiesViewBody getViewBody() {
        return new TenantsViewBody();
    }
}
