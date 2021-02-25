package org.ok.milki.metadata.ui.entity;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import org.ok.milki.metadata.ui.main.EntityComponent;

@CssImport("./styles/views/entity/entity-view-body.css")
public class EntityViewBody extends VerticalLayout {

    private final EntityComponent entityComponent;

    public EntityViewBody(String idPrefix, EntityComponent entityComponent) {
        this.entityComponent = entityComponent;
        setId(idPrefix + "-entity-view-body");
        addClassName("entity-view-body");

        setHeightFull();
        setAlignItems(FlexComponent.Alignment.CENTER);

        add(entityComponent);
    }

    public void selectedEntityChanged(String selectedEntityId) {
        entityComponent.selectedEntityChanged(selectedEntityId);
    }
}
