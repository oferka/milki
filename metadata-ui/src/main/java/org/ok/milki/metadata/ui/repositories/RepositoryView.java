package org.ok.milki.metadata.ui.repositories;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.ok.milki.metadata.ui.entities.EntitiesView;
import org.ok.milki.metadata.ui.entity.EntityView;
import org.ok.milki.metadata.ui.entity.EntityViewBody;
import org.ok.milki.metadata.ui.main.MainView;

import static org.ok.milki.metadata.ui.EntityType.REPOSITORY;
import static org.ok.milki.metadata.ui.repositories.RepositoryView.ROUTE;
import static org.ok.milki.metadata.ui.repositories.RepositoryView.VIEW_NAME;

@Route(value = ROUTE, layout = MainView.class)
@PageTitle(VIEW_NAME)
@CssImport("./styles/views/"+ ROUTE + "/" + "repository-view.css")
public class RepositoryView extends EntityView {

    public static final String ROUTE = "repositories";
    public static final String VIEW_NAME = "Repositories";

    @Override
    protected String getIdPrefix() {
        return REPOSITORY.getEntityIdPrefix();
    }

    @Override
    protected String getViewName() {
        return REPOSITORY.getEntityViewName();
    }

    @Override
    protected String getViewDescription() {
        return REPOSITORY.getEntityViewDescription();
    }

    @Override
    protected VaadinIcon getViewIcon() {
        return REPOSITORY.getEntitiesViewIcon();
    }

    @Override
    protected String getEntityName() {
        return REPOSITORY.getEntityName();
    }

    @Override
    protected EntityViewBody getViewBody() {
        return new RepositoryViewBody(REPOSITORY.getEntityIdPrefix(), REPOSITORY.getEntitiesViewName(), REPOSITORY.getEntitiesViewClass());
    }

    @Override
    protected String getEntitiesRoute() {
        return REPOSITORY.getRoute();
    }

    @Override
    protected Class<? extends EntitiesView> getEntitiesNavigationTarget() {
        return REPOSITORY.getEntitiesViewClass();
    }
}
