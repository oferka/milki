package org.ok.milki.metadata.ui.positions;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.router.RouterLink;
import org.ok.milki.metadata.ui.main.EntityComponent;

@CssImport("./styles/views/positions/position-view-body.css")
public class PositionViewBody extends EntityComponent {

    private final Label idLabel;

    public PositionViewBody() {
        setId("position-view-body");
        add(new RouterLink("positions", PositionsView.class));
        idLabel = new Label("something meaningless");
        add(idLabel);
    }

    @Override
    public void selectedEntityChanged(String selectedEntityId) {
        idLabel.setText(selectedEntityId);
    }
}
