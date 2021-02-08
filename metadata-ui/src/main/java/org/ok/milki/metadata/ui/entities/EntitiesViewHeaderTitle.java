package org.ok.milki.metadata.ui.entities;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.H2;

import javax.validation.constraints.NotNull;

@CssImport("./styles/views/entities/entities-view-header-title.css")
public class EntitiesViewHeaderTitle extends H2 {

    public EntitiesViewHeaderTitle(String idPrefix, String titleText) {
        setId(idPrefix + "-view-header-title");
        addClassName("entities-view-header-title");

        setTitleText(titleText);
    }

    public void setTitleText(@NotNull String titleText) {
        setText(titleText);
    }
}
