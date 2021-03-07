package org.ok.milki.metadata.ui.entities;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

import static org.ok.milki.metadata.ui.Styles.CSS_FILE_EXTENSION;
import static org.ok.milki.metadata.ui.Styles.STYLES_FOLDER;
import static org.ok.milki.metadata.ui.entities.EntitiesView.ENTITIES_ID_PREFIX;

@CssImport(STYLES_FOLDER + ENTITIES_ID_PREFIX + "/" + ENTITIES_ID_PREFIX + "-view-header-actions" + CSS_FILE_EXTENSION)
public class EntitiesViewHeaderActions extends HorizontalLayout {

    private final EntitiesFilterButton entitiesFilterButton;
    private final EntitiesNewButton entitiesNewButton;

    public EntitiesViewHeaderActions(String idPrefix, String entityName) {
        setId(idPrefix + "-view-header-actions");
        addClassName(ENTITIES_ID_PREFIX + "-view-header-actions");

        entitiesFilterButton = new EntitiesFilterButton(idPrefix);
        add(entitiesFilterButton);

        entitiesNewButton = new EntitiesNewButton(idPrefix, entityName);
        add(entitiesNewButton);
    }
}
