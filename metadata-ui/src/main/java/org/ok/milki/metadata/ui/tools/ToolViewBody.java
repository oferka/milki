package org.ok.milki.metadata.ui.tools;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.router.RouterLink;
import org.ok.milki.metadata.ui.entity.EntityViewBody;

@CssImport("./styles/views/tools/tool-view-body.css")
public class ToolViewBody extends EntityViewBody {

    public ToolViewBody(String idPrefix, String entitiesViewName) {
        super(idPrefix, entitiesViewName);
        add(new RouterLink("tools", ToolsView.class));
    }

    @Override
    public void selectedEntityChanged(String selectedEntityId) {
        selectedIdLabel.setText(selectedEntityId);
    }
}
