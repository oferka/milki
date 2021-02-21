package org.ok.milki.metadata.ui.tools;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.RouterLink;

@CssImport("./styles/views/tools/tools-view-body.css")
public class ToolsViewBody extends VerticalLayout {

    public ToolsViewBody() {
        setId("tools-view-body");
        RouterLink tool1 = new RouterLink("tool 1", ToolView.class, "1");
        RouterLink tool2 = new RouterLink("tool 2", ToolView.class, "2");
        RouterLink tool3 = new RouterLink("tool 3", ToolView.class, "3");
        RouterLink tool4 = new RouterLink("tool 4", ToolView.class, "4");
        RouterLink tool5 = new RouterLink("tool 5", ToolView.class, "5");
        add(tool1, tool2, tool3, tool4, tool5);
    }
}
