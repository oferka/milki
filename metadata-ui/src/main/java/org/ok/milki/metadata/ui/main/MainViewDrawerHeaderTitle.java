package org.ok.milki.metadata.ui.main;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.H1;

import static org.ok.milki.metadata.ui.Styles.STYLES_FOLDER;

@CssImport(STYLES_FOLDER + "main/main-view-drawer-header-title.css")
public class MainViewDrawerHeaderTitle extends H1 {

    public MainViewDrawerHeaderTitle() {
        setId("main-view-drawer-header-title");
        setText("DevForce");
    }
}
