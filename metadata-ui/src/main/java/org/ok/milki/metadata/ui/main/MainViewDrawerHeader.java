package org.ok.milki.metadata.ui.main;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

@CssImport("./styles/views/main/main-view-drawer-header.css")
public class MainViewDrawerHeader extends HorizontalLayout {

    private final MainViewDrawerHeaderImage mainViewDrawerHeaderImage;

    public MainViewDrawerHeader() {
        setId("main-view-drawer-header");
        setAlignItems(FlexComponent.Alignment.CENTER);

        mainViewDrawerHeaderImage = new MainViewDrawerHeaderImage();
        add(mainViewDrawerHeaderImage);

        add(new H1("My Project"));
    }
}
