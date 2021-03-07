package org.ok.milki.metadata.ui.entity;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.KeyModifier;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.notification.Notification;

import static com.vaadin.flow.component.button.ButtonVariant.LUMO_PRIMARY;
import static com.vaadin.flow.component.notification.Notification.Position.MIDDLE;
import static org.ok.milki.metadata.ui.Styles.STYLES_FOLDER;

@CssImport(STYLES_FOLDER + "entity/entity-export-button.css")
public class EntityExportButton extends Button {

    private final String idPrefix;
    private final String entityName;

    public EntityExportButton(String idPrefix, String entityName) {
        this.idPrefix = idPrefix;
        this.entityName = entityName;
        setId(idPrefix + "-export-button");
        addClassName("entity-export-button");

        setIcon(VaadinIcon.DOWNLOAD.create());
        setText("Export " + entityName);
        addThemeVariants(LUMO_PRIMARY);
        addClickListener(this::exportClicked);
        addClickShortcut(Key.KEY_E, KeyModifier.ALT);
    }

    private void exportClicked(ClickEvent<Button> event) {
        Notification.show("Export " + entityName, 3000, MIDDLE);
    }

    public void selectedEntityChanged(String selectedEntityId) {
        System.out.println(selectedEntityId);
    }
}
