package org.ok.milki.metadata.ui.main;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ComponentUtil;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.icon.IconFactory;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.tabs.Tab;

@CssImport("./styles/views/main/main-view-tab.css")
public class MainViewTab extends Tab {

    public static String ID_SUFFIX = "-tab";

    private final MainViewTabRouterLink mainViewTabRouterLink;

    public MainViewTab(String viewId, String text, Class<? extends Component> navigationTarget, VaadinIcon vaadinIcon) {
        String id = viewId + ID_SUFFIX;
        setId(id);
        mainViewTabRouterLink = new MainViewTabRouterLink(id, text, navigationTarget, vaadinIcon);
        add(mainViewTabRouterLink);
        ComponentUtil.setData(this, Class.class, navigationTarget);
    }
}
