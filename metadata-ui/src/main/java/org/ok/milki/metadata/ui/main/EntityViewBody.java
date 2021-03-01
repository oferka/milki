package org.ok.milki.metadata.ui.main;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

@CssImport("./styles/views/entity/entity-view-body.css")
public abstract class EntityViewBody extends VerticalLayout {

    public EntityViewBody(String idPrefix) {
        setId(idPrefix + "-view-body");
        addClassName("entity-view-body");
        addClassName(idPrefix + "-view-body");
    }

    public abstract void selectedEntityChanged(String selectedEntityId);
}
