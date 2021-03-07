package org.ok.milki.metadata.ui.main;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.notification.Notification;

import static com.vaadin.flow.component.notification.Notification.Position.MIDDLE;
import static org.ok.milki.metadata.ui.Styles.CSS_FILE_EXTENSION;
import static org.ok.milki.metadata.ui.Styles.STYLES_FOLDER;

@CssImport(STYLES_FOLDER + "main/main-view-user-settings" + CSS_FILE_EXTENSION)
public class MainViewUserSettings extends Button {

    public MainViewUserSettings() {
        setId("main-view-user-settings");

        Icon settingsIcon = VaadinIcon.COG_O.create();
        setIcon(settingsIcon);
        addClickListener(this::settingsClicked);
    }

    private void settingsClicked(ClickEvent<Button> event) {
        Notification.show("Settings clicked", 3000, MIDDLE);
    }
}
