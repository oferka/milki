package org.ok.milki.metadata.ui.repositories;

import com.vaadin.flow.component.dependency.CssImport;
import org.ok.milki.metadata.ui.entities.EntitiesViewBody;
import org.ok.milki.metadata.ui.entity.EntityView;

@CssImport("./styles/views/repositories/repositories-view-body.css")
public class RepositoriesViewBody extends EntitiesViewBody {

    public RepositoriesViewBody(String idPrefix, String entityName, Class<? extends EntityView> entityNavigationTarget) {
        super(idPrefix, entityName, entityNavigationTarget);
    }
}
