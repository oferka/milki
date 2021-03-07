package org.ok.milki.metadata.ui.entities;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;

import static org.ok.milki.metadata.ui.Styles.CSS_FILE_EXTENSION;
import static org.ok.milki.metadata.ui.Styles.STYLES_FOLDER;
import static org.ok.milki.metadata.ui.entities.EntitiesView.ENTITIES_ID_PREFIX;
import static org.ok.milki.metadata.ui.entities.EntitiesViewHeaderIcon.VIEW_HEADER_ICON_ID_SUFFIX;

@CssImport(STYLES_FOLDER + ENTITIES_ID_PREFIX + "/" + ENTITIES_ID_PREFIX + VIEW_HEADER_ICON_ID_SUFFIX + CSS_FILE_EXTENSION)
public class EntitiesViewHeaderIcon extends Icon {

    public static final String VIEW_HEADER_ICON_ID_SUFFIX = "-view-header-icon";

    public EntitiesViewHeaderIcon(String idPrefix, VaadinIcon vaadinIcon) {
        super(vaadinIcon);
        setSize("60px");
        setId(idPrefix + VIEW_HEADER_ICON_ID_SUFFIX);
        addClassName(ENTITIES_ID_PREFIX + VIEW_HEADER_ICON_ID_SUFFIX);
    }
}
