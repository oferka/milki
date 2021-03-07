package org.ok.milki.metadata.ui.teams;

import com.vaadin.flow.component.dependency.CssImport;
import org.ok.milki.metadata.ui.entity.EntityViewBody;

import static org.ok.milki.metadata.ui.EntityType.TEAM;
import static org.ok.milki.metadata.ui.Styles.CSS_FILE_EXTENSION;
import static org.ok.milki.metadata.ui.Styles.STYLES_FOLDER;
import static org.ok.milki.metadata.ui.teams.TeamView.TEAM_ID_PREFIX;
import static org.ok.milki.metadata.ui.teams.TeamsView.TEAMS_ID_PREFIX;

@CssImport(STYLES_FOLDER + TEAMS_ID_PREFIX + "/" + TEAM_ID_PREFIX + "-view-body" + CSS_FILE_EXTENSION)
public class TeamViewBody extends EntityViewBody {

    public TeamViewBody() {
        super(TEAM);
    }
}
