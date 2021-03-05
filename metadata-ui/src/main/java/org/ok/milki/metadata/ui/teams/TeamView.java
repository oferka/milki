package org.ok.milki.metadata.ui.teams;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.ok.milki.metadata.ui.entities.EntitiesView;
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
    protected String getIdPrefix() {
        return TEAM.getEntityIdPrefix();
    }

    @Override
    protected String getViewName() {
        return TEAM.getEntityViewName();
    }

    @Override
    protected String getViewDescription() {
        return TEAM.getEntityViewDescription();
    }

    @Override
    protected VaadinIcon getViewIcon() {
        return TEAM.getEntitiesViewIcon();
    }

    @Override
    protected String getEntityName() {
        return TEAM.getEntityName();
    }

    @Override
    protected EntityViewBody getViewBody() {
        return new TeamViewBody(TEAM.getEntityIdPrefix(), TEAM.getEntitiesViewName(), TEAM.getEntitiesViewClass());
    }

    @Override
    protected String getEntitiesRoute() {
        return TEAM.getRoute();
    }

    @Override
    protected Class<? extends EntitiesView> getEntitiesNavigationTarget() {
        return TEAM.getEntitiesViewClass();
    }
}
