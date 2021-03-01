package org.ok.milki.metadata.ui.services;

import com.vaadin.flow.component.dependency.CssImport;
import org.ok.milki.metadata.ui.entities.EntitiesViewBody;
import org.ok.milki.metadata.ui.entity.EntityView;

@CssImport("./styles/views/services/services-view-body.css")
public class ServicesViewBody extends EntitiesViewBody {

    public ServicesViewBody(String idPrefix, String entityName, Class<? extends EntityView> entityNavigationTarget) {
        super(idPrefix, entityName, entityNavigationTarget);
    }
}
