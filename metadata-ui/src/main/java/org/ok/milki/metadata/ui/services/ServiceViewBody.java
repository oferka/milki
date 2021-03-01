package org.ok.milki.metadata.ui.services;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.router.RouterLink;
import org.ok.milki.metadata.ui.main.EntityViewBody;

@CssImport("./styles/views/services/service-view-body.css")
public class ServiceViewBody extends EntityViewBody {

    public ServiceViewBody(String idPrefix) {
        super(idPrefix);
        add(new RouterLink("services", ServicesView.class));
    }

    @Override
    public void selectedEntityChanged(String selectedEntityId) {
        selectedIdLabel.setText(selectedEntityId);
    }
}
