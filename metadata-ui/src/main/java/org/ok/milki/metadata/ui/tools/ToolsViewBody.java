package org.ok.milki.metadata.ui.tools;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

@CssImport("./styles/views/tools/tools-view-body.css")
public class ToolsViewBody extends VerticalLayout {

    public ToolsViewBody() {
        setId("tools-view-body");
        add(new Text("tools new"));
    }
}
