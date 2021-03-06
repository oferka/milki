package org.ok.milki.metadata.ui.repositories;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.ok.milki.metadata.ui.EntityType;
import org.ok.milki.metadata.ui.entities.EntitiesView;
import org.ok.milki.metadata.ui.entities.EntitiesViewBody;
import org.ok.milki.metadata.ui.main.MainView;

import static org.ok.milki.metadata.ui.EntityType.REPOSITORY;
import static org.ok.milki.metadata.ui.repositories.RepositoriesView.*;

@Route(value = ROUTE, layout = MainView.class)
@PageTitle(VIEW_NAME)
@CssImport("./styles/views/"+ ROUTE + "/" + ID_PREFIX + "-view.css")
public class RepositoriesView extends EntitiesView {

    public static final String ROUTE = "repositories";
    public static final String VIEW_NAME = "Repositories";
    public static final String ID_PREFIX = "repositories";

    @Override
    protected EntityType getEntityType() {
        return REPOSITORY;
    }

    @Override
    protected EntitiesViewBody getViewBody() {
        return new RepositoriesViewBody();
    }
}
