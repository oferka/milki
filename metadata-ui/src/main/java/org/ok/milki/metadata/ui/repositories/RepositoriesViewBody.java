package org.ok.milki.metadata.ui.repositories;

import com.vaadin.flow.component.dependency.CssImport;
import org.ok.milki.metadata.ui.entities.EntitiesViewBody;

import static org.ok.milki.metadata.ui.EntityType.REPOSITORY;
import static org.ok.milki.metadata.ui.Styles.CSS_FILE_EXTENSION;
import static org.ok.milki.metadata.ui.Styles.STYLES_FOLDER;

@CssImport(STYLES_FOLDER + "repositories/repositories-view-body" + CSS_FILE_EXTENSION)
public class RepositoriesViewBody extends EntitiesViewBody {

    public RepositoriesViewBody() {
        super(REPOSITORY);
    }
}
