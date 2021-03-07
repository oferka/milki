package org.ok.milki.metadata.ui.main;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.router.RouterLink;

import static org.ok.milki.metadata.ui.Styles.CSS_FILE_EXTENSION;
import static org.ok.milki.metadata.ui.Styles.STYLES_FOLDER;
import static org.ok.milki.metadata.ui.main.MainView.VIEW_ID_PREFIX;
import static org.ok.milki.metadata.ui.main.MainViewTabRouterLink.VIEW_ID_SUFFIX;

@CssImport(STYLES_FOLDER + VIEW_ID_PREFIX + "/" + VIEW_ID_SUFFIX + CSS_FILE_EXTENSION)
public class MainViewTabRouterLink extends RouterLink {

    public static final String VIEW_ID_SUFFIX = "main-view-tab-router-link";
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
