package org.ok.milki.metadata.ui.tools;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.router.RouterLink;
import org.ok.milki.metadata.ui.main.EntityComponent;
import org.ok.milki.metadata.ui.tenants.TenantsView;

@CssImport("./styles/views/tools/tool-view-body.css")
public class ToolViewBody extends EntityComponent {

    private final Label idLabel;

    public ToolViewBody() {
        setId("tool-view-body");
        add(new RouterLink("tools", ToolsView.class));
        idLabel = new Label("something meaningless");
        add(idLabel);
    }

    @Override
    public void selectedEntityChanged(String selectedEntityId) {
        idLabel.setText(selectedEntityId);
    }
}
