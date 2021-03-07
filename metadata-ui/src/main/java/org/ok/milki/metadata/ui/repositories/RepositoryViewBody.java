package org.ok.milki.metadata.ui.repositories;

import com.vaadin.flow.component.dependency.CssImport;
import org.ok.milki.metadata.ui.entity.EntityViewBody;

import static org.ok.milki.metadata.ui.EntityType.REPOSITORY;
import static org.ok.milki.metadata.ui.Styles.STYLES_FOLDER;

@CssImport(STYLES_FOLDER + "repositories/repository-view-body.css")
public class RepositoryViewBody extends EntityViewBody {

    public RepositoryViewBody() {
        super(REPOSITORY);
    }
}
