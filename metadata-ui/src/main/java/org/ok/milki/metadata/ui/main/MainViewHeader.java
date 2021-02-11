package org.ok.milki.metadata.ui.main;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

import javax.validation.constraints.NotNull;

@CssImport("./styles/views/main/main-view-header.css")
public class MainViewHeader extends HorizontalLayout {

    private final MainViewDrawerToggle mainViewDrawerToggle;
    private final MainViewTitle mainViewTitle;
    private final MainViewUserNotifications mainViewUserNotifications;
    private final MainViewUserAvatar mainViewUserAvatar;

    public MainViewHeader() {
        setId("main-view-header");
        setWidthFull();
        setSpacing(false);
        setAlignItems(FlexComponent.Alignment.CENTER);

        mainViewDrawerToggle = new MainViewDrawerToggle();
        add(mainViewDrawerToggle);

        mainViewTitle = new MainViewTitle();
        add(mainViewTitle);

        mainViewUserNotifications = new MainViewUserNotifications();
        add(mainViewUserNotifications);

        mainViewUserAvatar = new MainViewUserAvatar();
        add(mainViewUserAvatar);
    }

    public void setTitleText(@NotNull String titleText) {
        mainViewTitle.setTitleText(titleText);
    }
}
