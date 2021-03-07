package org.ok.milki.metadata.ui.entities;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.H2;

import javax.validation.constraints.NotNull;

import static org.ok.milki.metadata.ui.Styles.STYLES_FOLDER;

@CssImport(STYLES_FOLDER + "entities/entities-view-header-type.css")
public class EntitiesViewHeaderType extends H2 {

    public EntitiesViewHeaderType(String idPrefix, String titleText) {
        setId(idPrefix + "-view-header-type");
        addClassName("entities-view-header-type");

        setTitleText(titleText);
    }

    public void setTitleText(@NotNull String titleText) {
        setText(titleText);
    }
}
