package org.ok.milki.metadata.ui.main;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ComponentUtil;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.component.tabs.Tabs;
import com.vaadin.flow.component.tabs.TabsVariant;
import com.vaadin.flow.router.RouterLink;

import java.util.Optional;

@CssImport("./styles/views/main/main-view-drawer.css")
public class MainViewDrawer extends VerticalLayout {

    private final Tabs menu;

    public MainViewDrawer() {
        setId("main-view-drawer");

        setSizeFull();
        setPadding(false);
        setSpacing(false);
        getThemeList().set("spacing-s", true);
        setAlignItems(FlexComponent.Alignment.STRETCH);

        menu = createMenu();

        HorizontalLayout logoLayout = new HorizontalLayout();
        logoLayout.setId("logo");
        logoLayout.setAlignItems(FlexComponent.Alignment.CENTER);
        logoLayout.add(new Image("images/logo.png", "My Project logo"));
        logoLayout.add(new H1("My Project"));

        add(logoLayout, menu);
    }

    private Tabs createMenu() {
        final Tabs tabs = new Tabs();
        tabs.setOrientation(Tabs.Orientation.VERTICAL);
        tabs.addThemeVariants(TabsVariant.LUMO_MINIMAL);
        tabs.setId("tabs");
        tabs.add(createMenuItems());
        return tabs;
    }

    private Component[] createMenuItems() {
        return new Tab[] {
                createTab("Hello World", HelloWorldView.class),
                createTab("About", AboutView.class)
        };
    }

    private Tab createTab(String text, Class<? extends Component> navigationTarget) {
        final Tab tab = new Tab();
        tab.add(new RouterLink(text, navigationTarget));
        ComponentUtil.setData(tab, Class.class, navigationTarget);
        return tab;
    }

    public void selectTab(Component content) {
        getTabForComponent(content).ifPresent(menu::setSelectedTab);
    }

    private Optional<Tab> getTabForComponent(Component content) {
        return menu.getChildren().filter(tab -> ComponentUtil.getData(tab, Class.class).equals(content.getClass())).findFirst().map(Tab.class::cast);
    }
}
