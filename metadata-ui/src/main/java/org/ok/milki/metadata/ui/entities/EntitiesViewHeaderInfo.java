package org.ok.milki.metadata.ui.entities;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import static org.ok.milki.metadata.ui.Styles.CSS_FILE_EXTENSION;
import static org.ok.milki.metadata.ui.Styles.STYLES_FOLDER;

@CssImport(STYLES_FOLDER + "entities/entities-view-header-info" + CSS_FILE_EXTENSION)
public class EntitiesViewHeaderInfo extends VerticalLayout {

    private final EntitiesViewHeaderTitlePanel entitiesViewHeaderTitlePanel;
    private final EntitiesViewHeaderDescription entitiesViewHeaderDescription;

    public EntitiesViewHeaderInfo(String idPrefix, String titleText, int count, String descriptionText, VaadinIcon vaadinIcon) {
        setId(idPrefix + "-view-header-info");
        addClassName("entities-view-header-info");

        entitiesViewHeaderTitlePanel = new EntitiesViewHeaderTitlePanel(idPrefix, titleText, count, vaadinIcon);
        add(entitiesViewHeaderTitlePanel);

        entitiesViewHeaderDescription = new EntitiesViewHeaderDescription(idPrefix, descriptionText);
        add(entitiesViewHeaderDescription);
    }
}
