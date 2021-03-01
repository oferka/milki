package org.ok.milki.metadata.ui.entity;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

@CssImport("./styles/views/entity/entity-view-body.css")
public class EntityViewBody extends VerticalLayout {

    private final org.ok.milki.metadata.ui.main.EntityViewBody entityViewBody;

    public EntityViewBody(String idPrefix, org.ok.milki.metadata.ui.main.EntityViewBody entityViewBody) {
        this.entityViewBody = entityViewBody;
        setId(idPrefix + "-entity-view-body");
        addClassName("entity-view-body");

        setHeightFull();
        setAlignItems(FlexComponent.Alignment.CENTER);

        add(entityViewBody);
    }

    public void selectedEntityChanged(String selectedEntityId) {
        entityViewBody.selectedEntityChanged(selectedEntityId);
    }
}
