package org.ok.milki.metadata.ui.entity;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.icon.IconFactory;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

@CssImport("./styles/views/entity/entity-view-header.css")
public class EntityViewHeader extends HorizontalLayout {

    private final EntityViewHeaderInfo entityViewHeaderInfo;
    private final EntityViewHeaderActions entityViewHeaderActions;

    public EntityViewHeader(String idPrefix, String titleText, String descriptionText, String entityName, IconFactory titleIconFactory) {
        setId("entity-view-header");
        addClassName("entity-view-header");

        setWidthFull();
        setAlignItems(FlexComponent.Alignment.CENTER);

        entityViewHeaderInfo = new EntityViewHeaderInfo(idPrefix, titleText, descriptionText, titleIconFactory);
        add(entityViewHeaderInfo);

        entityViewHeaderActions = new EntityViewHeaderActions(idPrefix, entityName);
        add(entityViewHeaderActions);
    }
}
