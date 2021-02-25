package org.ok.milki.metadata.ui.entity;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

@CssImport("./styles/views/entity/entity-view-body.css")
public class EntityViewBody extends VerticalLayout {

    public EntityViewBody(String idPrefix, Component viewBody) {
        setId(idPrefix + "-entity-view-body");
        addClassName("entity-view-body");

        setHeightFull();
        setAlignItems(FlexComponent.Alignment.CENTER);

        add(viewBody);
    }
}
