package org.ok.milki.metadata.ui.entity;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.icon.IconFactory;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

@CssImport("./styles/views/entity/entity-view-header-info.css")
public class EntityViewHeaderInfo extends VerticalLayout {

    private final EntityViewHeaderTitlePanel entityViewHeaderTitlePanel;
    private final EntityViewHeaderDescription entityViewHeaderDescription;

    public EntityViewHeaderInfo(String idPrefix, String titleText, String descriptionText, IconFactory titleIconFactory) {
        setId("entity-view-header-info");
        addClassName("entity-view-header-info");

        entityViewHeaderTitlePanel = new EntityViewHeaderTitlePanel(idPrefix, titleText, titleIconFactory);
        add(entityViewHeaderTitlePanel);

        entityViewHeaderDescription = new EntityViewHeaderDescription(idPrefix, descriptionText);
        add(entityViewHeaderDescription);
    }
}
