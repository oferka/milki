package org.ok.milki.metadata.ui.main;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

import javax.validation.constraints.NotNull;

@CssImport("./styles/views/main/main-view-header.css")
public class MainViewHeader extends HorizontalLayout {

    private final MainViewDrawerToggle mainViewDrawerToggle;
    private final MainViewTitle mainViewTitle;
    private final MainViewAvatar mainViewAvatar;

    public MainViewHeader() {
        setId("main-view-header");
        getThemeList().set("dark", true);
        setWidthFull();
        setSpacing(false);
        setAlignItems(FlexComponent.Alignment.CENTER);

        mainViewDrawerToggle = new MainViewDrawerToggle();
        add(mainViewDrawerToggle);

        mainViewTitle = new MainViewTitle();
        add(mainViewTitle);

        mainViewAvatar = new MainViewAvatar();
        add(mainViewAvatar);
    }

    public void setTitleText(@NotNull String titleText) {
        mainViewTitle.setTitleText(titleText);
    }
}
