package org.ok.milki.metadata.ui.main;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

@CssImport("./styles/views/entity/entity-view-body.css")
public abstract class EntityViewBody extends VerticalLayout {

    protected final Label selectedIdLabel;

    public EntityViewBody(String idPrefix) {
        setId(idPrefix + "-view-body");
        addClassName("entity-view-body");
        addClassName(idPrefix + "-view-body");

        selectedIdLabel = new Label("something meaningless");
        add(selectedIdLabel);
    }

    public abstract void selectedEntityChanged(String selectedEntityId);
}
