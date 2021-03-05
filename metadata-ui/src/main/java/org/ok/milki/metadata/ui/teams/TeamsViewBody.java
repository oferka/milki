package org.ok.milki.metadata.ui.teams;

import com.vaadin.flow.component.dependency.CssImport;
import org.ok.milki.metadata.ui.entities.EntitiesViewBody;

import static org.ok.milki.metadata.ui.EntityType.TEAM;

@CssImport("./styles/views/teams/teams-view-body.css")
public class TeamsViewBody extends EntitiesViewBody {

    public TeamsViewBody() {
        super(TEAM);
    }
}
