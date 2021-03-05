package org.ok.milki.metadata.ui.teams;

import com.vaadin.flow.component.dependency.CssImport;
import org.ok.milki.metadata.ui.entity.EntityViewBody;

import static org.ok.milki.metadata.ui.EntityType.TEAM;

@CssImport("./styles/views/teams/team-view-body.css")
public class TeamViewBody extends EntityViewBody {

    public TeamViewBody() {
        super(TEAM);
    }
}
