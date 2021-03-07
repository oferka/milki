package org.ok.milki.metadata.ui.entities;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.H2;

import static java.lang.String.format;
import static org.ok.milki.metadata.ui.Styles.STYLES_FOLDER;

@CssImport(STYLES_FOLDER + "entities/entities-view-header-count.css")
public class EntitiesViewHeaderCount extends H2 {

    public EntitiesViewHeaderCount(String idPrefix, int count) {
        setId(idPrefix + "-view-header-count");
        addClassName("entities-view-header-count");

        setTitleText(count);
    }

    public void setTitleText(int count) {
        setText(format("(%s)", count));
    }
}
