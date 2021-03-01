package org.ok.milki.metadata.ui.entities;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

@CssImport("./styles/views/entities/entities-view.css")
public abstract class EntitiesView extends VerticalLayout {

    private final EntitiesViewHeader entitiesViewHeader;
    private final EntitiesViewBody entitiesViewBody;

    public EntitiesView() {
        setId(getIdPrefix() + "-view");
        addClassName("entities-view");

        setHeightFull();
        setAlignItems(FlexComponent.Alignment.CENTER);

        entitiesViewHeader = new EntitiesViewHeader(getIdPrefix(), getViewName(), getEntityCount(), getViewDescription(), getEntityName(), getViewIcon());
        add(entitiesViewHeader);

        entitiesViewBody = new EntitiesViewBody(getIdPrefix(), getViewBody());
        add(entitiesViewBody);
    }

    protected abstract String getIdPrefix();
    protected abstract String getViewName();
    protected abstract int getEntityCount();
    protected abstract String getViewDescription();
    protected abstract VaadinIcon getViewIcon();
    protected abstract String getEntityName();
    protected abstract Component getViewBody();
}
