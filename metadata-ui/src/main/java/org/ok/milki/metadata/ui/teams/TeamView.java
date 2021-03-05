package org.ok.milki.metadata.ui.teams;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.ok.milki.metadata.ui.EntityType;
import org.ok.milki.metadata.ui.entity.EntityView;
import org.ok.milki.metadata.ui.entity.EntityViewBody;
import org.ok.milki.metadata.ui.main.MainView;

import static org.ok.milki.metadata.ui.EntityType.TEAM;
import static org.ok.milki.metadata.ui.teams.TeamView.ROUTE;
import static org.ok.milki.metadata.ui.teams.TeamView.VIEW_NAME;

@Route(value = ROUTE, layout = MainView.class)
@PageTitle(VIEW_NAME)
@CssImport("./styles/views/"+ ROUTE + "/" + "team-view.css")
public class TeamView extends EntityView {

    public static final String ROUTE = "teams";
    public static final String VIEW_NAME = "Teams";

    @Override
    protected EntityType getEntityType() {
        return TEAM;
    }

    @Override
    protected EntityViewBody getViewBody() {
        return new TeamViewBody();
    }
}
