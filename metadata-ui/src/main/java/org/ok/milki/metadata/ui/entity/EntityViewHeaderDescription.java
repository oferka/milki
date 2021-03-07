package org.ok.milki.metadata.ui.entity;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Span;

import javax.validation.constraints.NotNull;

import static org.ok.milki.metadata.ui.Styles.CSS_FILE_EXTENSION;
import static org.ok.milki.metadata.ui.Styles.STYLES_FOLDER;

@CssImport(STYLES_FOLDER + "entity/entity-view-header-description" + CSS_FILE_EXTENSION)
public class EntityViewHeaderDescription extends Span {

    public EntityViewHeaderDescription(String idPrefix, String descriptionText) {
        setId(idPrefix + "-view-header-description");
        addClassName("entity-view-header-description");

        setDescriptionText(descriptionText);
    }

    public void setDescriptionText(@NotNull String descriptionText) {
        setText(descriptionText);
    }

    public void selectedEntityChanged(String selectedEntityId) {
        setDescriptionText(getText() + ": " + selectedEntityId);
    }
}
