package org.ok.milki.metadata.ui.entity;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.RouterLink;
import org.ok.milki.metadata.ui.entities.EntitiesView;

@CssImport("./styles/views/entity/entity-view-body.css")
public abstract class EntityViewBody extends VerticalLayout {

    private final Label selectedIdLabel;
    private final RouterLink entitiesRouterLink;

    public EntityViewBody(String idPrefix, String entitiesViewName, Class<? extends EntitiesView> entitiesNavigationTarget) {
        setId(idPrefix + "-view-body");
        addClassName("entity-view-body");
        addClassName(idPrefix + "-view-body");

        setHeightFull();
        setAlignItems(FlexComponent.Alignment.CENTER);

        selectedIdLabel = new Label();
        add(selectedIdLabel);

        entitiesRouterLink = new RouterLink(entitiesViewName, entitiesNavigationTarget);
        add(entitiesRouterLink);
    }

    public void selectedEntityChanged(String selectedEntityId) {
        selectedIdLabel.setText(selectedEntityId);
    }
}
