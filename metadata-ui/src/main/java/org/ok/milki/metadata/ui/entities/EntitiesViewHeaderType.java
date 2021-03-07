package org.ok.milki.metadata.ui.entities;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.H2;

import javax.validation.constraints.NotNull;

import static org.ok.milki.metadata.ui.Styles.CSS_FILE_EXTENSION;
import static org.ok.milki.metadata.ui.entities.EntitiesViewHeaderType.VIEW_HEADER_TYPE_ID_SUFFIX;
import static org.ok.milki.metadata.ui.Styles.STYLES_FOLDER;
import static org.ok.milki.metadata.ui.entities.EntitiesView.ENTITIES_ID_PREFIX;

@CssImport(STYLES_FOLDER + ENTITIES_ID_PREFIX + "/" + ENTITIES_ID_PREFIX  + VIEW_HEADER_TYPE_ID_SUFFIX + CSS_FILE_EXTENSION)
public class EntitiesViewHeaderType extends H2 {

    public static final String VIEW_HEADER_TYPE_ID_SUFFIX = "-view-header-type";

    public EntitiesViewHeaderType(String idPrefix, String titleText) {
        setId(idPrefix + VIEW_HEADER_TYPE_ID_SUFFIX);
        addClassName(ENTITIES_ID_PREFIX + VIEW_HEADER_TYPE_ID_SUFFIX);

        setTitleText(titleText);
    }

    public void setTitleText(@NotNull String titleText) {
        setText(titleText);
    }
}
