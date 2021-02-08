package org.ok.milki.metadata.ui.teams;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.ok.milki.metadata.ui.entities.EntitiesView;
import org.ok.milki.metadata.ui.main.MainView;

import static org.ok.milki.metadata.ui.teams.TeamsView.ROUTE;
import static org.ok.milki.metadata.ui.teams.TeamsView.VIEW_NAME;

@Route(value = ROUTE, layout = MainView.class)
@PageTitle(VIEW_NAME)
@CssImport("./styles/views/"+ ROUTE + "/" + ROUTE + "-view.css")
public class TeamsView extends EntitiesView {

    public static final String ROUTE = "teams";
    public static final String VIEW_NAME = "Teams";
    public static final String ENTITY_NAME ="Team";
    public static final Icon VIEW_ICON = VaadinIcon.GROUP.create();

    @Override
    public String getIdPrefix() {
        return ROUTE;
    }

    @Override
    public String getViewName() {
        return VIEW_NAME;
    }

    @Override
    public String getEntityName() {
        return ENTITY_NAME;
    }
}
