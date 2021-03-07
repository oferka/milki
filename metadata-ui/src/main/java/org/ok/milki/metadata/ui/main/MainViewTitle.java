package org.ok.milki.metadata.ui.main;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.H1;

import javax.validation.constraints.NotNull;

import static org.ok.milki.metadata.ui.Styles.CSS_FILE_EXTENSION;
import static org.ok.milki.metadata.ui.Styles.STYLES_FOLDER;

@CssImport(STYLES_FOLDER + "main/main-view-title" + CSS_FILE_EXTENSION)
public class MainViewTitle extends H1 {

    public MainViewTitle() {
        setId("main-view-title");
    }

    public void setTitleText(@NotNull String titleText) {
        setText(titleText);
    }
}
