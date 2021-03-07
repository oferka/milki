package org.ok.milki.metadata.ui.entities;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

import static org.ok.milki.metadata.ui.Styles.CSS_FILE_EXTENSION;
import static org.ok.milki.metadata.ui.entities.EntitiesViewHeaderActions.VIEW_HEADER_ACTIONS_ID_SUFFIX;
import static org.ok.milki.metadata.ui.Styles.STYLES_FOLDER;
import static org.ok.milki.metadata.ui.entities.EntitiesView.ENTITIES_ID_PREFIX;

@CssImport(STYLES_FOLDER + ENTITIES_ID_PREFIX + "/" + ENTITIES_ID_PREFIX + VIEW_HEADER_ACTIONS_ID_SUFFIX + CSS_FILE_EXTENSION)
public class EntitiesViewHeaderActions extends HorizontalLayout {

    public static final String VIEW_HEADER_ACTIONS_ID_SUFFIX = "-view-header-actions";

    private final EntitiesFilterButton entitiesFilterButton;
    private final EntitiesNewButton entitiesNewButton;

    public EntitiesViewHeaderActions(String idPrefix, String entityName) {
        setId(idPrefix + VIEW_HEADER_ACTIONS_ID_SUFFIX);
        addClassName(ENTITIES_ID_PREFIX + VIEW_HEADER_ACTIONS_ID_SUFFIX);

        entitiesFilterButton = new EntitiesFilterButton(idPrefix);
        add(entitiesFilterButton);

        entitiesNewButton = new EntitiesNewButton(idPrefix, entityName);
        add(entitiesNewButton);
    }
}
