package org.ok.milki.metadata.ui.tenants;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.ok.milki.metadata.ui.entity.EntityView;
import org.ok.milki.metadata.ui.main.EntityComponent;
import org.ok.milki.metadata.ui.main.MainView;

import static com.vaadin.flow.component.icon.VaadinIcon.BUILDING_O;
import static org.ok.milki.metadata.ui.tenants.TenantView.ROUTE;
import static org.ok.milki.metadata.ui.tenants.TenantView.VIEW_NAME;

@Route(value = ROUTE, layout = MainView.class)
@PageTitle(VIEW_NAME)
@CssImport("./styles/views/"+ ROUTE + "/" + "tenant-view.css")
public class TenantView extends EntityView {

    public static final String ROUTE = "tenants";
    public static final String ID_PREFIX = "tenant";
    public static final String VIEW_NAME = "Tenants";
    public static final String ENTITY_NAME = "Tenant";
    public static final String VIEW_DESCRIPTION ="Tenant view description";
    public static final VaadinIcon VIEW_ICON = BUILDING_O;

    @Override
    protected String getIdPrefix() {
        return ID_PREFIX;
    }

    @Override
    protected String getViewName() {
        return VIEW_NAME;
    }

    @Override
    protected String getViewDescription() {
        return VIEW_DESCRIPTION;
    }

    @Override
    protected VaadinIcon getViewIcon() {
        return VIEW_ICON;
    }

    @Override
    protected String getEntityName() {
        return VIEW_NAME;
    }

    @Override
    protected EntityComponent getViewBody() {
        return new TenantViewBody();
    }
}
