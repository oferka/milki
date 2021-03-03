package org.ok.milki.metadata.ui.teams;

import com.vaadin.flow.component.dependency.CssImport;
import org.ok.milki.metadata.ui.entities.EntitiesView;
import org.ok.milki.metadata.ui.entity.EntityViewBody;

@CssImport("./styles/views/teams/team-view-body.css")
public class TeamViewBody extends EntityViewBody {

    public TeamViewBody(String idPrefix, String entitiesViewName, Class<? extends EntitiesView> entitiesNavigationTarget) {
        super(idPrefix, entitiesViewName, entitiesNavigationTarget);
    }
}
