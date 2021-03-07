package org.ok.milki.metadata.ui.teams;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.ok.milki.metadata.ui.EntityType;
import org.ok.milki.metadata.ui.entity.EntityView;
import org.ok.milki.metadata.ui.entity.EntityViewBody;
import org.ok.milki.metadata.ui.main.MainView;

import static org.ok.milki.metadata.ui.EntityType.TEAM;
import static org.ok.milki.metadata.ui.Styles.CSS_FILE_EXTENSION;
import static org.ok.milki.metadata.ui.Styles.STYLES_FOLDER;
import static org.ok.milki.metadata.ui.teams.TeamView.*;
import static org.ok.milki.metadata.ui.teams.TeamsView.TEAMS_ID_PREFIX;
import static org.ok.milki.metadata.ui.teams.TeamsView.TEAMS_ROUTE;

@Route(value = TEAMS_ROUTE, layout = MainView.class)
@PageTitle(TEAM_VIEW_NAME)
@CssImport(STYLES_FOLDER + TEAMS_ID_PREFIX + "/" + TEAM_ID_PREFIX + VIEW_ID_SUFFIX + CSS_FILE_EXTENSION)
public class TeamView extends EntityView {

    public static final String TEAM_VIEW_NAME = "Team";
    public static final String TEAM_ID_PREFIX = "team";

    @Override
    protected EntityType getEntityType() {
        return TEAM;
    }

    @Override
    protected EntityViewBody getViewBody() {
        return new TeamViewBody();
    }
}
