package org.ok.milki.metadata.ui.main;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.IconFactory;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

@CssImport("./styles/views/main/main-view-tab-router-link-content.css")
public class MainViewTabRouterLinkContent extends HorizontalLayout {

    public static String ID_SUFFIX = "-content";

    public MainViewTabRouterLinkContent(String mainViewTabRouterLinkId, String text, VaadinIcon vaadinIcon) {
        setId(mainViewTabRouterLinkId + ID_SUFFIX);

        Span span = new Span(text);
        Icon icon = new Icon(vaadinIcon);
        add(icon, span);
        setVerticalComponentAlignment(FlexComponent.Alignment.CENTER, icon, span);
    }
}
