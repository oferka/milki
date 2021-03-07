package org.ok.milki.metadata.ui.entity;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.RouterLink;
import org.ok.milki.metadata.ui.EntityType;
import org.ok.milki.metadata.ui.entities.EntitiesView;

import static org.ok.milki.metadata.ui.Styles.CSS_FILE_EXTENSION;
import static org.ok.milki.metadata.ui.Styles.STYLES_FOLDER;

@CssImport(STYLES_FOLDER + "entity/entity-view-body" + CSS_FILE_EXTENSION)
public abstract class EntityViewBody extends VerticalLayout {

    public static final String VIEW_BODY_ID_SUFFIX = "-view-body";

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

    public EntityViewBody(EntityType entityType) {
        this(entityType.getEntityIdPrefix(), entityType.getEntitiesViewName(), entityType.getEntitiesViewClass());
    }

    public void selectedEntityChanged(String selectedEntityId) {
        selectedIdLabel.setText(selectedEntityId);
    }
}
