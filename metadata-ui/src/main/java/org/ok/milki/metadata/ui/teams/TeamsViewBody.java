package org.ok.milki.metadata.ui.teams;

import com.vaadin.flow.component.dependency.CssImport;
import org.ok.milki.metadata.ui.entities.EntitiesViewBody;

import static org.ok.milki.metadata.ui.EntityType.TEAM;
import static org.ok.milki.metadata.ui.Styles.CSS_FILE_EXTENSION;
import static org.ok.milki.metadata.ui.Styles.STYLES_FOLDER;
import static org.ok.milki.metadata.ui.teams.TeamsView.TEAMS_ID_PREFIX;

@CssImport(STYLES_FOLDER + TEAMS_ID_PREFIX + "/" + TEAMS_ID_PREFIX + "-view-body" + CSS_FILE_EXTENSION)
public class TeamsViewBody extends EntitiesViewBody {

    public TeamsViewBody() {
        super(TEAM);
    }
}
