package org.ok.milki.metadata.ui.main;

import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.server.PWA;

@CssImport("./styles/views/main/main-view.css")
@PWA(name = "Milki", shortName = "Milki", enableInstallPrompt = false)
@JsModule("./styles/shared-styles.js")
public class MainView extends AppLayout {

    private final MainViewDrawer mainViewDrawer;
    private final MainViewHeader mainViewHeader;

    public MainView() {
        setPrimarySection(Section.DRAWER);

        mainViewHeader = new MainViewHeader();
        addToNavbar(true, mainViewHeader);

        mainViewDrawer = new MainViewDrawer();
        addToDrawer(mainViewDrawer);
    }

    @Override
    protected void afterNavigation() {
        super.afterNavigation();
        mainViewDrawer.selectTab(getContent());
        mainViewHeader.setTitleText(getCurrentPageTitle());
    }

    private String getCurrentPageTitle() {
        return getContent().getClass().getAnnotation(PageTitle.class).value();
    }
}
