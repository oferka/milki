package org.ok.milki.metadata.ui.tenants;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.ok.milki.metadata.ui.entities.EntitiesView;
import org.ok.milki.metadata.ui.entity.EntityView;
import org.ok.milki.metadata.ui.entity.EntityViewBody;
import org.ok.milki.metadata.ui.main.MainView;

import static org.ok.milki.metadata.ui.EntityType.TENANT;
import static org.ok.milki.metadata.ui.tenants.TenantView.ROUTE;
import static org.ok.milki.metadata.ui.tenants.TenantView.VIEW_NAME;

@Route(value = ROUTE, layout = MainView.class)
@PageTitle(VIEW_NAME)
@CssImport("./styles/views/"+ ROUTE + "/" + "tenant-view.css")
public class TenantView extends EntityView {

    public static final String ROUTE = "tenants";
    public static final String VIEW_NAME = "Tenants";

    @Override
    protected String getIdPrefix() {
        return TENANT.getEntityIdPrefix();
    }

    @Override
    protected String getViewName() {
        return TENANT.getEntityViewName();
    }

    @Override
    protected String getViewDescription() {
        return TENANT.getEntityViewDescription();
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
    protected EntityViewBody getViewBody() {
        return new TenantViewBody(TENANT.getEntitiesIdPrefix(), TENANT.getEntitiesViewName(), TENANT.getEntitiesViewClass());
    }

    @Override
    protected String getEntitiesRoute() {
        return TENANT.getRoute();
    }

    @Override
    protected Class<? extends EntitiesView> getEntitiesNavigationTarget() {
        return TENANT.getEntitiesViewClass();
    }
}
