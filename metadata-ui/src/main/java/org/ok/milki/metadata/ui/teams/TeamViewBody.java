package org.ok.milki.metadata.ui.teams;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.router.RouterLink;
import org.ok.milki.metadata.ui.main.EntityViewBody;

@CssImport("./styles/views/teams/team-view-body.css")
public class TeamViewBody extends EntityViewBody {

    private final Label idLabel;

    public TeamViewBody(String idPrefix) {
        super(idPrefix);
        add(new RouterLink("teams", TeamsView.class));
        idLabel = new Label("something meaningless");
        add(idLabel);
    }

    @Override
    public void selectedEntityChanged(String selectedEntityId) {
        idLabel.setText(selectedEntityId);
    }
}
