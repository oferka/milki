package org.ok.milki.metadata.ui.teams;

import com.vaadin.flow.component.dependency.CssImport;
import org.ok.milki.metadata.ui.entities.EntitiesViewBody;
import org.ok.milki.metadata.ui.entity.EntityView;

@CssImport("./styles/views/teams/teams-view-body.css")
public class TeamsViewBody extends EntitiesViewBody {

    public TeamsViewBody(String idPrefix, String entityName, Class<? extends EntityView> entityNavigationTarget) {
        super(idPrefix, entityName, entityNavigationTarget);
    }
}
