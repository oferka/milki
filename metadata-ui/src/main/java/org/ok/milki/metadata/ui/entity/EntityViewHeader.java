package org.ok.milki.metadata.ui.entity;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

import static org.ok.milki.metadata.ui.Styles.CSS_FILE_EXTENSION;
import static org.ok.milki.metadata.ui.Styles.STYLES_FOLDER;

@CssImport(STYLES_FOLDER + "entity/entity-view-header" + CSS_FILE_EXTENSION)
public class EntityViewHeader extends HorizontalLayout {

    private final EntityViewHeaderInfo entityViewHeaderInfo;
    private final EntityViewHeaderActions entityViewHeaderActions;

    public EntityViewHeader(String idPrefix, String titleText, String descriptionText, String entityName, VaadinIcon vaadinIcon) {
        setId(idPrefix + "-view-header");
        addClassName("entity-view-header");

        setWidthFull();
        setAlignItems(FlexComponent.Alignment.CENTER);

        entityViewHeaderInfo = new EntityViewHeaderInfo(idPrefix, titleText, descriptionText, vaadinIcon);
        add(entityViewHeaderInfo);

        entityViewHeaderActions = new EntityViewHeaderActions(idPrefix, entityName);
        add(entityViewHeaderActions);
    }

    public void selectedEntityChanged(String selectedEntityId) {
        entityViewHeaderInfo.selectedEntityChanged(selectedEntityId);
        entityViewHeaderActions.selectedEntityChanged(selectedEntityId);
    }
}
