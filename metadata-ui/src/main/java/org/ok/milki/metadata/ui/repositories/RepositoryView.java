package org.ok.milki.metadata.ui.repositories;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.ok.milki.metadata.ui.EntityType;
import org.ok.milki.metadata.ui.entity.EntityView;
import org.ok.milki.metadata.ui.entity.EntityViewBody;
import org.ok.milki.metadata.ui.main.MainView;

import static org.ok.milki.metadata.ui.EntityType.REPOSITORY;
import static org.ok.milki.metadata.ui.Styles.CSS_FILE_EXTENSION;
import static org.ok.milki.metadata.ui.Styles.STYLES_FOLDER;
import static org.ok.milki.metadata.ui.repositories.RepositoriesView.REPOSITORIES_ID_PREFIX;
import static org.ok.milki.metadata.ui.repositories.RepositoriesView.REPOSITORIES_ROUTE;
import static org.ok.milki.metadata.ui.repositories.RepositoryView.*;

@Route(value = REPOSITORIES_ROUTE, layout = MainView.class)
@PageTitle(REPOSITORY_VIEW_NAME)
@CssImport(STYLES_FOLDER + REPOSITORIES_ID_PREFIX + "/" + REPOSITORY_ID_PREFIX + VIEW_ID_SUFFIX + CSS_FILE_EXTENSION)
public class RepositoryView extends EntityView {

    public static final String REPOSITORY_VIEW_NAME = "Repository";
    public static final String REPOSITORY_ID_PREFIX = "repository";

    @Override
    protected EntityType getEntityType() {
        return REPOSITORY;
    }

    @Override
    protected EntityViewBody getViewBody() {
        return new RepositoryViewBody();
    }
}
