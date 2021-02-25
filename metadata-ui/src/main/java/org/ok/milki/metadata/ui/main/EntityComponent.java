package org.ok.milki.metadata.ui.main;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

@CssImport("./styles/views/entity/entity-component.css")
public abstract class EntityComponent extends VerticalLayout {

    public abstract void selectedEntityChanged(String selectedEntityId);
}
