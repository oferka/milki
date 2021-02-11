package org.ok.milki.metadata.ui.main;

import com.vaadin.flow.component.avatar.Avatar;
import com.vaadin.flow.component.dependency.CssImport;

@CssImport("./styles/views/main/main-view-user-avatar.css")
public class MainViewUserAvatar extends Avatar {

    public MainViewUserAvatar() {
        setId("main-view-user-avatar");

        setImage("images/Ofer Karp.png");
        setName("Ofer Karp");
    }
}
