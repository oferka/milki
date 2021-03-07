package org.ok.milki.metadata.ui.main;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

import static com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment.CENTER;
import static org.ok.milki.metadata.ui.Styles.CSS_FILE_EXTENSION;
import static org.ok.milki.metadata.ui.Styles.STYLES_FOLDER;
import static org.ok.milki.metadata.ui.main.MainView.VIEW_ID_PREFIX;
import static org.ok.milki.metadata.ui.main.MainViewDrawerHeader.VIEW_ID_SUFFIX;

@CssImport(STYLES_FOLDER + VIEW_ID_PREFIX + "/" + VIEW_ID_SUFFIX + CSS_FILE_EXTENSION)
public class MainViewDrawerHeader extends HorizontalLayout {

    public static final String VIEW_ID_SUFFIX = "main-view-drawer-header";

    private final MainViewDrawerHeaderImage mainViewDrawerHeaderImage;
    private final MainViewDrawerHeaderTitle mainViewDrawerHeaderTitle;

    public MainViewDrawerHeader() {
        setId(VIEW_ID_SUFFIX);
        setAlignItems(CENTER);

        mainViewDrawerHeaderImage = new MainViewDrawerHeaderImage();
        add(mainViewDrawerHeaderImage);

        mainViewDrawerHeaderTitle = new MainViewDrawerHeaderTitle();
        add(mainViewDrawerHeaderTitle);
    }
}
