package org.ok.milki.metadata.ui.entities;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

@CssImport("./styles/views/entities/entities-view-header.css")
public class EntitiesViewHeader extends HorizontalLayout {

    private final EntitiesViewHeaderInfo entitiesViewHeaderInfo;
    private final EntitiesViewHeaderActions entitiesViewHeaderActions;

    public EntitiesViewHeader(String idPrefix, String titleText, String entityName) {
        setId("entities-view-header");
        addClassName("entities-view-header");

        setWidthFull();
        setAlignItems(FlexComponent.Alignment.CENTER);

        entitiesViewHeaderInfo = new EntitiesViewHeaderInfo(idPrefix, titleText, "bla bla bla bla bla");
        add(entitiesViewHeaderInfo);

        entitiesViewHeaderActions = new EntitiesViewHeaderActions(idPrefix, entityName);
        add(entitiesViewHeaderActions);
    }
}
