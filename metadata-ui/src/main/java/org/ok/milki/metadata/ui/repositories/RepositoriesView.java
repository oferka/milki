package org.ok.milki.metadata.ui.repositories;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.icon.IconFactory;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.ok.milki.metadata.ui.entities.EntitiesView;
import org.ok.milki.metadata.ui.main.MainView;
import org.ok.milki.metadata.ui.services.ServicesViewBody;

import static org.ok.milki.metadata.ui.repositories.RepositoriesView.ROUTE;
import static org.ok.milki.metadata.ui.repositories.RepositoriesView.VIEW_NAME;

@Route(value = ROUTE, layout = MainView.class)
@PageTitle(VIEW_NAME)
@CssImport("./styles/views/"+ ROUTE + "/" + ROUTE + "-view.css")
public class RepositoriesView extends EntitiesView {

    public static final String ROUTE = "repositories";
    public static final String VIEW_NAME = "Repositories";
    public static final String ENTITY_NAME ="Repository";
    public static final String VIEW_DESCRIPTION ="Repositories view description";
    public static final IconFactory VIEW_ICON = VaadinIcon.ROAD_SPLIT;

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
    protected IconFactory getViewIconFactory() {
        return VIEW_ICON;
    }

    @Override
    protected String getEntityName() {
        return ENTITY_NAME;
    }

    @Override
    protected Component getViewBody() {
        return new RepositoriesViewBody();
    }
}
