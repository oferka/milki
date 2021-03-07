package org.ok.milki.metadata.ui.main;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.router.RouterLink;

import static org.ok.milki.metadata.ui.Styles.CSS_FILE_EXTENSION;
import static org.ok.milki.metadata.ui.Styles.STYLES_FOLDER;

@CssImport(STYLES_FOLDER + "main/main-view-tab-router-link" + CSS_FILE_EXTENSION)
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
