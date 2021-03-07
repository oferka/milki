package org.ok.milki.metadata.ui.main;

import com.vaadin.flow.component.applayout.DrawerToggle;
import com.vaadin.flow.component.dependency.CssImport;

import static org.ok.milki.metadata.ui.Styles.CSS_FILE_EXTENSION;
import static org.ok.milki.metadata.ui.Styles.STYLES_FOLDER;
import static org.ok.milki.metadata.ui.main.MainView.VIEW_ID_PREFIX;
import static org.ok.milki.metadata.ui.main.MainViewDrawerToggle.VIEW_ID_SUFFIX;

@CssImport(STYLES_FOLDER + VIEW_ID_PREFIX + "/" + VIEW_ID_SUFFIX + CSS_FILE_EXTENSION)
public class MainViewDrawerToggle extends DrawerToggle {

    public static final String VIEW_ID_SUFFIX = "main-view-drawer-toggle";

    public MainViewDrawerToggle() {
        setId(VIEW_ID_SUFFIX);
    }
}
