package org.ok.milki.metadata.ui.main;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ComponentUtil;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.component.tabs.Tabs;
import com.vaadin.flow.component.tabs.TabsVariant;
import org.ok.milki.metadata.ui.about.AboutView;
import org.ok.milki.metadata.ui.hello.HelloView;
import org.ok.milki.metadata.ui.home.HomeView;

import java.util.Optional;

@CssImport("./styles/views/main/main-view-tabs.css")
public class MainViewTabs extends Tabs {

    public MainViewTabs() {
        setId("main-view-tabs");
        setOrientation(Tabs.Orientation.VERTICAL);
        addThemeVariants(TabsVariant.LUMO_MINIMAL);
        add(createTabs());
    }

    private Component[] createTabs() {
        return new Tab[] {
                new MainViewTab(HomeView.VIEW_ID, HomeView.VIEW_NAME, HomeView.class, HomeView.VIEW_ICON),
                new MainViewTab(HelloView.VIEW_ID, HelloView.VIEW_NAME, HelloView.class, HelloView.VIEW_ICON),
                new MainViewTab(AboutView.VIEW_ID, AboutView.VIEW_NAME, AboutView.class, AboutView.VIEW_ICON)
        };
    }

    public void selectTab(Component content) {
        getTabForComponent(content).ifPresent(this::setSelectedTab);
    }

    private Optional<Tab> getTabForComponent(Component content) {
        return getChildren().filter(tab -> ComponentUtil.getData(tab, Class.class).equals(content.getClass())).findFirst().map(Tab.class::cast);
    }
}
