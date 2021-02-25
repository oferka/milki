package org.ok.milki.metadata.ui.tools;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.RouterLink;

import static java.lang.String.valueOf;

@CssImport("./styles/views/tools/tools-view-body.css")
public class ToolsViewBody extends VerticalLayout {

    public ToolsViewBody() {
        setId("tools-view-body");
        addClassName("tools-view-body");

        for (int i = 1; i <= 10; i++) {
            add(new RouterLink("tool " + i, ToolView.class, valueOf(i)));
        }
    }
}
