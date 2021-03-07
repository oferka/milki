package org.ok.milki.metadata.ui.main;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Image;

import static org.ok.milki.metadata.ui.Styles.CSS_FILE_EXTENSION;
import static org.ok.milki.metadata.ui.Styles.STYLES_FOLDER;
import static org.ok.milki.metadata.ui.main.MainView.VIEW_ID_PREFIX;
import static org.ok.milki.metadata.ui.main.MainViewDrawerHeaderImage.VIEW_ID_SUFFIX;

@CssImport(STYLES_FOLDER + VIEW_ID_PREFIX + "/" + VIEW_ID_SUFFIX + CSS_FILE_EXTENSION)
public class MainViewDrawerHeaderImage extends Image {

    public static final String VIEW_ID_SUFFIX = "main-view-drawer-header-image";

    public MainViewDrawerHeaderImage() {
        setId(VIEW_ID_SUFFIX);

        setSrc("images/logo.png");
        setAlt("DevForce logo");
    }
}
