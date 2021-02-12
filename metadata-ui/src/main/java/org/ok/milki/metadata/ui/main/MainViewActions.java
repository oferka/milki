package org.ok.milki.metadata.ui.main;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

@CssImport("./styles/views/main/main-view-actions.css")
public class MainViewActions extends HorizontalLayout {

    private final MainViewUserSettings mainViewUserSettings;
    private final MainViewUserNotifications mainViewUserNotifications;
    private final MainViewUserAvatar mainViewUserAvatar;

    public MainViewActions() {
        setId("main-view-actions");

        mainViewUserSettings = new MainViewUserSettings();
        mainViewUserNotifications = new MainViewUserNotifications();
        mainViewUserAvatar = new MainViewUserAvatar();
        add(mainViewUserSettings, mainViewUserNotifications, mainViewUserAvatar);
        setVerticalComponentAlignment(FlexComponent.Alignment.CENTER, mainViewUserSettings, mainViewUserNotifications, mainViewUserAvatar);
    }
}
