package org.ok.milki.metadata.ui.services;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.ok.milki.metadata.ui.entities.EntitiesView;
import org.ok.milki.metadata.ui.main.MainView;

import static com.vaadin.flow.component.icon.VaadinIcon.CLUSTER;
import static org.ok.milki.metadata.ui.services.ServicesView.ROUTE;
import static org.ok.milki.metadata.ui.services.ServicesView.VIEW_NAME;

@Route(value = ROUTE, layout = MainView.class)
@PageTitle(VIEW_NAME)
@CssImport("./styles/views/"+ ROUTE + "/" + ROUTE + "-view.css")
public class ServicesView extends EntitiesView {

    public static final String ROUTE = "services";
    public static final String VIEW_NAME = "Services";
    public static final String ENTITY_NAME ="Service";
    public static final String VIEW_DESCRIPTION ="Services view description";
    public static final VaadinIcon VIEW_ICON = CLUSTER;

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
        return new ServicesViewBody();
    }
}
