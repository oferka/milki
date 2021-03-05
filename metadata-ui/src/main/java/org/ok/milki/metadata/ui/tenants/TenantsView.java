package org.ok.milki.metadata.ui.tenants;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.ok.milki.metadata.ui.entities.EntitiesView;
import org.ok.milki.metadata.ui.entities.EntitiesViewBody;
import org.ok.milki.metadata.ui.entity.EntityView;
import org.ok.milki.metadata.ui.main.MainView;

import static org.ok.milki.metadata.ui.EntityType.TENANT;
import static org.ok.milki.metadata.ui.tenants.TenantsView.ROUTE;
import static org.ok.milki.metadata.ui.tenants.TenantsView.VIEW_NAME;

@Route(value = ROUTE, layout = MainView.class)
@PageTitle(VIEW_NAME)
@CssImport("./styles/views/"+ ROUTE + "/" + ROUTE + "-view.css")
public class TenantsView extends EntitiesView {

    public static final String ROUTE = "tenants";
    public static final String VIEW_NAME = "Tenants";

    @Override
    protected String getIdPrefix() {
        return TENANT.getEntitiesIdPrefix();
    }

    @Override
    protected String getViewName() {
        return TENANT.getEntitiesViewName();
    }

    @Override
    protected int getEntityCount() {
        return TENANT.getEntityCount();
    }

    @Override
    protected String getViewDescription() {
        return TENANT.getEntitiesViewDescription();
    }

    @Override
    protected VaadinIcon getViewIcon() {
        return TENANT.getEntitiesViewIcon();
    }

    @Override
    protected String getEntityName() {
        return TENANT.getEntityName();
    }

    @Override
    protected EntitiesViewBody getViewBody() {
        return new TenantsViewBody();
    }

    @Override
    protected Class<? extends EntityView> getEntityNavigationTarget() {
        return TENANT.getEntityViewClass();
    }
}
