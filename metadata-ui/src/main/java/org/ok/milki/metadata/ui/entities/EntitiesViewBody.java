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

@CssImport(STYLES_FOLDER + "entities/entities-view-body" + CSS_FILE_EXTENSION)
public abstract class EntitiesViewBody extends VerticalLayout {

    public EntitiesViewBody(String idPrefix, String entityName, Class<? extends EntityView> entityNavigationTarget) {
        setId(idPrefix + "-view-body");
        addClassName("entities-view-body");
        addClassName(idPrefix + "-view-body");

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