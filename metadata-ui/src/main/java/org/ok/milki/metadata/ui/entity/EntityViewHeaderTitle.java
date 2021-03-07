package org.ok.milki.metadata.ui.entity;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.H2;

import javax.validation.constraints.NotNull;

import static org.ok.milki.metadata.ui.Styles.STYLES_FOLDER;

@CssImport(STYLES_FOLDER + "entity/entity-view-header-title.css")
public class EntityViewHeaderTitle extends H2 {

    public EntityViewHeaderTitle(String idPrefix, String titleText) {
        setId(idPrefix + "-view-header-title");
        addClassName("entity-view-header-title");

        setTitleText(titleText);
    }

    public void setTitleText(@NotNull String titleText) {
        setText(titleText);
    }

    public void selectedEntityChanged(String selectedEntityId) {
        setTitleText(selectedEntityId);
    }
}
