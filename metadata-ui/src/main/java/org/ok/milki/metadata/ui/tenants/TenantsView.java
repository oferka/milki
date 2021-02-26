package org.ok.milki.metadata.ui.tenants;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.ok.milki.metadata.ui.entities.EntitiesView;
import org.ok.milki.metadata.ui.main.MainView;

import static com.vaadin.flow.component.icon.VaadinIcon.BUILDING_O;
import static org.ok.milki.metadata.ui.tenants.TenantsView.ROUTE;
import static org.ok.milki.metadata.ui.tenants.TenantsView.VIEW_NAME;

@Route(value = ROUTE, layout = MainView.class)
@PageTitle(VIEW_NAME)
@CssImport("./styles/views/"+ ROUTE + "/" + ROUTE + "-view.css")
public class TenantsView extends EntitiesView {

    public static final String ROUTE = "tenants";
    public static final String VIEW_NAME = "Tenants";
    public static final String ENTITY_NAME = "Tenant";
    public static final String VIEW_DESCRIPTION ="Tenants view description";
    public static final VaadinIcon VIEW_ICON = BUILDING_O;

    @Override
    protected String getIdPrefix() {
        return ROUTE;
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
        return ENTITY_NAME;
    }

    @Override
    protected Component getViewBody() {
        return new TenantsViewBody();
    }
}
