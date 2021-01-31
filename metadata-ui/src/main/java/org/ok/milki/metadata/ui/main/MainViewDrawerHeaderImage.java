package org.ok.milki.metadata.ui.main;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Image;

@CssImport("./styles/views/main/main-view-drawer-header-image.css")
public class MainViewDrawerHeaderImage extends Image {

    public MainViewDrawerHeaderImage() {
        setId("main-view-drawer-header-image");

        setSrc("images/logo.png");
        setAlt("DevForce logo");
    }
}
