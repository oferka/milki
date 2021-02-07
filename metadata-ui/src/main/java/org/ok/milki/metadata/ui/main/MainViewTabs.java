package org.ok.milki.metadata.ui.main;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ComponentUtil;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.component.tabs.Tabs;
import com.vaadin.flow.component.tabs.TabsVariant;
import org.ok.milki.metadata.ui.accounts.AccountsView;
import org.ok.milki.metadata.ui.feed.FeedView;
import org.ok.milki.metadata.ui.hello.HelloView;
import org.ok.milki.metadata.ui.home.HomeView;
import org.ok.milki.metadata.ui.products.ProductsView;
import org.ok.milki.metadata.ui.services.ServicesView;
import org.ok.milki.metadata.ui.tenants.TenantsView;

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
                new MainViewTab(FeedView.VIEW_ID, FeedView.VIEW_NAME, FeedView.class, FeedView.VIEW_ICON),
                new MainViewTab(TenantsView.VIEW_ID, TenantsView.VIEW_NAME, TenantsView.class, TenantsView.VIEW_ICON),
                new MainViewTab(AccountsView.VIEW_ID, AccountsView.VIEW_NAME, AccountsView.class, AccountsView.VIEW_ICON),
                new MainViewTab(ProductsView.VIEW_ID, ProductsView.VIEW_NAME, ProductsView.class, ProductsView.VIEW_ICON),
                new MainViewTab(ServicesView.VIEW_ID, ServicesView.VIEW_NAME, ServicesView.class, ServicesView.VIEW_ICON),
                new MainViewTab(HelloView.VIEW_ID, HelloView.VIEW_NAME, HelloView.class, HelloView.VIEW_ICON)
        };
    }

    public void selectTab(Component content) {
        getTabForComponent(content).ifPresent(this::setSelectedTab);
    }

    private Optional<Tab> getTabForComponent(Component content) {
        return getChildren().filter(tab -> ComponentUtil.getData(tab, Class.class).equals(content.getClass())).findFirst().map(Tab.class::cast);
    }
}
