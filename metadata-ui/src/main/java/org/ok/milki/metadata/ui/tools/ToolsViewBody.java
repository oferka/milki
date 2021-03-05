package org.ok.milki.metadata.ui.tools;

import com.vaadin.flow.component.dependency.CssImport;
import org.ok.milki.metadata.ui.entities.EntitiesViewBody;

import static org.ok.milki.metadata.ui.EntityType.TOOL;

@CssImport("./styles/views/tools/tools-view-body.css")
public class ToolsViewBody extends EntitiesViewBody {

    public ToolsViewBody() {
        super(TOOL);
    }
}
