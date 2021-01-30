package org.ok.milki.metadata.ui.main;

import com.vaadin.flow.component.applayout.DrawerToggle;
import com.vaadin.flow.component.avatar.Avatar;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

import javax.validation.constraints.NotNull;

public class MainViewHeader extends HorizontalLayout {

    private final H1 viewTitle;

    public MainViewHeader() {
        setId("header");
        getThemeList().set("dark", true);
        setWidthFull();
        setSpacing(false);
        setAlignItems(FlexComponent.Alignment.CENTER);
        add(new DrawerToggle());
        viewTitle = new H1();
        add(viewTitle);
        add(new Avatar());
    }

    public void setViewTitleText(@NotNull String viewTitleText) {
        viewTitle.setText(viewTitleText);
    }
}
