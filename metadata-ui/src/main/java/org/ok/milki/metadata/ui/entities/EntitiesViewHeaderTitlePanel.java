package org.ok.milki.metadata.ui.entities;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

import static org.ok.milki.metadata.ui.Styles.CSS_FILE_EXTENSION;
import static org.ok.milki.metadata.ui.entities.EntitiesViewHeaderTitlePanel.VIEW_HEADER_TITLE_PANEL_ID_SUFFIX;
import static org.ok.milki.metadata.ui.Styles.STYLES_FOLDER;
import static org.ok.milki.metadata.ui.entities.EntitiesView.ENTITIES_ID_PREFIX;

@CssImport(STYLES_FOLDER + ENTITIES_ID_PREFIX + "/" + ENTITIES_ID_PREFIX + VIEW_HEADER_TITLE_PANEL_ID_SUFFIX + CSS_FILE_EXTENSION)
public class EntitiesViewHeaderTitlePanel extends HorizontalLayout {

    public static final String VIEW_HEADER_TITLE_PANEL_ID_SUFFIX = "-view-header-title-panel";

    private final EntitiesViewHeaderIcon entitiesViewHeaderIcon;
    private final EntitiesViewHeaderType entitiesViewHeaderType;
    private final EntitiesViewHeaderCount entitiesViewHeaderCount;

    public EntitiesViewHeaderTitlePanel(String idPrefix, String titleText, int count, VaadinIcon vaadinIcon) {
        setId(idPrefix + VIEW_HEADER_TITLE_PANEL_ID_SUFFIX);
        addClassName(ENTITIES_ID_PREFIX + VIEW_HEADER_TITLE_PANEL_ID_SUFFIX);

        entitiesViewHeaderIcon = new EntitiesViewHeaderIcon(idPrefix, vaadinIcon);
        entitiesViewHeaderType = new EntitiesViewHeaderType(idPrefix, titleText);
        entitiesViewHeaderCount = new EntitiesViewHeaderCount(idPrefix, count);

        add(entitiesViewHeaderIcon, entitiesViewHeaderType, entitiesViewHeaderCount);
        setVerticalComponentAlignment(FlexComponent.Alignment.CENTER, entitiesViewHeaderIcon, entitiesViewHeaderType, entitiesViewHeaderCount);
    }
}
