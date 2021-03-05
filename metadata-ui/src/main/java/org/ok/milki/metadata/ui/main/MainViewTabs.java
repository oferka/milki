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

@CssImport("./styles/views/main/main-view-tabs.css")
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
                new MainViewTab(TENANT.getRoute(), TENANT.getEntitiesViewName(), TENANT.getEntitiesViewClass(), TENANT.getEntitiesViewIcon()),
                new MainViewTab(ACCOUNT.getRoute(), ACCOUNT.getEntitiesViewName(), ACCOUNT.getEntitiesViewClass(), ACCOUNT.getEntitiesViewIcon()),
                new MainViewTab(PRODUCT.getRoute(), PRODUCT.getEntitiesViewName(), PRODUCT.getEntitiesViewClass(), PRODUCT.getEntitiesViewIcon()),
                new MainViewTab(SERVICE.getRoute(), SERVICE.getEntitiesViewName(), SERVICE.getEntitiesViewClass(), SERVICE.getEntitiesViewIcon()),
                new MainViewTab(REPOSITORY.getRoute(), REPOSITORY.getEntitiesViewName(), REPOSITORY.getEntitiesViewClass(), REPOSITORY.getEntitiesViewIcon()),
                new MainViewTab(TEAM.getRoute(), TEAM.getEntitiesViewName(), TEAM.getEntitiesViewClass(), TEAM.getEntitiesViewIcon()),
                new MainViewTab(EMPLOYEE.getRoute(), EMPLOYEE.getEntitiesViewName(), EMPLOYEE.getEntitiesViewClass(), EMPLOYEE.getEntitiesViewIcon()),
                new MainViewTab(POSITION.getRoute(), POSITION.getEntitiesViewName(), POSITION.getEntitiesViewClass(), POSITION.getEntitiesViewIcon()),
                new MainViewTab(INTERVIEW.getRoute(), INTERVIEW.getEntitiesViewName(), INTERVIEW.getEntitiesViewClass(), INTERVIEW.getEntitiesViewIcon()),
                new MainViewTab(TOOL.getRoute(), TOOL.getEntitiesViewName(), TOOL.getEntitiesViewClass(), TOOL.getEntitiesViewIcon())
        };
    }

    public void selectTab(Component content) {
        getTabForComponent(content).ifPresent(this::setSelectedTab);
    }

    private Optional<Tab> getTabForComponent(Component content) {
        return getChildren().filter(tab -> ComponentUtil.getData(tab, Class.class).equals(content.getClass())).findFirst().map(Tab.class::cast);
    }
}
