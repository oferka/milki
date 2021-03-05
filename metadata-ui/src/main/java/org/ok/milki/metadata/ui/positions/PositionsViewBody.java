package org.ok.milki.metadata.ui.positions;

import com.vaadin.flow.component.dependency.CssImport;
import org.ok.milki.metadata.ui.entities.EntitiesViewBody;

import static org.ok.milki.metadata.ui.EntityType.POSITION;

@CssImport("./styles/views/positions/positions-view-body.css")
public class PositionsViewBody extends EntitiesViewBody {

    public PositionsViewBody() {
        super(POSITION);
    }
}
