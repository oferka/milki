package org.ok.milki.metadata.ui.entities;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Span;

import javax.validation.constraints.NotNull;

@CssImport("./styles/views/entities/entities-view-header-description.css")
public class EntitiesViewHeaderDescription extends Span {

    public EntitiesViewHeaderDescription(String idPrefix, String descriptionText) {
        setId(idPrefix + "-view-header-description");
        addClassName("entities-view-header-description");

        setDescriptionText(descriptionText);
    }

    public void setDescriptionText(@NotNull String descriptionText) {
        setText(descriptionText);
    }
}
