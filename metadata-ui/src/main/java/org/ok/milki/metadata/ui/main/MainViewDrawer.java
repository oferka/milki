package org.ok.milki.metadata.ui.main;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import static org.ok.milki.metadata.ui.Styles.STYLES_FOLDER;

@CssImport(STYLES_FOLDER + "main/main-view-drawer.css")
public class MainViewDrawer extends VerticalLayout {

    private final MainViewDrawerHeader mainViewDrawerHeader;
    private final MainViewTabs mainViewTabs;

    public MainViewDrawer() {
        setId("main-view-drawer");

        getThemeList().set("dark", true);
        setSizeFull();
        setPadding(false);
        setSpacing(false);
        setAlignItems(FlexComponent.Alignment.STRETCH);

        mainViewTabs = new MainViewTabs();
        mainViewDrawerHeader = new MainViewDrawerHeader();

        add(mainViewDrawerHeader, mainViewTabs);
    }

    public void selectTab(Component content) {
        mainViewTabs.selectTab(content);
    }
}
