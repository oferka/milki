package org.ok.milki.metadata.ui.services;

import com.vaadin.flow.component.dependency.CssImport;
import org.ok.milki.metadata.ui.entities.EntitiesViewBody;

import static org.ok.milki.metadata.ui.EntityType.SERVICE;

@CssImport("./styles/views/services/services-view-body.css")
public class ServicesViewBody extends EntitiesViewBody {

    public ServicesViewBody() {
        super(SERVICE);
    }
}
