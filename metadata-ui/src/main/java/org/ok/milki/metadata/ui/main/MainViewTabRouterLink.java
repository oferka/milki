package org.ok.milki.metadata.ui.main;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.router.RouterLink;

@CssImport("./styles/views/main/main-view-tab-router-link.css")
public class MainViewTabRouterLink extends RouterLink {

    public static String ID_SUFFIX = "-router-link";

    public MainViewTabRouterLink(String mainViewTabId, String text, Class<? extends Component> navigationTarget, Icon icon) {
        setId(mainViewTabId + ID_SUFFIX);
        setRoute(navigationTarget);
        add(icon);
        add(new Span(text));
        icon.setSize("24px");
    }
}
