package org.ok.milki.metadata.ui.repositories;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.ok.milki.metadata.ui.entity.EntityView;
import org.ok.milki.metadata.ui.main.EntityComponent;
import org.ok.milki.metadata.ui.main.MainView;

import static com.vaadin.flow.component.icon.VaadinIcon.ROAD_SPLIT;
import static org.ok.milki.metadata.ui.repositories.RepositoryView.ROUTE;
import static org.ok.milki.metadata.ui.repositories.RepositoryView.VIEW_NAME;

@Route(value = ROUTE, layout = MainView.class)
@PageTitle(VIEW_NAME)
@CssImport("./styles/views/"+ ROUTE + "/" + "repository-view.css")
public class RepositoryView extends EntityView {

    public static final String ROUTE = "repositories";
    public static final String ID_PREFIX = "repository";
    public static final String VIEW_NAME = "Repositories";
    public static final String ENTITY_NAME = "Repository";
    public static final String VIEW_DESCRIPTION ="Repository view description";
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
        return new RepositoryViewBody();
    }
}
