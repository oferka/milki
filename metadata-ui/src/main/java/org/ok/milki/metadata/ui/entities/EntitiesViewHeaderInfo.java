package org.ok.milki.metadata.ui.entities;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import static org.ok.milki.metadata.ui.Styles.CSS_FILE_EXTENSION;
import static org.ok.milki.metadata.ui.Styles.STYLES_FOLDER;
import static org.ok.milki.metadata.ui.entities.EntitiesView.ENTITIES_ID_PREFIX;

@CssImport(STYLES_FOLDER + ENTITIES_ID_PREFIX + "/" + ENTITIES_ID_PREFIX + "-view-header-info" + CSS_FILE_EXTENSION)
public class EntitiesViewHeaderInfo extends VerticalLayout {

    private final EntitiesViewHeaderTitlePanel entitiesViewHeaderTitlePanel;
    private final EntitiesViewHeaderDescription entitiesViewHeaderDescription;

    public EntitiesViewHeaderInfo(String idPrefix, String titleText, int count, String descriptionText, VaadinIcon vaadinIcon) {
        setId(idPrefix + "-view-header-info");
        addClassName(ENTITIES_ID_PREFIX + "-view-header-info");

        entitiesViewHeaderTitlePanel = new EntitiesViewHeaderTitlePanel(idPrefix, titleText, count, vaadinIcon);
        add(entitiesViewHeaderTitlePanel);

        entitiesViewHeaderDescription = new EntitiesViewHeaderDescription(idPrefix, descriptionText);
        add(entitiesViewHeaderDescription);
    }
}
