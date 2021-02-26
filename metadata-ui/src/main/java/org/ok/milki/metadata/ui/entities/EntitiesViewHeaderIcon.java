package org.ok.milki.metadata.ui.entities;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;

@CssImport("./styles/views/entities/entities-view-header-icon.css")
public class EntitiesViewHeaderIcon extends Icon {

    public EntitiesViewHeaderIcon(String idPrefix, VaadinIcon vaadinIcon) {
        super(vaadinIcon);
        setSize("60px");
        setId(idPrefix + "-view-header-icon");
        addClassName("entities-view-header-icon");
    }
}
