package org.ok.milki.metadata.ui.main;

import com.vaadin.flow.component.avatar.Avatar;
import com.vaadin.flow.component.dependency.CssImport;

@CssImport("./styles/views/main/main-view-avatar.css")
public class MainViewAvatar extends Avatar {

    public MainViewAvatar() {
        setId("main-view-avatar");

        setImage("images/Ofer Karp.png");
        setName("Ofer Karp");
    }
}
