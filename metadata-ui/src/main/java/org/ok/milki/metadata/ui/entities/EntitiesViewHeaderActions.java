package org.ok.milki.metadata.ui.entities;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

import static org.ok.milki.metadata.ui.Styles.CSS_FILE_EXTENSION;
import static org.ok.milki.metadata.ui.Styles.STYLES_FOLDER;

@CssImport(STYLES_FOLDER + "entities/entities-view-header-actions" + CSS_FILE_EXTENSION)
public class EntitiesViewHeaderActions extends HorizontalLayout {

    private final EntitiesFilterButton entitiesFilterButton;
    private final EntitiesNewButton entitiesNewButton;

    public EntitiesViewHeaderActions(String idPrefix, String entityName) {
        setId(idPrefix + "-view-header-actions");
        addClassName("entities-view-header-actions");

        entitiesFilterButton = new EntitiesFilterButton(idPrefix);
        add(entitiesFilterButton);

        entitiesNewButton = new EntitiesNewButton(idPrefix, entityName);
        add(entitiesNewButton);
    }
}
