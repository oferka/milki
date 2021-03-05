package org.ok.milki.metadata.ui.repositories;

import com.vaadin.flow.component.dependency.CssImport;
import org.ok.milki.metadata.ui.entity.EntityViewBody;

import static org.ok.milki.metadata.ui.EntityType.REPOSITORY;

@CssImport("./styles/views/repositories/repository-view-body.css")
public class RepositoryViewBody extends EntityViewBody {

    public RepositoryViewBody() {
        super(REPOSITORY);
    }
}
