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
import static org.ok.milki.metadata.ui.entities.EntitiesView.ENTITIES_ID_PREFIX;
import static org.ok.milki.metadata.ui.entity.EntityView.ENTITY_ID_PREFIX;
import static org.ok.milki.metadata.ui.entity.EntityViewBody.VIEW_BODY_ID_SUFFIX;

@CssImport(STYLES_FOLDER + ENTITY_ID_PREFIX + "/" + ENTITY_ID_PREFIX + VIEW_BODY_ID_SUFFIX + CSS_FILE_EXTENSION)
public abstract class EntityViewBody extends VerticalLayout {

    public static final String VIEW_BODY_ID_SUFFIX = "-view-body";

    private final Label selectedIdLabel;
    private final RouterLink entitiesRouterLink;

    public EntityViewBody(String idPrefix, String entitiesViewName, Class<? extends EntitiesView> entitiesNavigationTarget) {
        setId(idPrefix + VIEW_BODY_ID_SUFFIX);
        addClassName(ENTITY_ID_PREFIX + VIEW_BODY_ID_SUFFIX);
        addClassName(idPrefix + VIEW_BODY_ID_SUFFIX);

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
