package org.ok.milki.metadata.ui.main;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ComponentUtil;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.router.RouterLink;

@CssImport("./styles/views/main/main-view-tab.css")
public class MainViewTab extends Tab {

    public MainViewTab(String id, String text, Class<? extends Component> navigationTarget, Icon icon) {
        setId(id);
        RouterLink routerLink = createRouterLink(text, navigationTarget, icon);
        add(routerLink);
        ComponentUtil.setData(this, Class.class, navigationTarget);
    }

    private RouterLink createRouterLink(String text, Class<? extends Component> navigationTarget, Icon icon) {
        final RouterLink routerLink = new RouterLink(null, navigationTarget);
        routerLink.setClassName("menu-link");
        routerLink.add(icon);
        routerLink.add(new Span(text));
        icon.setSize("24px");
        return routerLink;
    }
}
