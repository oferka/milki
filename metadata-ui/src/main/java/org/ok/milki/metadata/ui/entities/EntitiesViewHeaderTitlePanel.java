package org.ok.milki.metadata.ui.entities;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

import static org.ok.milki.metadata.ui.Styles.CSS_FILE_EXTENSION;
import static org.ok.milki.metadata.ui.Styles.STYLES_FOLDER;

@CssImport(STYLES_FOLDER + "entities/entities-view-header-title-panel" + CSS_FILE_EXTENSION)
public class EntitiesViewHeaderTitlePanel extends HorizontalLayout {

    private final EntitiesViewHeaderIcon entitiesViewHeaderIcon;
    private final EntitiesViewHeaderType entitiesViewHeaderType;
    private final EntitiesViewHeaderCount entitiesViewHeaderCount;

    public EntitiesViewHeaderTitlePanel(String idPrefix, String titleText, int count, VaadinIcon vaadinIcon) {
        setId(idPrefix + "-view-header-title-panel");
        addClassName("entities-view-header-title-panel");

        entitiesViewHeaderIcon = new EntitiesViewHeaderIcon(idPrefix, vaadinIcon);
        entitiesViewHeaderType = new EntitiesViewHeaderType(idPrefix, titleText);
        entitiesViewHeaderCount = new EntitiesViewHeaderCount(idPrefix, count);

        add(entitiesViewHeaderIcon, entitiesViewHeaderType, entitiesViewHeaderCount);
        setVerticalComponentAlignment(FlexComponent.Alignment.CENTER, entitiesViewHeaderIcon, entitiesViewHeaderType, entitiesViewHeaderCount);
    }
}
