package org.ok.milki.metadata.ui.main;

import com.vaadin.flow.component.avatar.Avatar;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.dom.DomEvent;

import static com.vaadin.flow.component.notification.Notification.Position.MIDDLE;

@CssImport("./styles/views/main/main-view-user-avatar.css")
public class MainViewUserAvatar extends Avatar {

    public MainViewUserAvatar() {
        setId("main-view-user-avatar");

        setImage("images/Ofer Karp.png");
        setName("Ofer Karp");

//        getElement().addEventListener("click", e -> {
//            avatarClicked(e);
//            Notification.show("User avatar clicked", 3000, MIDDLE);
//        });

        getElement().addEventListener("click", this::avatarClicked);
    }

    private void avatarClicked(DomEvent event) {
        Notification.show("User avatar clicked", 3000, MIDDLE);
    }
}
