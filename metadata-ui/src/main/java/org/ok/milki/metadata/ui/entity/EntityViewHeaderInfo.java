package org.ok.milki.metadata.ui.entity;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import static org.ok.milki.metadata.ui.Styles.STYLES_FOLDER;

@CssImport(STYLES_FOLDER + "entity/entity-view-header-info.css")
public class EntityViewHeaderInfo extends VerticalLayout {

    private final EntityViewHeaderTitlePanel entityViewHeaderTitlePanel;
    private final EntityViewHeaderDescription entityViewHeaderDescription;

    public EntityViewHeaderInfo(String idPrefix, String titleText, String descriptionText, VaadinIcon vaadinIcon) {
        setId(idPrefix + "-view-header-info");
        addClassName("entity-view-header-info");

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
