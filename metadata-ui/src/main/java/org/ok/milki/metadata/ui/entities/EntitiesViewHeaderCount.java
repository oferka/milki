package org.ok.milki.metadata.ui.entities;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.H2;

import static java.lang.String.format;
import static org.ok.milki.metadata.ui.Styles.CSS_FILE_EXTENSION;
import static org.ok.milki.metadata.ui.Styles.STYLES_FOLDER;
import static org.ok.milki.metadata.ui.entities.EntitiesView.ENTITIES_ID_PREFIX;

@CssImport(STYLES_FOLDER + ENTITIES_ID_PREFIX + "/" + ENTITIES_ID_PREFIX + "-view-header-count" + CSS_FILE_EXTENSION)
public class EntitiesViewHeaderCount extends H2 {

    public EntitiesViewHeaderCount(String idPrefix, int count) {
        setId(idPrefix + "-view-header-count");
        addClassName(ENTITIES_ID_PREFIX + "-view-header-count");

        setTitleText(count);
    }

    public void setTitleText(int count) {
        setText(format("(%s)", count));
    }
}
