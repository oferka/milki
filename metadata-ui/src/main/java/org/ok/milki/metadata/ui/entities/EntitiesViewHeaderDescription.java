package org.ok.milki.metadata.ui.entities;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Span;

import javax.validation.constraints.NotNull;

import static org.ok.milki.metadata.ui.Styles.CSS_FILE_EXTENSION;
import static org.ok.milki.metadata.ui.Styles.STYLES_FOLDER;
import static org.ok.milki.metadata.ui.entities.EntitiesView.ENTITIES_ID_PREFIX;

@CssImport(STYLES_FOLDER + ENTITIES_ID_PREFIX + "/" + ENTITIES_ID_PREFIX + "-view-header-description" + CSS_FILE_EXTENSION)
public class EntitiesViewHeaderDescription extends Span {

    public EntitiesViewHeaderDescription(String idPrefix, String descriptionText) {
        setId(idPrefix + "-view-header-description");
        addClassName(ENTITIES_ID_PREFIX + "-view-header-description");

        setDescriptionText(descriptionText);
    }

    public void setDescriptionText(@NotNull String descriptionText) {
        setText(descriptionText);
    }
}
