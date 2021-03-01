package org.ok.milki.metadata.ui.tools;

import com.vaadin.flow.component.dependency.CssImport;
import org.ok.milki.metadata.ui.entities.EntitiesViewBody;

@CssImport("./styles/views/tools/tools-view-body.css")
public class ToolsViewBody extends EntitiesViewBody {

    public ToolsViewBody(String idPrefix, String entityName) {
        super(idPrefix, entityName);
    }
}
