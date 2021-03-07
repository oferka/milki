package org.ok.milki.metadata.ui.main;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

import static org.ok.milki.metadata.ui.Styles.CSS_FILE_EXTENSION;
import static org.ok.milki.metadata.ui.Styles.STYLES_FOLDER;

@CssImport(STYLES_FOLDER + "main/main-view-actions" + CSS_FILE_EXTENSION)
public class MainViewActions extends HorizontalLayout {

    private final MainViewUserHelp mainViewUserHelp;
    private final MainViewUserSettings mainViewUserSettings;
    private final MainViewUserNotifications mainViewUserNotifications;
    private final MainViewUserAvatar mainViewUserAvatar;

    public MainViewActions() {
        setId("main-view-actions");

        mainViewUserHelp = new MainViewUserHelp();
        mainViewUserSettings = new MainViewUserSettings();
        mainViewUserNotifications = new MainViewUserNotifications();
        mainViewUserAvatar = new MainViewUserAvatar();
        add(mainViewUserHelp, mainViewUserSettings, mainViewUserNotifications, mainViewUserAvatar);
        setVerticalComponentAlignment(FlexComponent.Alignment.CENTER, mainViewUserHelp, mainViewUserSettings, mainViewUserNotifications, mainViewUserAvatar);
    }
}
