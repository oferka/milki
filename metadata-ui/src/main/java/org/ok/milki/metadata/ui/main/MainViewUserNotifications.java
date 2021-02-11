package org.ok.milki.metadata.ui.main;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.notification.Notification;

import static com.vaadin.flow.component.notification.Notification.Position.MIDDLE;

@CssImport("./styles/views/main/main-view-user-notifications.css")
public class MainViewUserNotifications extends Button {

    public MainViewUserNotifications() {
        setId("main-view-user-notifications");

        Icon notificationsIcon = VaadinIcon.BELL_O.create();
        setIcon(notificationsIcon);
        addClickListener(this::notificationsClicked);
    }

    private void notificationsClicked(ClickEvent<Button> event) {
        Notification.show("Notifications clicked", 3000, MIDDLE);
    }
}
