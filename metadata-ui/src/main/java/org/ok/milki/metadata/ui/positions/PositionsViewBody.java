package org.ok.milki.metadata.ui.positions;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.dependency.CssImport;
import org.ok.milki.metadata.ui.entities.EntitiesViewBody;

@CssImport("./styles/views/positions/positions-view-body.css")
public class PositionsViewBody extends EntitiesViewBody {

    public PositionsViewBody(String idPrefix, String entityName) {
        super(idPrefix, entityName);
        add(new Text("positions new"));
    }
}
