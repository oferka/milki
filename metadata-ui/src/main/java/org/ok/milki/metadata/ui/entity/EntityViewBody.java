package org.ok.milki.metadata.ui.entity;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.RouterLink;
import org.ok.milki.metadata.ui.accounts.AccountsView;

@CssImport("./styles/views/entity/entity-view-body.css")
public abstract class EntityViewBody extends VerticalLayout {

    protected final Label selectedIdLabel;
    protected final RouterLink entitiesRouterLink;

    public EntityViewBody(String idPrefix, String entitiesViewName) {
        setId(idPrefix + "-view-body");
        addClassName("entity-view-body");
        addClassName(idPrefix + "-view-body");

        setHeightFull();
        setAlignItems(FlexComponent.Alignment.CENTER);

        selectedIdLabel = new Label("something meaningless");
        add(selectedIdLabel);

        entitiesRouterLink = new RouterLink(entitiesViewName, AccountsView.class);
        add(entitiesRouterLink);
    }

    public abstract void selectedEntityChanged(String selectedEntityId);
}
