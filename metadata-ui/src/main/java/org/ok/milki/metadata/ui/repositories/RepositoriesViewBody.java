package org.ok.milki.metadata.ui.repositories;

import com.vaadin.flow.component.dependency.CssImport;
import org.ok.milki.metadata.ui.entities.EntitiesViewBody;

import static org.ok.milki.metadata.ui.EntityType.REPOSITORY;

@CssImport("./styles/views/repositories/repositories-view-body.css")
public class RepositoriesViewBody extends EntitiesViewBody {

    public RepositoriesViewBody() {
        super(REPOSITORY);
    }
}
