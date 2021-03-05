package org.ok.milki.metadata.ui.services;

import com.vaadin.flow.component.dependency.CssImport;
import org.ok.milki.metadata.ui.entity.EntityViewBody;

import static org.ok.milki.metadata.ui.EntityType.SERVICE;

@CssImport("./styles/views/services/service-view-body.css")
public class ServiceViewBody extends EntityViewBody {

    public ServiceViewBody() {
        super(SERVICE);
    }
}
