package org.ok.milki.metadata.ui.teams;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.ok.milki.metadata.ui.entity.EntityView;
import org.ok.milki.metadata.ui.main.EntityViewBody;
import org.ok.milki.metadata.ui.main.MainView;

import static com.vaadin.flow.component.icon.VaadinIcon.GROUP;
import static org.ok.milki.metadata.ui.teams.TeamView.ROUTE;
import static org.ok.milki.metadata.ui.teams.TeamView.VIEW_NAME;

@Route(value = ROUTE, layout = MainView.class)
@PageTitle(VIEW_NAME)
@CssImport("./styles/views/"+ ROUTE + "/" + "team-view.css")
public class TeamView extends EntityView {

    public static final String ROUTE = "teams";
    public static final String ID_PREFIX = "team";
    public static final String VIEW_NAME = "Teams";
    public static final String ENTITY_NAME = "Team";
    public static final String VIEW_DESCRIPTION ="Team view description";
    public static final VaadinIcon VIEW_ICON = GROUP;

    @Override
    protected String getIdPrefix() {
        return ID_PREFIX;
    }

    @Override
    protected String getViewName() {
        return VIEW_NAME;
    }

    @Override
    protected String getViewDescription() {
        return VIEW_DESCRIPTION;
    }

    @Override
    protected VaadinIcon getViewIcon() {
        return VIEW_ICON;
    }

    @Override
    protected String getEntityName() {
        return VIEW_NAME;
    }

    @Override
    protected EntityViewBody getViewBody() {
        return new TeamViewBody();
    }
}
