package org.ok.milki.metadata.ui.repositories;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.ok.milki.metadata.ui.entities.EntitiesView;
import org.ok.milki.metadata.ui.entities.EntitiesViewBody;
import org.ok.milki.metadata.ui.entity.EntityView;
import org.ok.milki.metadata.ui.main.MainView;

import static org.ok.milki.metadata.ui.EntityType.REPOSITORY;
import static org.ok.milki.metadata.ui.repositories.RepositoriesView.ROUTE;
import static org.ok.milki.metadata.ui.repositories.RepositoriesView.VIEW_NAME;

@Route(value = ROUTE, layout = MainView.class)
@PageTitle(VIEW_NAME)
@CssImport("./styles/views/"+ ROUTE + "/" + ROUTE + "-view.css")
public class RepositoriesView extends EntitiesView {

    public static final String ROUTE = "repositories";
    public static final String VIEW_NAME = "Repositories";

    @Override
    protected String getIdPrefix() {
        return REPOSITORY.getEntitiesIdPrefix();
    }

    @Override
    protected String getViewName() {
        return REPOSITORY.getEntitiesViewName();
    }

    @Override
    protected int getEntityCount() {
        return REPOSITORY.getEntityCount();
    }

    @Override
    protected String getViewDescription() {
        return REPOSITORY.getEntitiesViewDescription();
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
    protected EntitiesViewBody getViewBody() {
        return new RepositoriesViewBody(REPOSITORY.getEntitiesIdPrefix(), REPOSITORY.getEntityName(), REPOSITORY.getEntityViewClass());
    }

    @Override
    protected Class<? extends EntityView> getEntityNavigationTarget() {
        return REPOSITORY.getEntityViewClass();
    }
}
