package org.ok.milki.metadata.ui.entities;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.icon.IconFactory;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

@CssImport("./styles/views/entities/entities-view-header-info.css")
public class EntitiesViewHeaderInfo extends VerticalLayout {

    private final EntitiesViewHeaderTitlePanel entitiesViewHeaderTitlePanel;
    private final EntitiesViewHeaderDescription entitiesViewHeaderDescription;

    public EntitiesViewHeaderInfo(String idPrefix, String titleText, String descriptionText, IconFactory titleIconFactory) {
        setId("entities-view-header-info");
        addClassName("entities-view-header-info");

        entitiesViewHeaderTitlePanel = new EntitiesViewHeaderTitlePanel(idPrefix, titleText, titleIconFactory);
        add(entitiesViewHeaderTitlePanel);

        entitiesViewHeaderDescription = new EntitiesViewHeaderDescription(idPrefix, descriptionText);
        add(entitiesViewHeaderDescription);
    }
}
