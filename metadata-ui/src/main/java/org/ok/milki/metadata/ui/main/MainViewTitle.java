package org.ok.milki.metadata.ui.main;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.H1;

import javax.validation.constraints.NotNull;

@CssImport("./styles/views/main/main-view-title.css")
public class MainViewTitle extends H1 {

    public MainViewTitle() {
        setId("main-view-title");
    }

    public void setTitleText(@NotNull String titleText) {
        setText(titleText);
    }
}
