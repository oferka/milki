package org.ok.milki.metadata.ui.repositories;

import com.vaadin.flow.component.dependency.CssImport;
import org.ok.milki.metadata.ui.entity.EntityViewBody;

import static org.ok.milki.metadata.ui.EntityType.REPOSITORY;
import static org.ok.milki.metadata.ui.Styles.CSS_FILE_EXTENSION;
import static org.ok.milki.metadata.ui.Styles.STYLES_FOLDER;
import static org.ok.milki.metadata.ui.entity.EntityViewBody.VIEW_BODY_ID_SUFFIX;
import static org.ok.milki.metadata.ui.repositories.RepositoriesView.REPOSITORIES_ID_PREFIX;
import static org.ok.milki.metadata.ui.repositories.RepositoryView.REPOSITORY_ID_PREFIX;

@CssImport(STYLES_FOLDER + REPOSITORIES_ID_PREFIX + "/" + REPOSITORY_ID_PREFIX + VIEW_BODY_ID_SUFFIX + CSS_FILE_EXTENSION)
public class RepositoryViewBody extends EntityViewBody {

    public RepositoryViewBody() {
        super(REPOSITORY);
    }
}
