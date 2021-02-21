package org.ok.milki.metadata.ui.teams;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

@CssImport("./styles/views/teams/teams-view-body.css")
public class TeamsViewBody extends VerticalLayout {

    public TeamsViewBody() {
        setId("teams-view-body");
        add(new Text("teams new"));
    }
}
