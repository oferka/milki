package org.ok.milki.metadata.ui.entity;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

import static org.ok.milki.metadata.ui.Styles.STYLES_FOLDER;

@CssImport(STYLES_FOLDER + "entity/entity-view-header-title-panel.css")
public class EntityViewHeaderTitlePanel extends HorizontalLayout {

    private final EntityViewHeaderIcon entityViewHeaderIcon;
    private final EntityViewHeaderTitle entityViewHeaderTitle;

    public EntityViewHeaderTitlePanel(String idPrefix, String titleText, VaadinIcon vaadinIcon) {
        setId(idPrefix + "-view-header-title-panel");
        addClassName("entity-view-header-title-panel");

        entityViewHeaderIcon = new EntityViewHeaderIcon(idPrefix, vaadinIcon);
        entityViewHeaderTitle = new EntityViewHeaderTitle(idPrefix, titleText);

        add(entityViewHeaderIcon, entityViewHeaderTitle);
        setVerticalComponentAlignment(FlexComponent.Alignment.CENTER, entityViewHeaderIcon, entityViewHeaderTitle);
    }

    public void selectedEntityChanged(String selectedEntityId) {
        entityViewHeaderIcon.selectedEntityChanged(selectedEntityId);
        entityViewHeaderTitle.selectedEntityChanged(selectedEntityId);
    }
}
