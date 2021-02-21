package org.ok.milki.metadata.ui.main;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

import static com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment.CENTER;

@CssImport("./styles/views/main/main-view-drawer-header.css")
public class MainViewDrawerHeader extends HorizontalLayout {

    private final MainViewDrawerHeaderImage mainViewDrawerHeaderImage;
    private final MainViewDrawerHeaderTitle mainViewDrawerHeaderTitle;

    public MainViewDrawerHeader() {
        setId("main-view-drawer-header");
        setAlignItems(CENTER);

        mainViewDrawerHeaderImage = new MainViewDrawerHeaderImage();
        add(mainViewDrawerHeaderImage);

        mainViewDrawerHeaderTitle = new MainViewDrawerHeaderTitle();
        add(mainViewDrawerHeaderTitle);
    }
}
