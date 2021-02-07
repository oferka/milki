package org.ok.milki.metadata.ui.main;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.H1;

@CssImport("./styles/views/main/main-view-drawer-header-title.css")
public class MainViewDrawerHeaderTitle extends H1 {

    public MainViewDrawerHeaderTitle() {
        setId("main-view-drawer-header-title");
        setText("DevForce");
    }
}
