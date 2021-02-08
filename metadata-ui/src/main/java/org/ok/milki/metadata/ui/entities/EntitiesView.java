package org.ok.milki.metadata.ui.entities;

import com.vaadin.flow.component.dependency.CssImport;
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

        entitiesViewHeader = new EntitiesViewHeader(getIdPrefix(), getViewName(), getEntityName());
        add(entitiesViewHeader);

        entitiesViewBody = new EntitiesViewBody(getIdPrefix());
        add(entitiesViewBody);
    }

    public abstract String getIdPrefix();
    public abstract String getViewName();
    public abstract String getEntityName();
}
