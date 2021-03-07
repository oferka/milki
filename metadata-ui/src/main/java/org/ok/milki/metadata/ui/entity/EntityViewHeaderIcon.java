package org.ok.milki.metadata.ui.entity;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;

import static org.ok.milki.metadata.ui.Styles.CSS_FILE_EXTENSION;
import static org.ok.milki.metadata.ui.Styles.STYLES_FOLDER;
import static org.ok.milki.metadata.ui.entity.EntityView.ENTITY_ID_PREFIX;
import static org.ok.milki.metadata.ui.entity.EntityViewHeaderIcon.VIEW_HEADER_ICON_ID_SUFFIX;

@CssImport(STYLES_FOLDER + ENTITY_ID_PREFIX + "/" + ENTITY_ID_PREFIX + VIEW_HEADER_ICON_ID_SUFFIX + CSS_FILE_EXTENSION)
public class EntityViewHeaderIcon extends Icon {

    public static final String VIEW_HEADER_ICON_ID_SUFFIX = "-view-header-icon";

    public EntityViewHeaderIcon(String idPrefix, VaadinIcon vaadinIcon) {
        super(vaadinIcon);
        setSize("60px");
        setId(idPrefix + VIEW_HEADER_ICON_ID_SUFFIX);
        addClassName(ENTITY_ID_PREFIX + VIEW_HEADER_ICON_ID_SUFFIX);
    }

    public void selectedEntityChanged(String selectedEntityId) {
        System.out.println(selectedEntityId);
    }
}
