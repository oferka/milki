package org.ok.milki.metadata.ui.main;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.tabs.Tabs;

@CssImport("./styles/views/main/main-view-drawer.css")
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

        Text text = new Text("More Tabs");
        Tabs moreTabs = new MainViewTabs();

        add(mainViewDrawerHeader, mainViewTabs, text, moreTabs);
    }

    public void selectTab(Component content) {
        mainViewTabs.selectTab(content);
    }
}
