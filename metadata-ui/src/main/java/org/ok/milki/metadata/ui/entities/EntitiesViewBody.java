package org.ok.milki.metadata.ui.entities;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

@CssImport("./styles/views/entities/entities-view-body.css")
public abstract class EntitiesViewBody extends VerticalLayout {

    public EntitiesViewBody(String idPrefix) {
        setId(idPrefix + "-view-body");
        addClassName("entities-view-body");

        setHeightFull();
        setAlignItems(FlexComponent.Alignment.CENTER);
    }
}
