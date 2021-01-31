package org.ok.milki.metadata.ui.main;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

@CssImport("./styles/views/main/main-view-drawer.css")
public class MainViewDrawer extends VerticalLayout {

    private final MainViewTabs mainViewTabs;

    public MainViewDrawer() {
        setId("main-view-drawer");

        setSizeFull();
        setPadding(false);
        setSpacing(false);
        getThemeList().set("spacing-s", true);
        setAlignItems(FlexComponent.Alignment.STRETCH);

        mainViewTabs = new MainViewTabs();

        HorizontalLayout logoLayout = new HorizontalLayout();
        logoLayout.setId("logo");
        logoLayout.setAlignItems(FlexComponent.Alignment.CENTER);
        logoLayout.add(new Image("images/logo.png", "My Project logo"));
        logoLayout.add(new H1("My Project"));

        add(logoLayout, mainViewTabs);
    }

    public void selectTab(Component content) {
        mainViewTabs.selectTab(content);
    }
}
