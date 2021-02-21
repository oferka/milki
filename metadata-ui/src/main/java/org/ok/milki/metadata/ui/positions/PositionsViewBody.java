package org.ok.milki.metadata.ui.positions;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

@CssImport("./styles/views/positions/positions-view-body.css")
public class PositionsViewBody extends VerticalLayout {

    public PositionsViewBody() {
        setId("positions-view-body");
        add(new Text("positions new"));
    }
}
