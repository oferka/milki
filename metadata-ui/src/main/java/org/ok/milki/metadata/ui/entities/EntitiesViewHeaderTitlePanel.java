package org.ok.milki.metadata.ui.entities;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

@CssImport("./styles/views/entities/entities-view-header-title-panel.css")
public class EntitiesViewHeaderTitlePanel extends HorizontalLayout {

    private final EntitiesViewHeaderIcon entitiesViewHeaderIcon;
    private final EntitiesViewHeaderTitle entitiesViewHeaderTitle;

    public EntitiesViewHeaderTitlePanel(String idPrefix, String titleText, VaadinIcon vaadinIcon) {
        setId(idPrefix + "-view-header-title-panel");
        addClassName("entities-view-header-title-panel");

        entitiesViewHeaderIcon = new EntitiesViewHeaderIcon(idPrefix, vaadinIcon);
        entitiesViewHeaderTitle = new EntitiesViewHeaderTitle(idPrefix, titleText);

        add(entitiesViewHeaderIcon, entitiesViewHeaderTitle);
        setVerticalComponentAlignment(FlexComponent.Alignment.CENTER, entitiesViewHeaderIcon, entitiesViewHeaderTitle);
    }
}
