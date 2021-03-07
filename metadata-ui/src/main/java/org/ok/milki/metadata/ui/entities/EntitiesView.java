package org.ok.milki.metadata.ui.entities;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import org.ok.milki.metadata.ui.EntityType;

import static org.ok.milki.metadata.ui.Styles.STYLES_FOLDER;

@CssImport(STYLES_FOLDER + "entities/entities-view.css")
public abstract class EntitiesView extends VerticalLayout {

    private final EntitiesViewHeader entitiesViewHeader;
    private final EntitiesViewBody entitiesViewBody;

    public EntitiesView() {
        setId(getEntityType().getEntitiesIdPrefix() + "-view");
        addClassName("entities-view");

        setHeightFull();
        setAlignItems(FlexComponent.Alignment.CENTER);

        entitiesViewHeader = new EntitiesViewHeader(
                getEntityType().getEntitiesIdPrefix(),
                getEntityType().getEntitiesViewName(),
                getEntityType().getEntityCount(),
                getEntityType().getEntitiesViewDescription(),
                getEntityType().getEntityName(),
                getEntityType().getEntitiesViewIcon()
        );
        add(entitiesViewHeader);

        entitiesViewBody = getViewBody();
        add(entitiesViewBody);
    }

    protected abstract EntityType getEntityType();
    protected abstract EntitiesViewBody getViewBody();
}
