package org.ok.milki.metadata.ui.entities;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.KeyModifier;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.notification.Notification;

import static com.vaadin.flow.component.notification.Notification.Position.MIDDLE;
import static org.ok.milki.metadata.ui.Styles.STYLES_FOLDER;

@CssImport(STYLES_FOLDER + "entities/entities-filter-button.css")
public class EntitiesFilterButton extends Button {

    private final String idPrefix;

    public EntitiesFilterButton(String idPrefix) {
        this.idPrefix = idPrefix;
        setId(idPrefix + "-filter-button");
        addClassName("entities-filter-button");

        setIcon(VaadinIcon.FILTER.create());
        setText("Filter");
        addClickListener(this::filterClicked);
        addClickShortcut(Key.KEY_F, KeyModifier.ALT);
    }

    private void filterClicked(ClickEvent<Button> event) {
        Notification.show("Filter " + idPrefix, 3000, MIDDLE);
    }
}
