package org.ok.milki.metadata.ui.main;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

import static org.ok.milki.metadata.ui.Styles.CSS_FILE_EXTENSION;
import static org.ok.milki.metadata.ui.Styles.STYLES_FOLDER;
import static org.ok.milki.metadata.ui.main.MainView.VIEW_ID_PREFIX;
import static org.ok.milki.metadata.ui.main.MainViewActions.VIEW_ID_SUFFIX;

@CssImport(STYLES_FOLDER + VIEW_ID_PREFIX + "/" + VIEW_ID_SUFFIX + CSS_FILE_EXTENSION)
public class MainViewActions extends HorizontalLayout {

    public static final String VIEW_ID_SUFFIX = "main-view-actions";

    private final MainViewUserHelp mainViewUserHelp;
    private final MainViewUserSettings mainViewUserSettings;
    private final MainViewUserNotifications mainViewUserNotifications;
    private final MainViewUserAvatar mainViewUserAvatar;

    public MainViewActions() {
        setId(VIEW_ID_SUFFIX);

        mainViewUserHelp = new MainViewUserHelp();
        mainViewUserSettings = new MainViewUserSettings();
        mainViewUserNotifications = new MainViewUserNotifications();
        mainViewUserAvatar = new MainViewUserAvatar();
        add(mainViewUserHelp, mainViewUserSettings, mainViewUserNotifications, mainViewUserAvatar);
        setVerticalComponentAlignment(FlexComponent.Alignment.CENTER, mainViewUserHelp, mainViewUserSettings, mainViewUserNotifications, mainViewUserAvatar);
    }
}
