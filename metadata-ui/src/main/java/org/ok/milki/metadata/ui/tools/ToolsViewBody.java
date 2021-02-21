package org.ok.milki.metadata.ui.tools;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

@CssImport("./styles/views/tools/tools-view-body.css")
public class ToolsViewBody extends VerticalLayout {

    public ToolsViewBody() {
        setId("tools-view-body");
        Button tool1 = new Button("tool 1");
        Button tool2 = new Button("tool 2");
        Button tool3 = new Button("tool 3");
        add(tool1, tool2, tool3);
    }
}
