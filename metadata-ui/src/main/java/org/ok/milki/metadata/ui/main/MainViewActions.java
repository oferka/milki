package org.ok.milki.metadata.ui.main;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

@CssImport("./styles/views/main/main-view-actions.css")
public class MainViewActions extends HorizontalLayout {

    private final MainViewUserNotifications mainViewUserNotifications;
    private final MainViewUserAvatar mainViewUserAvatar;

    public MainViewActions() {
        setId("main-view-actions");

        mainViewUserNotifications = new MainViewUserNotifications();
        mainViewUserAvatar = new MainViewUserAvatar();
        add(mainViewUserNotifications, mainViewUserAvatar);
        setVerticalComponentAlignment(FlexComponent.Alignment.CENTER, mainViewUserNotifications, mainViewUserAvatar);
    }
}
