package org.ok.milki.metadata.ui.entities;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import org.ok.milki.metadata.ui.EntityType;

import static org.ok.milki.metadata.ui.Styles.CSS_FILE_EXTENSION;
import static org.ok.milki.metadata.ui.Styles.STYLES_FOLDER;
import static org.ok.milki.metadata.ui.entities.EntitiesView.ENTITIES_ID_PREFIX;
import static org.ok.milki.metadata.ui.entities.EntitiesView.VIEW_ID_SUFFIX;

@CssImport(STYLES_FOLDER + ENTITIES_ID_PREFIX + "/" + ENTITIES_ID_PREFIX + VIEW_ID_SUFFIX + CSS_FILE_EXTENSION)
public abstract class EntitiesView extends VerticalLayout {

    public static final String ENTITIES_ID_PREFIX = "entities";
    public static final String VIEW_ID_SUFFIX = "-view";

    private final EntitiesViewHeader entitiesViewHeader;
    private final EntitiesViewBody entitiesViewBody;

    public EntitiesView() {
        setId(getEntityType().getEntitiesIdPrefix() + VIEW_ID_SUFFIX);
        addClassName(ENTITIES_ID_PREFIX + VIEW_ID_SUFFIX);

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
