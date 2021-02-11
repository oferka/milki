package org.ok.milki.metadata.ui.main;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

@CssImport("./styles/views/main/main-view-user-panel.css")
public class MainViewUserPanel extends HorizontalLayout {

    private final MainViewUserAvatar mainViewUserAvatar;

    public MainViewUserPanel() {
        setId("main-view-user-panel");

        mainViewUserAvatar = new MainViewUserAvatar();
        add(mainViewUserAvatar);
    }
}
