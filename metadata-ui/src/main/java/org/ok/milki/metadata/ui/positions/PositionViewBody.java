package org.ok.milki.metadata.ui.positions;

import com.vaadin.flow.component.dependency.CssImport;
import org.ok.milki.metadata.ui.entity.EntityViewBody;

import static org.ok.milki.metadata.ui.EntityType.POSITION;

@CssImport("./styles/views/positions/position-view-body.css")
public class PositionViewBody extends EntityViewBody {

    public PositionViewBody() {
        super(POSITION);
    }
}
