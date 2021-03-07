package org.ok.milki.metadata.ui.entity;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;

import static org.ok.milki.metadata.ui.Styles.STYLES_FOLDER;

@CssImport(STYLES_FOLDER + "entity/entity-view-header-icon.css")
public class EntityViewHeaderIcon extends Icon {

    public EntityViewHeaderIcon(String idPrefix, VaadinIcon vaadinIcon) {
        super(vaadinIcon);
        setSize("60px");
        setId(idPrefix + "-view-header-icon");
        addClassName("entity-view-header-icon");
    }

    public void selectedEntityChanged(String selectedEntityId) {
        System.out.println(selectedEntityId);
    }
}
