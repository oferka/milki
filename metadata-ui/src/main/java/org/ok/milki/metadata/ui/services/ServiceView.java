package org.ok.milki.metadata.ui.services;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.ok.milki.metadata.ui.entity.EntityView;
import org.ok.milki.metadata.ui.entity.EntityViewBody;
import org.ok.milki.metadata.ui.main.MainView;

import static com.vaadin.flow.component.icon.VaadinIcon.CLUSTER;
import static org.ok.milki.metadata.ui.services.ServiceView.ROUTE;
import static org.ok.milki.metadata.ui.services.ServiceView.VIEW_NAME;

@Route(value = ROUTE, layout = MainView.class)
@PageTitle(VIEW_NAME)
@CssImport("./styles/views/"+ ROUTE + "/" + "service-view.css")
public class ServiceView extends EntityView {

    public static final String ROUTE = "services";
    public static final String ID_PREFIX = "service";
    public static final String VIEW_NAME = "Services";
    public static final String ENTITY_NAME = "Service";
    public static final String VIEW_DESCRIPTION ="Service view description";
    public static final VaadinIcon VIEW_ICON = CLUSTER;

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
    protected EntityViewBody getViewBody() {
        return new ServiceViewBody(getIdPrefix(), getViewName());
    }

    @Override
    protected String getEntitiesRoute() {
        return ROUTE;
    }
}
