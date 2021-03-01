package org.ok.milki.metadata.ui.repositories;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.ok.milki.metadata.ui.entities.EntitiesView;
import org.ok.milki.metadata.ui.main.MainView;

import static com.vaadin.flow.component.icon.VaadinIcon.ROAD_SPLIT;
import static org.apache.commons.lang3.RandomUtils.nextInt;
import static org.ok.milki.metadata.ui.repositories.RepositoriesView.ROUTE;
import static org.ok.milki.metadata.ui.repositories.RepositoriesView.VIEW_NAME;

@Route(value = ROUTE, layout = MainView.class)
@PageTitle(VIEW_NAME)
@CssImport("./styles/views/"+ ROUTE + "/" + ROUTE + "-view.css")
public class RepositoriesView extends EntitiesView {

    public static final String ROUTE = "repositories";
    public static final String ID_PREFIX = "repositories";
    public static final String VIEW_NAME = "Repositories";
    public static final String ENTITY_NAME ="Repository";
    public static final String VIEW_DESCRIPTION ="Repositories view description";
    public static final VaadinIcon VIEW_ICON = ROAD_SPLIT;

    @Override
    protected String getIdPrefix() {
        return ID_PREFIX;
    }

    @Override
    protected String getViewName() {
        return VIEW_NAME;
    }

    @Override
    protected int getEntityCount() {
        return nextInt(0, 100);
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
        return new RepositoriesViewBody();
    }
}
