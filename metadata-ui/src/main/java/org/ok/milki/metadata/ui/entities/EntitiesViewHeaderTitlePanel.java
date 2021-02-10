package org.ok.milki.metadata.ui.entities;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.IconFactory;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

@CssImport("./styles/views/entities/entities-view-header-title-panel.css")
public class EntitiesViewHeaderTitlePanel extends HorizontalLayout {

    private final EntitiesViewHeaderTitle entitiesViewHeaderTitle;

    public EntitiesViewHeaderTitlePanel(String idPrefix, String titleText, IconFactory entitiesViewHeaderIconFactory) {
        setId(idPrefix + "-view-header-title-panel");
        addClassName("entities-view-header-title-panel");

        Icon icon = entitiesViewHeaderIconFactory.create();
        icon.setSize("60px");
        entitiesViewHeaderTitle = new EntitiesViewHeaderTitle(idPrefix, titleText);
        add(icon, entitiesViewHeaderTitle);
        setVerticalComponentAlignment(FlexComponent.Alignment.CENTER, icon, entitiesViewHeaderTitle);
    }
}
