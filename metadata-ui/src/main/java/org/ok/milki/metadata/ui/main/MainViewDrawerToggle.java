package org.ok.milki.metadata.ui.main;

import com.vaadin.flow.component.applayout.DrawerToggle;
import com.vaadin.flow.component.dependency.CssImport;

import static org.ok.milki.metadata.ui.Styles.CSS_FILE_EXTENSION;
import static org.ok.milki.metadata.ui.Styles.STYLES_FOLDER;

@CssImport(STYLES_FOLDER + "main/main-view-drawer-toggle" + CSS_FILE_EXTENSION)
public class MainViewDrawerToggle extends DrawerToggle {

    public MainViewDrawerToggle() {
        setId("main-view-drawer-toggle");
    }
}
