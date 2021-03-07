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
import static org.ok.milki.metadata.ui.main.MainView.VIEW_ID_PREFIX;
import static org.ok.milki.metadata.ui.main.MainViewUserNotifications.VIEW_ID_SUFFIX;

@CssImport(STYLES_FOLDER + VIEW_ID_PREFIX + "/" + VIEW_ID_SUFFIX + CSS_FILE_EXTENSION)
public class MainViewUserNotifications extends Button {

    public static final String VIEW_ID_SUFFIX = "main-view-user-notifications";

    public MainViewUserNotifications() {
        setId(VIEW_ID_SUFFIX);

        Icon notificationsIcon = VaadinIcon.BELL_O.create();
        setIcon(notificationsIcon);
        addClickListener(this::notificationsClicked);
    }

    private void notificationsClicked(ClickEvent<Button> event) {
        Notification.show("Notifications clicked", 3000, MIDDLE);
    }
}
