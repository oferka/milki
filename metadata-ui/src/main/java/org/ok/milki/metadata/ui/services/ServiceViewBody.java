package org.ok.milki.metadata.ui.services;

import com.vaadin.flow.component.dependency.CssImport;
import org.ok.milki.metadata.ui.entities.EntitiesView;
import org.ok.milki.metadata.ui.entity.EntityViewBody;

@CssImport("./styles/views/services/service-view-body.css")
public class ServiceViewBody extends EntityViewBody {

    public ServiceViewBody(String idPrefix, String entitiesViewName, Class<? extends EntitiesView> entitiesNavigationTarget) {
        super(idPrefix, entitiesViewName, entitiesNavigationTarget);
    }
}
