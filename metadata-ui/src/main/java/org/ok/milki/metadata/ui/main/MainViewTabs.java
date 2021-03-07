package org.ok.milki.metadata.ui.main;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ComponentUtil;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.component.tabs.Tabs;
import com.vaadin.flow.component.tabs.TabsVariant;
import org.ok.milki.metadata.ui.feed.FeedView;
import org.ok.milki.metadata.ui.home.HomeView;

import java.util.Optional;

import static org.ok.milki.metadata.ui.EntityType.*;
import static org.ok.milki.metadata.ui.Styles.STYLES_FOLDER;

@CssImport(STYLES_FOLDER + "main/main-view-tabs.css")
public class MainViewTabs extends Tabs {

    public MainViewTabs() {
        setId("main-view-tabs");
        setOrientation(Tabs.Orientation.VERTICAL);
        addThemeVariants(TabsVariant.LUMO_MINIMAL);
        add(createTabs());
    }

    private Component[] createTabs() {
        return new Component[] {
                new MainViewTab(HomeView.VIEW_ID, HomeView.VIEW_NAME, HomeView.class, HomeView.VIEW_ICON),
                new MainViewTab(FeedView.VIEW_ID, FeedView.VIEW_NAME, FeedView.class, FeedView.VIEW_ICON),
                new MainViewTab(TENANT),
                new MainViewTab(ACCOUNT),
                new MainViewTab(PRODUCT),
                new MainViewTab(SERVICE),
                new MainViewTab(REPOSITORY),
                new MainViewTab(TEAM),
                new MainViewTab(EMPLOYEE),
                new MainViewTab(POSITION),
                new MainViewTab(INTERVIEW),
                new MainViewTab(TOOL)
        };
    }

    public void selectTab(Component content) {
        getTabForComponent(content).ifPresent(this::setSelectedTab);
    }

    private Optional<Tab> getTabForComponent(Component content) {
        return getChildren().filter(tab -> ComponentUtil.getData(tab, Class.class).equals(content.getClass())).findFirst().map(Tab.class::cast);
    }
}
