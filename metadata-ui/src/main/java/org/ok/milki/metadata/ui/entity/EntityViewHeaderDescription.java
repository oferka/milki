package org.ok.milki.metadata.ui.entity;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Span;

import javax.validation.constraints.NotNull;

import static org.ok.milki.metadata.ui.Styles.CSS_FILE_EXTENSION;
import static org.ok.milki.metadata.ui.Styles.STYLES_FOLDER;
import static org.ok.milki.metadata.ui.entities.EntitiesView.ENTITIES_ID_PREFIX;
import static org.ok.milki.metadata.ui.entity.EntityView.ENTITY_ID_PREFIX;
import static org.ok.milki.metadata.ui.entity.EntityViewHeaderDescription.VIEW_HEADER_DESCRIPTION_ID_SUFFIX;

@CssImport(STYLES_FOLDER + ENTITY_ID_PREFIX + "/" + ENTITY_ID_PREFIX + VIEW_HEADER_DESCRIPTION_ID_SUFFIX + CSS_FILE_EXTENSION)
public class EntityViewHeaderDescription extends Span {

    public static final String VIEW_HEADER_DESCRIPTION_ID_SUFFIX = "-view-header-description";

    public EntityViewHeaderDescription(String idPrefix, String descriptionText) {
        setId(idPrefix + VIEW_HEADER_DESCRIPTION_ID_SUFFIX);
        addClassName(ENTITY_ID_PREFIX + VIEW_HEADER_DESCRIPTION_ID_SUFFIX);

        setDescriptionText(descriptionText);
    }

    public void setDescriptionText(@NotNull String descriptionText) {
        setText(descriptionText);
    }

    public void selectedEntityChanged(String selectedEntityId) {
        setDescriptionText(getText() + ": " + selectedEntityId);
    }
}
