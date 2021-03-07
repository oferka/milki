package org.ok.milki.metadata.ui.main;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Image;

import static org.ok.milki.metadata.ui.Styles.CSS_FILE_EXTENSION;
import static org.ok.milki.metadata.ui.Styles.STYLES_FOLDER;

@CssImport(STYLES_FOLDER + "main/main-view-drawer-header-image" + CSS_FILE_EXTENSION)
public class MainViewDrawerHeaderImage extends Image {

    public MainViewDrawerHeaderImage() {
        setId("main-view-drawer-header-image");

        setSrc("images/logo.png");
        setAlt("DevForce logo");
    }
}
