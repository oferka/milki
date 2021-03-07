package org.ok.milki.metadata.ui.entities;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.KeyModifier;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.notification.Notification;

import static com.vaadin.flow.component.button.ButtonVariant.LUMO_PRIMARY;
import static com.vaadin.flow.component.notification.Notification.Position.MIDDLE;
import static org.ok.milki.metadata.ui.Styles.CSS_FILE_EXTENSION;
import static org.ok.milki.metadata.ui.Styles.STYLES_FOLDER;
import static org.ok.milki.metadata.ui.entities.EntitiesView.ENTITIES_ID_PREFIX;

@CssImport(STYLES_FOLDER + ENTITIES_ID_PREFIX + "/" + ENTITIES_ID_PREFIX + "-new-button" + CSS_FILE_EXTENSION)
public class EntitiesNewButton extends Button {

    private final String idPrefix;
    private final String entityName;

    public EntitiesNewButton(String idPrefix, String entityName) {
        this.idPrefix = idPrefix;
        this.entityName = entityName;
        setId(idPrefix + "-new-button");
        addClassName(ENTITIES_ID_PREFIX + "-new-button");

        setIcon(VaadinIcon.PLUS_CIRCLE.create());
        setText("New " + entityName);
        addThemeVariants(LUMO_PRIMARY);
        addClickListener(this::newClicked);
        addClickShortcut(Key.KEY_N, KeyModifier.ALT);
    }

    private void newClicked(ClickEvent<Button> event) {
        Notification.show("New " + entityName, 3000, MIDDLE);
    }
}
