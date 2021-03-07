package org.ok.milki.metadata.ui.entity;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import static org.ok.milki.metadata.ui.Styles.CSS_FILE_EXTENSION;
import static org.ok.milki.metadata.ui.Styles.STYLES_FOLDER;
import static org.ok.milki.metadata.ui.entities.EntitiesView.ENTITIES_ID_PREFIX;
import static org.ok.milki.metadata.ui.entity.EntityView.ENTITY_ID_PREFIX;
import static org.ok.milki.metadata.ui.entity.EntityViewHeaderInfo.VIEW_HEADER_INFO_ID_SUFFIX;

@CssImport(STYLES_FOLDER + ENTITY_ID_PREFIX + "/" + ENTITY_ID_PREFIX + VIEW_HEADER_INFO_ID_SUFFIX + CSS_FILE_EXTENSION)
public class EntityViewHeaderInfo extends VerticalLayout {

    public static final String VIEW_HEADER_INFO_ID_SUFFIX = "-view-header-info";

    private final EntityViewHeaderTitlePanel entityViewHeaderTitlePanel;
    private final EntityViewHeaderDescription entityViewHeaderDescription;

    public EntityViewHeaderInfo(String idPrefix, String titleText, String descriptionText, VaadinIcon vaadinIcon) {
        setId(idPrefix + VIEW_HEADER_INFO_ID_SUFFIX);
        addClassName(ENTITY_ID_PREFIX + VIEW_HEADER_INFO_ID_SUFFIX);

        entityViewHeaderTitlePanel = new EntityViewHeaderTitlePanel(idPrefix, titleText, vaadinIcon);
        add(entityViewHeaderTitlePanel);

        entityViewHeaderDescription = new EntityViewHeaderDescription(idPrefix, descriptionText);
        add(entityViewHeaderDescription);
    }

    public void selectedEntityChanged(String selectedEntityId) {
        entityViewHeaderTitlePanel.selectedEntityChanged(selectedEntityId);
        entityViewHeaderDescription.selectedEntityChanged(selectedEntityId);
    }
}
