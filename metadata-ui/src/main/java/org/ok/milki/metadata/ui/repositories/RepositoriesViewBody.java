package org.ok.milki.metadata.ui.repositories;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

@CssImport("./styles/views/repositories/repositories-view-body.css")
public class RepositoriesViewBody extends VerticalLayout {

    public RepositoriesViewBody() {
        setId("repositories-view-body");
        add(new Text("repositories new"));
    }
}
