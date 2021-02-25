package org.ok.milki.metadata.ui.entity;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.icon.IconFactory;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.BeforeEvent;
import com.vaadin.flow.router.HasUrlParameter;
import org.ok.milki.metadata.ui.main.EntityComponent;

@CssImport("./styles/views/entity/entity-view.css")
public abstract class EntityView extends VerticalLayout implements HasUrlParameter<String> {

    private final EntityViewHeader entityViewHeader;
    private final EntityViewBody entityViewBody;

    public EntityView() {
        setId(getIdPrefix() + "-view");
        addClassName("entity-view");

        setHeightFull();
        setAlignItems(FlexComponent.Alignment.CENTER);

        entityViewHeader = new EntityViewHeader(getIdPrefix(), getViewName(), getViewDescription(), getEntityName(), getViewIconFactory());
        add(entityViewHeader);

        entityViewBody = new EntityViewBody(getIdPrefix(), getViewBody());
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

    protected abstract String getIdPrefix();
    protected abstract String getViewName();
    protected abstract String getViewDescription();
    protected abstract IconFactory getViewIconFactory();
    protected abstract String getEntityName();
    protected abstract EntityComponent getViewBody();
}
