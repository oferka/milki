package org.ok.milki.metadata.ui.teams;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.ok.milki.metadata.data.EntityDataProvider;
import org.ok.milki.metadata.ui.EntityType;
import org.ok.milki.metadata.ui.entities.EntitiesView;
import org.ok.milki.metadata.ui.entities.EntitiesViewBody;
import org.ok.milki.metadata.ui.main.MainView;

import static org.ok.milki.metadata.ui.EntityType.TEAM;
import static org.ok.milki.metadata.ui.Styles.CSS_FILE_EXTENSION;
import static org.ok.milki.metadata.ui.Styles.STYLES_FOLDER;
import static org.ok.milki.metadata.ui.teams.TeamsView.*;

@Route(value = TEAMS_ROUTE, layout = MainView.class)
@PageTitle(TEAMS_VIEW_NAME)
@CssImport(STYLES_FOLDER + TEAMS_ID_PREFIX + "/" + TEAMS_ID_PREFIX + VIEW_ID_SUFFIX + CSS_FILE_EXTENSION)
public class TeamsView extends EntitiesView {

    public static final String TEAMS_ROUTE = "teams";
    public static final String TEAMS_VIEW_NAME = "Teams";
    public static final String TEAMS_ID_PREFIX = "teams";

    public TeamsView(EntityDataProvider entityDataProvider) {
        super(entityDataProvider);
    }

    @Override
    protected EntityType getEntityType() {
        return TEAM;
    }

    @Override
    protected EntitiesViewBody getViewBody() {
        return new TeamsViewBody();
    }
}
