package org.ok.milki.metadata.ui.main;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.icon.IconFactory;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.router.RouterLink;

@CssImport("./styles/views/main/main-view-tab-router-link.css")
public class MainViewTabRouterLink extends RouterLink {

    public static String ID_SUFFIX = "-router-link";

    private final MainViewTabRouterLinkContent mainViewTabRouterLinkContent;

    public MainViewTabRouterLink(String mainViewTabId, String text, Class<? extends Component> navigationTarget, VaadinIcon vaadinIcon) {
        String id = mainViewTabId + ID_SUFFIX;
        setId(id);
        setRoute(navigationTarget);

        mainViewTabRouterLinkContent = new MainViewTabRouterLinkContent(id, text, vaadinIcon);
        add(mainViewTabRouterLinkContent);
    }
}
