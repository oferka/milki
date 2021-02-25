package org.ok.milki.metadata.ui.tools;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.RouterLink;

@CssImport("./styles/views/tools/tool-view-body.css")
public class ToolViewBody extends VerticalLayout {

    public ToolViewBody() {
        setId("tool-view-body");
        add(new RouterLink("tools", ToolsView.class));
    }
}
