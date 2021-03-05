package org.ok.milki.metadata.ui.tools;

import com.vaadin.flow.component.dependency.CssImport;
import org.ok.milki.metadata.ui.entity.EntityViewBody;

import static org.ok.milki.metadata.ui.EntityType.TOOL;

@CssImport("./styles/views/tools/tool-view-body.css")
public class ToolViewBody extends EntityViewBody {

    public ToolViewBody() {
        super(TOOL);
    }
}
