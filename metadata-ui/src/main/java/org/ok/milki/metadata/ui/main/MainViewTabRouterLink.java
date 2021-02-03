package org.ok.milki.metadata.ui.main;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.RouterLink;

@CssImport("./styles/views/main/main-view-tab-router-link.css")
public class MainViewTabRouterLink extends RouterLink {

    public static String ID_SUFFIX = "-router-link";

    public MainViewTabRouterLink(String mainViewTabId, String text, Class<? extends Component> navigationTarget, Icon icon) {
        setId(mainViewTabId + ID_SUFFIX);
        setRoute(navigationTarget);

        HorizontalLayout content = new HorizontalLayout();
        icon.setSize("24px");
        Span span = new Span(text);
        content.add(icon, span);
        content.setVerticalComponentAlignment(FlexComponent.Alignment.CENTER, icon, span);
        add(content);
    }
}
