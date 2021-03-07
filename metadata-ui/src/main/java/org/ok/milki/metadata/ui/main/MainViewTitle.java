package org.ok.milki.metadata.ui.main;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.H1;

import javax.validation.constraints.NotNull;

import static org.ok.milki.metadata.ui.Styles.CSS_FILE_EXTENSION;
import static org.ok.milki.metadata.ui.Styles.STYLES_FOLDER;
import static org.ok.milki.metadata.ui.main.MainView.VIEW_ID_PREFIX;
import static org.ok.milki.metadata.ui.main.MainViewTitle.VIEW_ID_SUFFIX;

@CssImport(STYLES_FOLDER + VIEW_ID_PREFIX + "/" + VIEW_ID_SUFFIX + CSS_FILE_EXTENSION)
public class MainViewTitle extends H1 {

    public static final String VIEW_ID_SUFFIX = "main-view-title";

    public MainViewTitle() {
        setId(VIEW_ID_SUFFIX);
    }

    public void setTitleText(@NotNull String titleText) {
        setText(titleText);
    }
}
