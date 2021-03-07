package org.ok.milki.metadata.ui.main;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

import static org.ok.milki.metadata.ui.Styles.CSS_FILE_EXTENSION;
import static org.ok.milki.metadata.ui.Styles.STYLES_FOLDER;

@CssImport(STYLES_FOLDER + "main/main-view-tab-router-link-content" + CSS_FILE_EXTENSION)
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
