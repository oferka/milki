package org.ok.milki.metadata.ui.repositories;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.ok.milki.metadata.data.EntityDataProvider;
import org.ok.milki.metadata.ui.EntityType;
import org.ok.milki.metadata.ui.entities.EntitiesView;
import org.ok.milki.metadata.ui.entities.EntitiesViewBody;
import org.ok.milki.metadata.ui.main.MainView;

import static org.ok.milki.metadata.ui.EntityType.REPOSITORY;
import static org.ok.milki.metadata.ui.Styles.CSS_FILE_EXTENSION;
import static org.ok.milki.metadata.ui.Styles.STYLES_FOLDER;
import static org.ok.milki.metadata.ui.repositories.RepositoriesView.*;

@Route(value = REPOSITORIES_ROUTE, layout = MainView.class)
@PageTitle(REPOSITORIES_VIEW_NAME)
@CssImport(STYLES_FOLDER + REPOSITORIES_ID_PREFIX + "/" + REPOSITORIES_ID_PREFIX + VIEW_ID_SUFFIX + CSS_FILE_EXTENSION)
public class RepositoriesView extends EntitiesView {

    public static final String REPOSITORIES_ROUTE = "repositories";
    public static final String REPOSITORIES_VIEW_NAME = "Repositories";
    public static final String REPOSITORIES_ID_PREFIX = "repositories";

    public RepositoriesView(EntityDataProvider entityDataProvider) {
        super(entityDataProvider);
    }

    @Override
    protected EntityType getEntityType() {
        return REPOSITORY;
    }

    @Override
    protected EntitiesViewBody getViewBody() {
        return new RepositoriesViewBody();
    }
}
