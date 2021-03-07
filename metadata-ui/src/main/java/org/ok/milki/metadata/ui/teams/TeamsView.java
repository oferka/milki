package org.ok.milki.metadata.ui.teams;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.ok.milki.metadata.ui.EntityType;
import org.ok.milki.metadata.ui.entities.EntitiesView;
import org.ok.milki.metadata.ui.entities.EntitiesViewBody;
import org.ok.milki.metadata.ui.main.MainView;

import static org.ok.milki.metadata.ui.EntityType.TEAM;
import static org.ok.milki.metadata.ui.Styles.CSS_FILE_EXTENSION;
import static org.ok.milki.metadata.ui.Styles.STYLES_FOLDER;
import static org.ok.milki.metadata.ui.teams.TeamsView.*;

@Route(value = ROUTE, layout = MainView.class)
@PageTitle(VIEW_NAME)
@CssImport(STYLES_FOLDER + ROUTE + "/" + ID_PREFIX + VIEW_ID_SUFFIX + CSS_FILE_EXTENSION)
public class TeamsView extends EntitiesView {

    public static final String ROUTE = "teams";
    public static final String VIEW_NAME = "Teams";
    public static final String ID_PREFIX = "teams";

    @Override
    protected EntityType getEntityType() {
        return TEAM;
    }

    @Override
    protected EntitiesViewBody getViewBody() {
        return new TeamsViewBody();
    }
}
