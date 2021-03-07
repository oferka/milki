package org.ok.milki.metadata.ui.entities;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.RouterLink;
import org.ok.milki.metadata.ui.EntityType;
import org.ok.milki.metadata.ui.entity.EntityView;

import static java.lang.String.valueOf;
import static org.ok.milki.metadata.ui.Styles.CSS_FILE_EXTENSION;
import static org.ok.milki.metadata.ui.Styles.STYLES_FOLDER;
import static org.ok.milki.metadata.ui.entities.EntitiesView.ENTITIES_ID_PREFIX;
import static org.ok.milki.metadata.ui.entities.EntitiesViewBody.VIEW_BODY_ID_SUFFIX;

@CssImport(STYLES_FOLDER + ENTITIES_ID_PREFIX + "/" + ENTITIES_ID_PREFIX + VIEW_BODY_ID_SUFFIX + CSS_FILE_EXTENSION)
public abstract class EntitiesViewBody extends VerticalLayout {

    public static final String VIEW_BODY_ID_SUFFIX = "-view-body";

    public EntitiesViewBody(String idPrefix, String entityName, Class<? extends EntityView> entityNavigationTarget) {
        setId(idPrefix + VIEW_BODY_ID_SUFFIX);
        addClassName(ENTITIES_ID_PREFIX + VIEW_BODY_ID_SUFFIX);
        addClassName(idPrefix + VIEW_BODY_ID_SUFFIX);

        setHeightFull();
        setAlignItems(FlexComponent.Alignment.CENTER);

        for (int i = 1; i <= 10; i++) {
            add(new RouterLink(entityName + " " + i, entityNavigationTarget, valueOf(i)));
        }
    }

    public EntitiesViewBody(EntityType entityType) {
        this(entityType.getEntityIdPrefix(), entityType.getEntityName(), entityType.getEntityViewClass());
    }
}