package org.ok.milki.metadata.ui.entity;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

import static org.ok.milki.metadata.ui.Styles.STYLES_FOLDER;

@CssImport(STYLES_FOLDER + "entity/entity-view-header-actions.css")
public class EntityViewHeaderActions extends HorizontalLayout {

    private final EntityShareButton entityShareButton;
    private final EntityExportButton entityExportButton;

    public EntityViewHeaderActions(String idPrefix, String entityName) {
        setId(idPrefix + "-view-header-actions");
        addClassName("entity-view-header-actions");

        entityShareButton = new EntityShareButton(idPrefix);
        add(entityShareButton);

        entityExportButton = new EntityExportButton(idPrefix, entityName);
        add(entityExportButton);
    }

    public void selectedEntityChanged(String selectedEntityId) {
        entityShareButton.selectedEntityChanged(selectedEntityId);
        entityExportButton.selectedEntityChanged(selectedEntityId);
    }
}
