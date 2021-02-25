package org.ok.milki.metadata.ui.entity;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.IconFactory;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

@CssImport("./styles/views/entity/entity-view-header-title-panel.css")
public class EntityViewHeaderTitlePanel extends HorizontalLayout {

    private final EntityViewHeaderTitle entityViewHeaderTitle;

    public EntityViewHeaderTitlePanel(String idPrefix, String titleText, IconFactory entityViewHeaderIconFactory) {
        setId(idPrefix + "-view-header-title-panel");
        addClassName("entity-view-header-title-panel");

        Icon icon = entityViewHeaderIconFactory.create();
        icon.setSize("60px");
        entityViewHeaderTitle = new EntityViewHeaderTitle(idPrefix, titleText);
        add(icon, entityViewHeaderTitle);
        setVerticalComponentAlignment(FlexComponent.Alignment.CENTER, icon, entityViewHeaderTitle);
    }

    public void selectedEntityChanged(String selectedEntityId) {
        entityViewHeaderTitle.selectedEntityChanged(selectedEntityId);
    }
}
