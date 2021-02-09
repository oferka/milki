package org.ok.milki.metadata.ui.entities;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

@CssImport("./styles/views/entities/entities-view-header-info.css")
public class EntitiesViewHeaderInfo extends VerticalLayout {

    private final EntitiesViewHeaderTitle entitiesViewHeaderTitle;
    private final EntitiesViewHeaderDescription entitiesViewHeaderDescription;

    public EntitiesViewHeaderInfo(String idPrefix, String titleText, String descriptionText) {
        setId("entities-view-header-info");
        addClassName("entities-view-header-info");

        entitiesViewHeaderTitle = new EntitiesViewHeaderTitle(idPrefix, titleText);
        add(entitiesViewHeaderTitle);

        entitiesViewHeaderDescription = new EntitiesViewHeaderDescription(idPrefix, descriptionText);
        add(entitiesViewHeaderDescription);
    }
}
