package org.ok.milki.metadata.ui.main;

import com.vaadin.flow.component.applayout.DrawerToggle;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

import javax.validation.constraints.NotNull;

@CssImport("./styles/views/main/main-view-header.css")
public class MainViewHeader extends HorizontalLayout {

    private final DrawerToggle drawerToggle;
    private final MainViewTitle mainViewTitle;
    private final MainViewAvatar avatar;

    public MainViewHeader() {
        setId("main-view-header");
        getThemeList().set("dark", true);
        setWidthFull();
        setSpacing(false);
        setAlignItems(FlexComponent.Alignment.CENTER);

        drawerToggle = new DrawerToggle();
        add(drawerToggle);

        mainViewTitle = new MainViewTitle();
        add(mainViewTitle);

        avatar = new MainViewAvatar();
        add(avatar);
    }

    public void setViewTitleText(@NotNull String viewTitleText) {
        mainViewTitle.setViewTitleText(viewTitleText);
    }
}
