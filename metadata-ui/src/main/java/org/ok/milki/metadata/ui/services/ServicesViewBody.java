package org.ok.milki.metadata.ui.services;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.dependency.CssImport;
import org.ok.milki.metadata.ui.entities.EntitiesViewBody;

@CssImport("./styles/views/services/services-view-body.css")
public class ServicesViewBody extends EntitiesViewBody {

    public ServicesViewBody(String idPrefix, String entityName) {
        super(idPrefix, entityName);
        add(new Text("services new"));
    }
}
