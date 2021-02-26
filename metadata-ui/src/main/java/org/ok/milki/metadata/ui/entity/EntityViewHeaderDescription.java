package org.ok.milki.metadata.ui.entity;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Span;

import javax.validation.constraints.NotNull;

@CssImport("./styles/views/entity/entity-view-header-description.css")
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
