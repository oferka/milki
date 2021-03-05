package org.ok.milki.metadata.ui.entity;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.BeforeEvent;
import com.vaadin.flow.router.HasUrlParameter;
import org.ok.milki.metadata.ui.EntityType;

@CssImport("./styles/views/entity/entity-view.css")
public abstract class EntityView extends VerticalLayout implements HasUrlParameter<String> {

    private final EntityViewHeader entityViewHeader;
    private final EntityViewBody entityViewBody;

    public EntityView() {
        setId(getEntityType().getEntityIdPrefix() + "-view");
        addClassName("entity-view");

        setHeightFull();
        setAlignItems(FlexComponent.Alignment.CENTER);

        entityViewHeader = new EntityViewHeader(
                getEntityType().getEntityIdPrefix(),
                getEntityType().getEntityViewName(),
                getEntityType().getEntityViewDescription(),
                getEntityType().getEntityName(),
                getEntityType().getEntitiesViewIcon()
        );
        add(entityViewHeader);

        entityViewBody = getViewBody();
        add(entityViewBody);
    }

    @Override
    public void setParameter(BeforeEvent event, String parameter) {
        selectedEntityChanged(parameter);
    }

    private void selectedEntityChanged(String selectedEntityId) {
        entityViewHeader.selectedEntityChanged(selectedEntityId);
        entityViewBody.selectedEntityChanged(selectedEntityId);
    }

    protected abstract EntityType getEntityType();
    protected abstract EntityViewBody getViewBody();
}
