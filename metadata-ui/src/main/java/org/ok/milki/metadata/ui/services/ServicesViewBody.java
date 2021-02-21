package org.ok.milki.metadata.ui.services;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

@CssImport("./styles/views/services/services-view-body.css")
public class ServicesViewBody extends VerticalLayout {

    public ServicesViewBody() {
        setId("services-view-body");
        add(new Text("services new"));
    }
}
