package org.ok.milki.metadata.ui.teams;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.router.RouterLink;
import org.ok.milki.metadata.ui.main.EntityViewBody;

@CssImport("./styles/views/teams/team-view-body.css")
public class TeamViewBody extends EntityViewBody {

    public TeamViewBody(String idPrefix) {
        super(idPrefix);
        add(new RouterLink("teams", TeamsView.class));
    }

    @Override
    public void selectedEntityChanged(String selectedEntityId) {
        selectedIdLabel.setText(selectedEntityId);
    }
}
