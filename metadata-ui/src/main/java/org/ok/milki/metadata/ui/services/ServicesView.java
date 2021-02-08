package org.ok.milki.metadata.ui.services;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.ok.milki.metadata.ui.entities.EntitiesView;
import org.ok.milki.metadata.ui.main.MainView;

import static org.ok.milki.metadata.ui.services.ServicesView.ROUTE;
import static org.ok.milki.metadata.ui.services.ServicesView.VIEW_NAME;

@Route(value = ROUTE, layout = MainView.class)
@PageTitle(VIEW_NAME)
@CssImport("./styles/views/services/services-view.css")
public class ServicesView extends EntitiesView {

    public static final String ROUTE = "services";
    public static final String VIEW_NAME = "Services";
    public static final String ENTITY_NAME ="Service";
    public static final Icon VIEW_ICON = VaadinIcon.CLUSTER.create();

    @Override
    public String getIdPrefix() {
        return ROUTE;
    }

    @Override
    public String getViewName() {
        return VIEW_NAME;
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }
}
