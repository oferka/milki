package org.ok.milki.metadata.ui.entities;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

import static org.ok.milki.metadata.ui.Styles.CSS_FILE_EXTENSION;
import static org.ok.milki.metadata.ui.Styles.STYLES_FOLDER;

@CssImport(STYLES_FOLDER + "entities/entities-view-header" + CSS_FILE_EXTENSION)
public class EntitiesViewHeader extends HorizontalLayout {

    private final EntitiesViewHeaderInfo entitiesViewHeaderInfo;
    private final EntitiesViewHeaderActions entitiesViewHeaderActions;

    public EntitiesViewHeader(String idPrefix, String titleText, int count, String descriptionText, String entityName, VaadinIcon vaadinIcon) {
        setId(idPrefix + "-view-header");
        addClassName("entities-view-header");

        setWidthFull();
        setAlignItems(FlexComponent.Alignment.CENTER);

        entitiesViewHeaderInfo = new EntitiesViewHeaderInfo(idPrefix, titleText, count, descriptionText, vaadinIcon);
        add(entitiesViewHeaderInfo);

        entitiesViewHeaderActions = new EntitiesViewHeaderActions(idPrefix, entityName);
        add(entitiesViewHeaderActions);
    }
}
