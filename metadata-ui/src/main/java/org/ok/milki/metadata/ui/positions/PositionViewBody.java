package org.ok.milki.metadata.ui.positions;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.router.RouterLink;
import org.ok.milki.metadata.ui.entity.EntityViewBody;

@CssImport("./styles/views/positions/position-view-body.css")
public class PositionViewBody extends EntityViewBody {

    public PositionViewBody(String idPrefix, String entitiesViewName) {
        super(idPrefix, entitiesViewName);
        add(new RouterLink("positions", PositionsView.class));
    }

    @Override
    public void selectedEntityChanged(String selectedEntityId) {
        selectedIdLabel.setText(selectedEntityId);
    }
}
